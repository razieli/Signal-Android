/*
 * Copyright 2023 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.thoughtcrime.securesms.service.webrtc

import org.signal.core.util.logging.Log
import org.thoughtcrime.securesms.service.webrtc.state.WebRtcServiceState

/**
 * Process actions for when the call link has at least once been connected and joined.
 */
class CallLinkConnectedActionProcessor(
  webRtcInteractor: WebRtcInteractor
) : GroupConnectedActionProcessor(webRtcInteractor) {
  override fun getGroupNetworkUnavailableActionProcessor(): GroupNetworkUnavailableActionProcessor {
    return CallLinkNetworkUnavailableActionProcessor(webRtcInteractor)
  }

  override fun handleGroupRequestUpdateMembers(currentState: WebRtcServiceState): WebRtcServiceState {
    Log.i(tag, "handleGroupRequestUpdateMembers():")

    return currentState
  }
}