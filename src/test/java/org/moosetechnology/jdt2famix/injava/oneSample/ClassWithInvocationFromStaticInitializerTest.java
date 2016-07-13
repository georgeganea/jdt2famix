package org.moosetechnology.jdt2famix.injava.oneSample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.moosetechnology.jdt2famix.injava.InJavaImporter;
import org.moosetechnology.jdt2famix.samples.basic.ClassWithInvocationFromStaticInitializer;

public class ClassWithInvocationFromStaticInitializerTest extends
		OneSampleTestCase {

	@Override
	protected Class<?> sampleClass() {
		return ClassWithInvocationFromStaticInitializer.class;
	}

	@Test
	public void testMethods() {
		assertEquals(2, type.getMethods().size());
		assertFalse(methodNamed(InJavaImporter.INITIALIZER).getIsStub());
	}
	
	@Test
	public void testInvocation() {
		assertEquals(1, methodNamed(InJavaImporter.INITIALIZER).getOutgoingInvocations().size());
	}
}
