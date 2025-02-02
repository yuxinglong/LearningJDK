/*
 * Copyright (c) 1994, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang;

import java.io.Serializable;

/**
 * The abstract class {@code Number} is the superclass of platform
 * classes representing numeric values that are convertible to the
 * primitive types {@code byte}, {@code double}, {@code float}, {@code
 * int}, {@code long}, and {@code short}.
 *
 * The specific semantics of the conversion from the numeric value of
 * a particular {@code Number} implementation to a given primitive
 * type is defined by the {@code Number} implementation in question.
 *
 * For platform classes, the conversion is often analogous to a
 * narrowing primitive conversion or a widening primitive conversion
 * as defined in <cite>The Java&trade; Language Specification</cite>
 * for converting between primitive types.  Therefore, conversions may
 * lose information about the overall magnitude of a numeric value, may
 * lose precision, and may even return a result of a different sign
 * than the input.
 *
 * See the documentation of a given {@code Number} implementation for
 * conversion details.
 *
 * @author Lee Boynton
 * @author Arthur van Hoff
 * @jls 5.1.2 Widening Primitive Conversions
 * @jls 5.1.3 Narrowing Primitive Conversions
 * @since 1.0
 */
// 数值类型包装类的共同祖先，声明了各种包装类型的拆箱方法1
public abstract class Number implements Serializable {
    /** use serialVersionUID from JDK 1.0.2 for interoperability */
    private static final long serialVersionUID = -8742448824652078965L;
    
    /**
     * Returns the value of the specified number as a {@code byte}.
     *
     * <p>This implementation returns the result of {@link #intValue} cast
     * to a {@code byte}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code byte}.
     *
     * @since 1.1
     */
    // 以byte形式返回当前对象的值
    public byte byteValue() {
        return (byte) intValue();
    }
    
    /**
     * Returns the value of the specified number as a {@code short}.
     *
     * <p>This implementation returns the result of {@link #intValue} cast
     * to a {@code short}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code short}.
     *
     * @since 1.1
     */
    // 以short形式返回当前对象的值
    public short shortValue() {
        return (short) intValue();
    }
    
    /**
     * Returns the value of the specified number as an {@code int}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code int}.
     */
    // 以int形式返回当前对象的值
    public abstract int intValue();
    
    /**
     * Returns the value of the specified number as a {@code long}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code long}.
     */
    // 以long形式返回当前对象的值
    public abstract long longValue();
    
    /**
     * Returns the value of the specified number as a {@code float}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code float}.
     */
    // 以float形式返回当前对象的值
    public abstract float floatValue();
    
    /**
     * Returns the value of the specified number as a {@code double}.
     *
     * @return the numeric value represented by this object after conversion
     * to type {@code double}.
     */
    // 以double形式返回当前对象的值
    public abstract double doubleValue();
    
}
