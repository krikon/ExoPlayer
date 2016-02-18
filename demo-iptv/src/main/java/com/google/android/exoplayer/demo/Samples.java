/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer.demo;

import com.google.android.exoplayer.util.Util;

import java.util.Locale;

/**
 * Holds statically defined sample definitions.
 */
/* package */ class Samples {

  public static class Sample {

    public final String name;
    public final String contentId;
    public final String provider;
    public final String uri;
    public final int type;

    public Sample(String name, String uri, int type) {
      this(name, name.toLowerCase(Locale.US).replaceAll("\\s", ""), "", uri, type);
    }

    public Sample(String name, String contentId, String provider, String uri, int type) {
      this.name = name;
      this.contentId = contentId;
      this.provider = provider;
      this.uri = uri;
      this.type = type;
    }

  }

    public static final Sample[] IPTV = new Sample[] {
        new Sample("NRK1", "239.255.2.39:1234", Util.TYPE_IPTV),
        new Sample("NRK2", "239.255.2.40:1234", Util.TYPE_IPTV),
        new Sample("NRK Super / NRK3", "239.255.2.41:1234", Util.TYPE_IPTV),
        new Sample("NRK Tegnspråk", "239.255.2.55:1234", Util.TYPE_IPTV),
        new Sample("Bunny", "239.255.2.30:1234", Util.TYPE_IPTV),
        new Sample("YouTube", "239.255.2.31:1234", Util.TYPE_IPTV),
        new Sample("Sintel", "239.255.2.38:1234", Util.TYPE_IPTV),
        new Sample("BBC", "239.255.2.36:1234", Util.TYPE_IPTV),
        new Sample("BBC 2", "239.255.2.37:1234", Util.TYPE_IPTV),
        new Sample("Info Channel", "239.255.2.35:1234", Util.TYPE_IPTV),
    };



  private Samples() {}

}
