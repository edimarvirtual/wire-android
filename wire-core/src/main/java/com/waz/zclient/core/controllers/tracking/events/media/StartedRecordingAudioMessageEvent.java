/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.core.controllers.tracking.events.media;

import android.support.annotation.NonNull;
import com.waz.zclient.core.controllers.tracking.attributes.Attribute;
import com.waz.zclient.core.controllers.tracking.events.Event;

public class StartedRecordingAudioMessageEvent extends Event {

    public StartedRecordingAudioMessageEvent(String conversationType, boolean fromMinimised) {
        attributes.put(Attribute.CONVERSATION_TYPE, conversationType);
        attributes.put(Attribute.STATE, fromMinimised ? "minimised" : "keyboard");
    }

    @NonNull
    @Override
    public String getName() {
        return "media.started_recording_audio_message";
    }
}
