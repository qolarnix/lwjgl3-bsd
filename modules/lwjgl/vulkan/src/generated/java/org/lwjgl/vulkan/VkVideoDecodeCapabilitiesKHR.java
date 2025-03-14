/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing general video decode capabilities for a video profile.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeCapabilitiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoDecodeCapabilityFlagsKHR {@link #flags};
 * }</code></pre>
 */
public class VkVideoDecodeCapabilitiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkVideoDecodeCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeCapabilitiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoDecodeCapabilityFlagBitsKHR} describing the supported video decoding capabilities. */
    @NativeType("VkVideoDecodeCapabilityFlagsKHR")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeCapabilitiesKHR sType$Default() { return sType(KHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeCapabilitiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeCapabilitiesKHR set(VkVideoDecodeCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeCapabilitiesKHR malloc() {
        return wrap(VkVideoDecodeCapabilitiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeCapabilitiesKHR calloc() {
        return wrap(VkVideoDecodeCapabilitiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeCapabilitiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeCapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoDecodeCapabilitiesKHR create(long address) {
        return wrap(VkVideoDecodeCapabilitiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeCapabilitiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeCapabilitiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeCapabilitiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeCapabilitiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeCapabilitiesKHR malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeCapabilitiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeCapabilitiesKHR calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeCapabilitiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeCapabilitiesKHR.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeCapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeCapabilitiesKHR ELEMENT_FACTORY = VkVideoDecodeCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkVideoDecodeCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeCapabilitiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeCapabilitiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoDecodeCapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeCapabilitiesKHR#flags} field. */
        @NativeType("VkVideoDecodeCapabilityFlagsKHR")
        public int flags() { return VkVideoDecodeCapabilitiesKHR.nflags(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeCapabilitiesKHR#sType} field. */
        public VkVideoDecodeCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR} value to the {@link VkVideoDecodeCapabilitiesKHR#sType} field. */
        public VkVideoDecodeCapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeCapabilitiesKHR#pNext} field. */
        public VkVideoDecodeCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoDecodeCapabilitiesKHR.npNext(address(), value); return this; }

    }

}