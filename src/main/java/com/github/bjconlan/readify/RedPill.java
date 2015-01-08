package com.github.bjconlan.readify;

import net.readify.knockknock.IRedPill;
import net.readify.knockknock.IRedPillFibonacciNumberArgumentOutOfRangeExceptionFaultFaultMessage;
import net.readify.knockknock.IRedPillReverseWordsArgumentNullExceptionFaultFaultMessage;
import net.readify.knockknock.TriangleType;
import org.datacontract.schemas._2004._07.system.ArgumentNullException;
import org.datacontract.schemas._2004._07.system.ArgumentOutOfRangeException;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.*;

@WebService(endpointInterface = "net.readify.knockknock.IRedPill",
            targetNamespace="http://KnockKnock.readify.net",
            portName="BasicHttpBinding_IRedPill",
            serviceName="RedPill")
public class RedPill implements IRedPill {
	private static final int MAX_FIB = 92;
	private final List<Long> fibs = new ArrayList<>();

	public RedPill() {
		// generate fib array data constants used for 'fibs' requests
		fibs.add(0, 0l);
		fibs.add(1, 1l);
		int pos = 1;
		do {
			int last = pos;
			fibs.add(++pos, fibs.get(last) + fibs.get(last - 1));
		} while (pos < MAX_FIB);
	}

	@Override
	public String whatIsYourToken() {
		return "5c201386-dcf1-4fde-9c11-fdc165dcc6f6";
	}

	@Override
	public Long fibonacciNumber(@WebParam Long n) throws IRedPillFibonacciNumberArgumentOutOfRangeExceptionFaultFaultMessage {
		long idx = n == null ? 0 : n;
		if (idx > MAX_FIB || idx < -MAX_FIB) {
			throw new IRedPillFibonacciNumberArgumentOutOfRangeExceptionFaultFaultMessage("Fibonacci numbers beyond index 92 overflow the Long result type boundary", new ArgumentOutOfRangeException());
		}

		return fibs.get(new Long(Math.abs(idx)).intValue());
	}

	@Override
	public TriangleType whatShapeIsThis(@WebParam Integer a, @WebParam Integer b, @WebParam Integer c) {
		if (a == null || b == null || c == null) {
			return TriangleType.ERROR;
		}

		if (a <= 0 || b <= 0 || c <= 0) {
			return TriangleType.ERROR;
		}

		Set<Integer> lengths = new HashSet<>();
		lengths.add(a);
		lengths.add(b);
		lengths.add(c);

		return lengths.size() == 1 ? TriangleType.EQUILATERAL :
				lengths.size() == 2 ? TriangleType.ISOSCELES : TriangleType.SCALENE;
	}

	@Override
	public String reverseWords(@WebParam String s) throws IRedPillReverseWordsArgumentNullExceptionFaultFaultMessage {
		if (s == null) {
			throw new IRedPillReverseWordsArgumentNullExceptionFaultFaultMessage("Param \"s\" was not a valid string type", new ArgumentNullException());
		}
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String... args) {
		String serviceEndpoint = "http://0.0.0.0:8080/redpill.svc";
		if (args.length > 0) {
			serviceEndpoint = args[0];
		}

		Endpoint.publish(serviceEndpoint, new RedPill());
		System.out.println("RedPill service started on " + serviceEndpoint);
	}
}
