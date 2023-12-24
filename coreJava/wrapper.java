package coreJava;

public class wrapper {
	void meth1() {
		System.out.println("Auto Boxing");

		int a = 10;

		Integer aval1 = a; //
		Integer aval2 = Integer.valueOf(a);
		Integer aval3 = new Integer(a);

		System.out.println("int PDT a: " + a);
		System.out.println("Integer WCO aval1: " + aval1);
		System.out.println("Integer WCO aval2: " + aval2);
		System.out.println("Integer WCO aval3: " + aval3 + "\n");

		byte b = 127;

		Byte b1 = b;
		Byte b2 = Byte.valueOf(b);
		Byte b3 = new Byte(b);

		System.out.println("byte PDT b: " + b);
		System.out.println("Byte WCO b1: " + b1);
		System.out.println("Byte WCO b2: " + b2);
		System.out.println("Byte WCO b3: " + b3 + "\n");

		short s = -32768;

		Short s1 = s;
		Short s2 = Short.valueOf(s);
		Short s3 = new Short(s);

		System.out.println("short PDT b: " + s);
		System.out.println("Short WCO b1: " + s1);
		System.out.println("Short WCO b2: " + s2);
		System.out.println("Short WCO b3: " + s3 + "\n");

		long l = 357175757575l;

		Long l1 = new Long(l);
		Long l2 = Long.valueOf(l);
		Long l3 = l;

		System.out.println("long PDT l: " + l);
		System.out.println("Long WCO l1: " + l1);
		System.out.println("Long WCO l2: " + l2);
		System.out.println("Long WCO l3: " + l3 + "\n");

		float f = 1.89f;

		Float f1 = f;
		Float f2 = Float.valueOf(f);
		Float f3 = new Float(f);

		System.out.println("float PDT f: " + f);
		System.out.println("Float WCO f1: " + f1);
		System.out.println("Float WCO f2: " + f2);
		System.out.println("Float WCO f3: " + f3 + "\n");

		double d = 865148684.1548468174;

		Double d1 = d;
		Double d2 = new Double(d);
		Double d3 = Double.valueOf(d);

		System.out.println("double PDT d: " + d);
		System.out.println("Double WCO d1: " + d1);
		System.out.println("Double WCO d2: " + d2);
		System.out.println("Double WCO d3: " + d3 + "\n");

		char c = 'z';

		Character c1 = new Character(c);
		Character c2 = c;
		Character c3 = Character.valueOf(c);

		System.out.println("char PDT c: " + c);
		System.out.println("Character WCO c1: " + c1);
		System.out.println("Character WCO c2: " + c2);
		System.out.println("Character WCO c3: " + c3 + "\n");

		boolean n = true;

		Boolean n1 = new Boolean(n);
		Boolean n2 = Boolean.valueOf(n);
		Boolean n3 = n;

		System.out.println("boolean PDT n: " + n);
		System.out.println("Boolean WCO n1: " + n1);
		System.out.println("Boolean WCO n2: " + n3);
		System.out.println("Boolean WCO n3: " + n3 + "\n");

	}

	void meth2() {
		System.out.println("--------------------------------\n");
		System.out.println("Auto UnBoxing");

		Integer i = new Integer(32768);

		int i1 = i;
		int i2 = i.intValue();

		System.out.println("Integer WCO i: " + i);
		System.out.println("int PDT i1: " + i1);
		System.out.println("int PDT i2: " + i2 + "\n");

		Byte bval = new Byte((byte) 100);

		byte b1 = bval;
		byte b2 = bval.byteValue();

		System.out.println("Byte WCO bval: " + bval);
		System.out.println("byte PDT b1: " + b1);
		System.out.println("byte PDT b2: " + b2 + "\n");

		Short s = new Short("129");

		short s1 = s;
		short s2 = s.shortValue();

		System.out.println("Short WCO s: " + s);
		System.out.println("short PDT s1: " + s1);
		System.out.println("short PDT s2: " + s2 + "\n");

		Long l = new Long(1231862467);

		long l1 = l;
		long l2 = l.longValue();

		System.out.println("Long WCO f: " + l);
		System.out.println("long PDT f1: " + l1);
		System.out.println("long PDT f2: " + l2 + "\n");

		Float f = new Float("0.9999");

		float f1 = f;
		float f2 = f.floatValue();

		System.out.println("Float WCO f: " + f);
		System.out.println("float PDT f1: " + f1);
		System.out.println("float PDT f2: " + f2 + "\n");

		Double d = new Double(29491.142816);

		double d1 = d;
		double d2 = d.doubleValue();

		System.out.println("Double WCO d: " + d);
		System.out.println("double PDT d1: " + d1);
		System.out.println("double PDT d2: " + d2 + "\n");

		Character cval = new Character('a');

		char c1 = cval;
		char c2 = cval.charValue();

		System.out.println("Charater WCO cval: " + cval);
		System.out.println("char PDT c1: " + c1);
		System.out.println("char PDT c2: " + c2 + "\n");

		Boolean n = new Boolean("true");

		boolean n1 = n;
		boolean n2 = n.booleanValue();

		System.out.println("boolean WCO n: " + n);
		System.out.println("Boolean PDT n1: " + n1);
		System.out.println("Boolean PDT n2: " + n2 + "\n");
	}

	public static void main(String[] args) {
		wrapper obj = new wrapper();
		obj.meth1();
		obj.meth2();
	}
}