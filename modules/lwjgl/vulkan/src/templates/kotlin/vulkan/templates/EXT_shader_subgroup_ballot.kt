/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_subgroup_ballot = "EXTShaderSubgroupBallot".nativeClassVK("EXT_shader_subgroup_ballot", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>{@code SPV_KHR_shader_ballot}</li>
        </ul>

        This extension provides the ability for a group of invocations, which execute in parallel, to do limited forms of cross-invocation communication via a group broadcast of a invocation value, or broadcast of a bitarray representing a predicate value from each invocation in the group.

        This extension provides access to a number of additional built-in shader variables in Vulkan:

        <ul>
            <li>{@code SubgroupEqMaskKHR}, containing the subgroup mask of the current subgroup invocation,</li>
            <li>{@code SubgroupGeMaskKHR}, containing the subgroup mask of the invocations greater than or equal to the current invocation,</li>
            <li>{@code SubgroupGtMaskKHR}, containing the subgroup mask of the invocations greater than the current invocation,</li>
            <li>{@code SubgroupLeMaskKHR}, containing the subgroup mask of the invocations less than or equal to the current invocation,</li>
            <li>{@code SubgroupLtMaskKHR}, containing the subgroup mask of the invocations less than the current invocation,</li>
            <li>{@code SubgroupLocalInvocationId}, containing the index of an invocation within a subgroup, and</li>
            <li>{@code SubgroupSize}, containing the maximum number of invocations in a subgroup.</li>
        </ul>

        Additionally, this extension provides access to the new SPIR-V instructions:

        <ul>
            <li>{@code OpSubgroupBallotKHR},</li>
            <li>{@code OpSubgroupFirstInvocationKHR}, and</li>
            <li>{@code OpSubgroupReadInvocationKHR},</li>
        </ul>

        When using GLSL source-based shader languages, the following variables and shader functions from GL_ARB_shader_ballot can map to these SPIR-V built-in decorations and instructions:

        <ul>
            <li>{@code in uint64_t gl_SubGroupEqMaskARB;} → {@code SubgroupEqMaskKHR},</li>
            <li>{@code in uint64_t gl_SubGroupGeMaskARB;} → {@code SubgroupGeMaskKHR},</li>
            <li>{@code in uint64_t gl_SubGroupGtMaskARB;} → {@code SubgroupGtMaskKHR},</li>
            <li>{@code in uint64_t gl_SubGroupLeMaskARB;} → {@code SubgroupLeMaskKHR},</li>
            <li>{@code in uint64_t gl_SubGroupLtMaskARB;} → {@code SubgroupLtMaskKHR},</li>
            <li>{@code in uint gl_SubGroupInvocationARB;} → {@code SubgroupLocalInvocationId},</li>
            <li>{@code uniform uint gl_SubGroupSizeARB;} → {@code SubgroupSize},</li>
            <li>{@code ballotARB}() → {@code OpSubgroupBallotKHR},</li>
            <li>{@code readFirstInvocationARB}() → {@code OpSubgroupFirstInvocationKHR}, and</li>
            <li>{@code readInvocationARB}() → {@code OpSubgroupReadInvocationKHR}.</li>
        </ul>

        <h5>Deprecated by Vulkan 1.2</h5>
        Most of the functionality in this extension is superseded by the core Vulkan 1.1 <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkPhysicalDeviceSubgroupProperties">subgroup operations</a>. However, Vulkan 1.1 required the {@code OpGroupNonUniformBroadcast} “{@code Id}” to be constant. This restriction was removed in Vulkan 1.2 with the addition of the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-subgroupBroadcastDynamicId">{@code subgroupBroadcastDynamicId}</a> feature.

        <h5>VK_EXT_shader_subgroup_ballot</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_shader_subgroup_ballot}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>65</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Deprecated</em> by <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-new-features">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_subgroup_ballot]%20@dgkoch%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_subgroup_ballot%20extension*">dgkoch</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-11-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_shader_ballot.html">{@code SPV_KHR_shader_ballot}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://registry.khronos.org/OpenGL/extensions/ARB/ARB_shader_ballot.txt">{@code GL_ARB_shader_ballot}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Neil Henning, Codeplay</li>
                <li>Daniel Koch, NVIDIA Corporation</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME".."VK_EXT_shader_subgroup_ballot"
    )
}