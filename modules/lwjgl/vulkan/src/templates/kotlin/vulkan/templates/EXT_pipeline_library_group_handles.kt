/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_library_group_handles = "EXTPipelineLibraryGroupHandles".nativeClassVK("EXT_pipeline_library_group_handles", type = "device", postfix = "EXT") {
    documentation =
        """
        When using pipeline libraries in ray tracing pipelines, a library might get linked into different pipelines in an incremental way. An application can have a strategy where a ray tracing pipeline is comprised of N pipeline libraries and is later augumented by creating a new pipeline with N + 1 libraries. Without this extension, all group handles must be re-queried as the group handle is tied to the pipeline, not the library. This is problematic for applications which aim to decouple construction of record buffers and the linkage of ray tracing pipelines.

        To aid in this, this extension enables support for querying group handles directly from pipeline libraries. Group handles obtained from a library <b>must</b> remain bitwise identical in any {@code VkPipeline} that links to the library.

        With this feature, the extension also improves compatibility with DXR 1.1 AddToStateObject(), which guarantees that group handles returned remain bitwise identical between parent and child pipelines. In addition, querying group handles from COLLECTION objects is also supported with that API.

        <h5>VK_EXT_pipeline_library_group_handles</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_pipeline_library_group_handles}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>499</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.1</li>
                <li>Requires {@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline} to be enabled for any device-level functionality</li>
                <li>Requires {@link KHRPipelineLibrary VK_KHR_pipeline_library} to be enabled for any device-level functionality</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_pipeline_library_group_handles]%20@HansKristian-Work%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_pipeline_library_group_handles%20extension*">HansKristian-Work</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_pipeline_library_group_handles.adoc">VK_EXT_pipeline_library_group_handles</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-01-25</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Stuart Smith, AMD</li>
                <li>Ricardo Garcia, Igalia</li>
                <li>Lionel Landwerlin, Intel</li>
                <li>Eric Werness, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_PIPELINE_LIBRARY_GROUP_HANDLES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_PIPELINE_LIBRARY_GROUP_HANDLES_EXTENSION_NAME".."VK_EXT_pipeline_library_group_handles"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT".."1000498000"
    )
}