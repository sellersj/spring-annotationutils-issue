package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;

public class AnnotationTest {

    @Test
    public void isClassDeprecated_DirectlyOnclass() {
        assertTrue("should mark as deprecated", isClassDeprecated(TestDepricatedClass.class));
    }

    @Test
    public void isClassDeprecated_OnAbstractclass() {
        assertTrue("should mark as deprecated", isClassDeprecated(TestDepricatedAbstractClass.class));
    }

    @Test
    public void isClassDeprecated_OnSuperclass() {
        assertTrue("should mark as deprecated", isClassDeprecated(SubClass.class));
    }

    /* package */boolean isClassDeprecated(Class<?> clazz) {
        return null != AnnotationUtils.findAnnotation(clazz, Deprecated.class);
    }

    /** Class used for testing. */
    @Deprecated
    public static class TestDepricatedClass {
    }

    /** Class used for testing. */
    @Deprecated
    public abstract static class TestDepricatedAbstractClass {
    }

    /** Class used for testing. */
    public static class SubClass extends SuperClass {
    }

    /** Class used for testing. */
    @Deprecated
    public static class SuperClass {
    }
}