/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_compression_control = "EXTImageCompressionControl".nativeClassVK("EXT_image_compression_control", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension enables fixed-rate image compression and adds the ability to control when this kind of compression can be applied. Many implementations support some form of framebuffer compression. This is typically transparent to applications as lossless compression schemes are used. With fixed-rate compression, the compression is done at a defined bitrate. Such compression algorithms generally produce results that are visually lossless, but the results are typically not bit-exact when compared to a non-compressed result. The implementation may not be able to use the requested compression rate in all cases. This extension adds a query that can be used to determine the compression scheme and rate that was applied to an image.

        <h5>VK_EXT_image_compression_control</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_image_compression_control}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>339</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_image_compression_control]%20@janharaldfredriksen-arm%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_image_compression_control%20extension*">janharaldfredriksen-arm</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_image_compression_control.adoc">VK_EXT_image_compression_control</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-05-02</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Andrew Garrard, Imagination</li>
                <li>Lisa Wu, Arm</li>
                <li>Peter Kohaut, Arm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_IMAGE_COMPRESSION_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME".."VK_EXT_image_compression_control"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT".."1000338000",
        "STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT".."1000338001",
        "STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT".."1000338002",
        "STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT".."1000338003",
        "STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT".."1000338004"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_COMPRESSION_EXHAUSTED_EXT".."-1000338000"
    )

    EnumConstant(
        """
        VkImageCompressionFlagBitsEXT - Bitmask specifying image compression controls

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_COMPRESSION_DEFAULT_EXT specifies that the default image compression setting is used. Implementations <b>must</b> not apply fixed-rate compression.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT specifies that the implementation <b>may</b> choose any supported fixed-rate compression setting in an implementation-defined manner based on the properties of the image.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT specifies that fixed-rate compression <b>may</b> be used and that the allowed compression rates are specified by ##VkImageCompressionControlEXT{@code ::pFixedRateFlags}.</li>
            <li>#IMAGE_COMPRESSION_DISABLED_EXT specifies that all lossless and fixed-rate compression <b>should</b> be disabled.</li>
        </ul>

        If ##VkImageCompressionControlEXT{@code ::flags} is #IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT, then the {@code i}<sup>th</sup> member of the {@code pFixedRateFlags} array specifies the allowed compression rates for the image’s {@code i}<sup>th</sup> plane.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If #IMAGE_COMPRESSION_DISABLED_EXT is included in ##VkImageCompressionControlEXT{@code ::flags}, both lossless and fixed-rate compression will be disabled. This is likely to have a negative impact on performance and is only intended to be used for debugging purposes.
        </div>
        """,

        "IMAGE_COMPRESSION_DEFAULT_EXT".."0",
        "IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT".enum(0x00000001),
        "IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT".enum(0x00000002),
        "IMAGE_COMPRESSION_DISABLED_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkImageCompressionFixedRateFlagBitsEXT - Bitmask specifying fixed rate image compression rates

        <h5>Description</h5>
        <ul>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT specifies that fixed-rate compression <b>must</b> not be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[1,2)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[2,3)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[3,4)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[4,5)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[5,6)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[6,7)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[7,8)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[8,9)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[9,10)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[10,11)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of <code>[11,12)</code> bits per component <b>may</b> be used.</li>
            <li>#IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT specifies that fixed-rate compression with a bitrate of at least 12 bits per component <b>may</b> be used.</li>
        </ul>

        If the format has a different bit rate for different components, ##VkImageCompressionControlEXT{@code ::pFixedRateFlags} describes the rate of the component with the largest number of bits assigned to it, scaled pro rata. For example, to request that a #FORMAT_A2R10G10B10_UNORM_PACK32 format be stored at a rate of 8 bits per pixel, use #IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT (10 bits for the largest component, stored at quarter the original size, 2.5 bits, rounded down).

        If {@code flags} includes #IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT, and multiple bits are set in ##VkImageCompressionControlEXT{@code ::pFixedRateFlags} for a plane, implementations <b>should</b> apply the lowest allowed bitrate that is supported.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The choice of “{@code bits per component}” terminology was chosen so that the same compression rate describes the same degree of compression applied to formats that differ only in the number of components. For example, #FORMAT_R8G8_UNORM compressed to half its original size is a rate of 4 bits per component, 8 bits per pixel. #FORMAT_R8G8B8A8_UNORM compressed to half <em>its</em> original size is 4 bits per component, 16 bits per pixel. Both of these cases can be requested with #IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT.
        </div>
        """,

        "IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT".."0",
        "IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT".enum(0x00000001),
        "IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT".enum(0x00000002),
        "IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT".enum(0x00000004),
        "IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT".enum(0x00000008),
        "IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT".enum(0x00000010),
        "IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT".enum(0x00000020),
        "IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT".enum(0x00000040),
        "IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT".enum(0x00000080),
        "IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT".enum(0x00000100),
        "IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT".enum(0x00000200),
        "IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT".enum(0x00000400),
        "IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT".enum(0x00000800),
        "IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT".enum(0x00001000),
        "IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT".enum(0x00002000),
        "IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT".enum(0x00004000),
        "IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT".enum(0x00008000),
        "IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT".enum(0x00010000),
        "IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT".enum(0x00020000),
        "IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT".enum(0x00040000),
        "IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT".enum(0x00080000),
        "IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT".enum(0x00100000),
        "IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT".enum(0x00200000),
        "IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT".enum(0x00400000),
        "IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT".enum(0x00800000)
    )

    void(
        "GetImageSubresourceLayout2EXT",
        """
        Retrieve information about an image subresource.

        <h5>C Specification</h5>
        To query the memory layout of an image subresource, call:

        <pre><code>
￿void vkGetImageSubresourceLayout2EXT(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkImageSubresource2EXT*               pSubresource,
￿    VkSubresourceLayout2EXT*                    pLayout);</code></pre>

        <h5>Description</h5>
        {@code vkGetImageSubresourceLayout2EXT} behaves similarly to #GetImageSubresourceLayout(), with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.

        It is legal to call {@code vkGetImageSubresourceLayout2EXT} with a {@code image} created with {@code tiling} equal to #IMAGE_TILING_OPTIMAL, but the members of ##VkImageSubresource2EXT{@code ::imageSubresource} will have undefined values in this case.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Structures chained from ##VkImageSubresource2EXT{@code ::pNext} will also be updated when {@code tiling} is equal to #IMAGE_TILING_OPTIMAL.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
            <li>The {@code mipLevel} member of {@code pSubresource} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>The {@code arrayLayer} member of {@code pSubresource} <b>must</b> be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>If {@code format} is a color format, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be #IMAGE_ASPECT_COLOR_BIT</li>
            <li>If {@code format} has a depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain #IMAGE_ASPECT_DEPTH_BIT</li>
            <li>If {@code format} has a stencil component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If {@code format} does not contain a stencil or depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> not contain #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_LINEAR and its {@code format} is a <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a> with two planes, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT or #IMAGE_ASPECT_PLANE_1_BIT</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_LINEAR and its {@code format} is a <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a> with three planes, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be #IMAGE_ASPECT_PLANE_0_BIT, #IMAGE_ASPECT_PLANE_1_BIT or #IMAGE_ASPECT_PLANE_2_BIT</li>
            <li>If {@code image} was created with the #EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID external memory handle type, then {@code image} <b>must</b> be bound to memory</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> and the index <em>i</em> <b>must</b> be less than the ##VkDrmFormatModifierPropertiesEXT{@code ::drmFormatModifierPlaneCount} associated with the image’s {@code format} and ##VkImageDrmFormatModifierPropertiesEXT{@code ::drmFormatModifier}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pSubresource} <b>must</b> be a valid pointer to a valid ##VkImageSubresource2EXT structure</li>
            <li>{@code pLayout} <b>must</b> be a valid pointer to a ##VkSubresourceLayout2EXT structure</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageSubresource2EXT, ##VkSubresourceLayout2EXT
        """,

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the image whose layout is being queried."),
        VkImageSubresource2EXT.const.p("pSubresource", "a pointer to a ##VkImageSubresource2EXT structure selecting a specific image for the image subresource."),
        VkSubresourceLayout2EXT.p("pLayout", "a pointer to a ##VkSubresourceLayout2EXT structure in which the layout is returned.")
    )
}