/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_foveation = "FBFoveation".nativeClassXR("FB_foveation", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_foveation">XR_FB_foveation</a> extension.

        Foveation in the context of XR is a rendering technique that allows the area of an image near the focal point or fovea of the eye to be displayed at higher resolution than areas in the periphery. This trades some visual fidelity in the periphery, where it is less noticeable for the user, for improved rendering performance, most notably regarding the fragment shader, as fewer pixels or subpixels in the periphery need to be shaded and processed. On platforms which support foveation patterns and features tailored towards the optical properties, performance profiles, and hardware support of specific HMDs, application developers may request and use available foveation profiles from the runtime. Foveation profiles refer to a set of properties describing how, when, and where foveation will be applied.

        This extension allows:

        <ul>
            <li>An application to create swapchains that can support foveation for its graphics API.</li>
            <li>An application to request foveation profiles supported by the runtime and apply them to foveation-supported swapchains.</li>
        </ul>

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo {@code enabledExtensionNames} parameter as indicated in the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_foveation_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_FOVEATION_EXTENSION_NAME".."XR_FB_foveation"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_FOVEATION_PROFILE_FB".."1000114000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_FOVEATION_PROFILE_CREATE_INFO_FB".."1000114000",
        "TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB".."1000114001",
        "TYPE_SWAPCHAIN_STATE_FOVEATION_FB".."1000114002"
    )

    EnumConstant(
        """
        XrSwapchainCreateFoveationFlagBitsFB - XrSwapchainCreateFoveationFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB — Explicitly create the swapchain with scaled bin foveation support. The application must ensure that the swapchain is using the OpenGL graphics API and that the QCOM_texture_foveated extension is supported and enabled.</li>
            <li>#SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB — Explicitly create the swapchain with fragment density map foveation support. The application must ensure that the swapchain is using the Vulkan graphics API and that the VK_EXT_fragment_density_map extension is supported and enabled.</li>
        </ul>
        """,

        "SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB".enum(0x00000001),
        "SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB".enum(0x00000002)
    )

    XrResult(
        "CreateFoveationProfileFB",
        """
        Create a foveation profile.

        <h5>C Specification</h5>
        The #CreateFoveationProfileFB() function is defined as:

        <pre><code>
￿XrResult xrCreateFoveationProfileFB(
￿    XrSession                                   session,
￿    const XrFoveationProfileCreateInfoFB*       createInfo,
￿    XrFoveationProfileFB*                       profile);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrFoveationProfileFB} handle. The returned foveation profile handle <b>may</b> be subsequently used in API calls.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to calling #CreateFoveationProfileFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrFoveationProfileCreateInfoFB structure</li>
            <li>{@code profile} <b>must</b> be a pointer to an {@code XrFoveationProfileFB} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFoveationProfileCreateInfoFB
        """,

        XrSession("session", "the {@code XrSession} that created the swapchains to which this foveation profile will be applied."),
        XrFoveationProfileCreateInfoFB.const.p("createInfo", "a pointer to an ##XrFoveationProfileCreateInfoFB structure containing parameters to be used to create the foveation profile."),
        Check(1)..XrFoveationProfileFB.p("profile", "a pointer to a handle in which the created {@code XrFoveationProfileFB} is returned.")
    )

    XrResult(
        "DestroyFoveationProfileFB",
        """
        Destroy a foveation profile.

        <h5>C Specification</h5>
        The #DestroyFoveationProfileFB() function is defined as:

        <pre><code>
￿XrResult xrDestroyFoveationProfileFB(
￿    XrFoveationProfileFB                        profile);</code></pre>

        <h5>Description</h5>
        {@code XrFoveationProfileFB} handles are destroyed using #DestroyFoveationProfileFB(). A {@code XrFoveationProfileFB} <b>may</b> be safely destroyed after being applied to a swapchain state using #UpdateSwapchainFB() without affecting the foveation parameters of the swapchain. The application is responsible for ensuring that it has no calls using profile in progress when the foveation profile is destroyed.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to calling #DestroyFoveationProfileFB()</li>
            <li>{@code profile} <b>must</b> be a valid {@code XrFoveationProfileFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code profile}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrFoveationProfileFB("profile", "the {@code XrFoveationProfileFB} to destroy.")
    )
}