/*
 * Copyright 2015 Google Inc. All rights reserved.
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

package com.example.android.johortourist.provider;

import android.net.Uri;

import com.example.android.xyztouristattractions.common.Attraction;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static data content provider.
 */
public class TouristAttractions {

    public static final String CITY_JOHOR = "Johor";

    public static final String TEST_CITY = CITY_JOHOR;

    private static final float TRIGGER_RADIUS = 2000; // 2KM
    private static final int TRIGGER_TRANSITION = Geofence.GEOFENCE_TRANSITION_ENTER |
            Geofence.GEOFENCE_TRANSITION_EXIT;
    private static final long EXPIRATION_DURATION = Geofence.NEVER_EXPIRE;

    public static final Map<String, LatLng> CITY_LOCATIONS = new HashMap<String, LatLng>() {{
        put(CITY_JOHOR, new LatLng(-33.873651, 151.2068896));
    }};

    /**
     * All photos used with permission under the Creative Commons Attribution-ShareAlike License.
     */
    public static final HashMap<String, List<Attraction>> ATTRACTIONS =
            new HashMap<String, List<Attraction>>() {{

        put(CITY_JOHOR, new ArrayList<Attraction>() {{
            add(new Attraction(
                    "Pantai Desaru, Kota Tinggi",
                    "Pantai yang tidak asing di kalangan pelancong ini terkenal dengan pasir yang putih, di samping pemandangan menghadap Laut China Selatan",
                    "Pantai yang tidak asing di kalangan pelancong ini terkenal dengan pasir yang putih, di samping pemandangan menghadap Laut China Selatan. Terdapat pelbagai kemudahan resort di sepanjang pantai, Desaru merupakan kawasan tumpuan untuk keluarga bercuti. Berbagai-bagai aktiviti menarik boleh didapati di sini seperti snorkeling, jet ski, dan parasailing.\n" +
                            "\n" +
                            "Bagi peminat aktivtiti surfing, anda boleh berkunjung ke sini pada Disember hingga Februari di mana pada waktu itu ombak agak kuat dan sesuai untuk aktiviti peluncuran. Selain itu, anda boleh melihat kunang-kunang di Sungan Lebam pada waktu malam untuk melengkapkan percutian anda di sini.",
                    Uri.parse("https://1.bp.blogspot.com/-0Q9zbC4He8I/XDK_z1KCDUI/AAAAAAAABYg/FkwrBot5NlAQcwKlXgBWavKF1PdeA_U4QCLcBGAs/s1600/pantai%2Bdesaru%2B1.jpg"),
                    Uri.parse("https://1.bp.blogspot.com/-0Q9zbC4He8I/XDK_z1KCDUI/AAAAAAAABYg/FkwrBot5NlAQcwKlXgBWavKF1PdeA_U4QCLcBGAs/s1600/pantai%2Bdesaru%2B1.jpg"),
                    new LatLng(1.545392, 104.262232),
                    CITY_JOHOR
            ));

            add(new Attraction(
                    "Desaru Fruit Farm, Kota Tinggi",
                    "Ladang buah-buahan tropika yang berkeluasan lebih 100 ekar ini menawarkan pengalaman kepada para pengunjung untuk mengenal dengan lebih dekat akan kekayaan buah-buahan tempatan",
                    "Ladang buah-buahan tropika yang berkeluasan lebih 100 ekar ini menawarkan pengalaman kepada para pengunjung untuk mengenal dengan lebih dekat akan kekayaan buah-buahan tempatan. Mempunyai lebih 100 jenis buah-buahan yang segar, ladang ini juga menyediakan zoo mini, kolam ikan koi, dan lain-lain tarikan. Pengunjung berpeluang untuk memilih buah pilihan sendiri sambil dibantu oleh staf ladang.\n" +
                            "\n" +
                            "Antara buah-buahan berkualiti tinggi yang terdapat di sini ialah durian, durian belanda, jambu madu, jambu batu, limau madu dan berbagai-bagai lagi. Terdapat pelbagai pakej lawatan disediakan di sini, anda boleh memilih untuk menyertai lawatan separuh hari atau bermalam di sekitar chalet yang disediakan",
                    Uri.parse("https://2.bp.blogspot.com/-p3_8OWUWZQU/XDLDWPNzkcI/AAAAAAAABYs/7aOtpvSNbM8_6ZhPegt8o7Q4YkKu7x7QwCLcBGAs/s320/Desaru-Fruit-Farm_article-777x437.jpg"),
                    Uri.parse("https://2.bp.blogspot.com/-p3_8OWUWZQU/XDLDWPNzkcI/AAAAAAAABYs/7aOtpvSNbM8_6ZhPegt8o7Q4YkKu7x7QwCLcBGAs/s320/Desaru-Fruit-Farm_article-777x437.jpg"),
                    new LatLng(1.583901, 104.193541),
                    CITY_JOHOR
            ));

            add(new Attraction(
                    "Ladang Burung Unta, Kota Tinggi",
                    "Terletak di Teluk Ramunia, ladang burung unta ini merupakan rumah kepada lebih 100 ekor burung unta.",
                    "Terletak di Teluk Ramunia, ladang burung unta ini merupakan rumah kepada lebih 100 ekor burung unta. Uniknya, penjaga burung unta di sini akan menjadi pemandu pelancong peribadi untuk setiap pengunjung yang datang sini. Pengunjung akan dapat menikmati layanan istimewa dan melawat seluruh ladang ini. Sudah pastinya, pengalaman menunggang burung unta menjadi aktivit wajib bila bertandang ke sini.\n" +
                            "\n" +
                            "Pengunjung dapat menunggang burung unta dengan membuat bayaran tambahan. Anda tidak perlu risau kerana penjaga burung unta akan sentiasa berada di sisi anda untuk memastikan keselamatan anda terjaga. Selain itu, terdapat kedai cenderamata di ladang ini untuk anda buat sebagai kenangan.\n" +
                            "\n" +
                            "Lokasi: EMR 15 Teluk Ramunia, Kota Tinggi\n" +
                            "\n" +
                            "Waktu Operasi: 10 pg – 6 ptg\n" +
                            "\n" +
                            "Harga Tiket: Dewasa: RM12, Kanak-kanak: RM8",
                    Uri.parse("https://4.bp.blogspot.com/-L5nrcw-PIHE/XDL5z9Dw4EI/AAAAAAAABY4/UZJg9OUh1SoHEr1H39TMWv8IcS2msh1rwCLcBGAs/s320/dsc00054.jpg"),
                    Uri.parse("https://4.bp.blogspot.com/-L5nrcw-PIHE/XDL5z9Dw4EI/AAAAAAAABY4/UZJg9OUh1SoHEr1H39TMWv8IcS2msh1rwCLcBGAs/s320/dsc00054.jpg"),
                    new LatLng(1.368886, 104.241513),
                    CITY_JOHOR
            ));

            add(new Attraction(
                    "Zoo Johor, Johor Bahru",
                    "Sebuah zoo yang terletak di tengah pusat bandaraya Johor Bahru ini mula dibuka pada tahun 1928.",
                    "Sebuah zoo yang terletak di tengah pusat bandaraya Johor Bahru ini mula dibuka pada tahun 1928. Antara salah satu zoo tertua di Malaysia, zoo ini menempatkan lebih 100 spesis haiwan termasuk binatang eksotik dan terancam. Antaranya ialah gajah, singa, gorila, burung flamingo, dan lain-lain.\n" +
                            "\n" +
                            "Anda berpeluang untuk menonton pertunjukan haiwan yang pasti menghiburkan di sini. Terdapat berbagai-bagai gerai makanan di sini untuk memastikan pengunjung zoo dapat berehat dan mengisi perut semasa berada di dalam zoo. Zoo Johor ini pastinya merupakan tempat yang amat sesuai untuk anda bercuti bersama keluarga.\n" +
                            "\n" +
                            "Lokasi: Jalan Gertak Merah, Johor Bahru\n" +
                            "\n" +
                            "Waktu Operasi: Setiap hari, 8 pg – 6 ptg\n" +
                            "\n" +
                            "Harga Tiket: Dewasa: RM2, Kanak-kanak: RM1",
                    Uri.parse("https://3.bp.blogspot.com/-itIfEUlOHaw/XDMAmW2KctI/AAAAAAAABZE/qrt_YEUOCrUGtupebOJZHvNW_07mmwzCACLcBGAs/s1600/14364846_10153786430521003_3252958083457901737_n.jpg"),
                    Uri.parse("https://3.bp.blogspot.com/-itIfEUlOHaw/XDMAmW2KctI/AAAAAAAABZE/qrt_YEUOCrUGtupebOJZHvNW_07mmwzCACLcBGAs/s1600/14364846_10153786430521003_3252958083457901737_n.jpg"),
                    new LatLng(1.457539, 103.752190),
                    CITY_JOHOR
            ));

            add(new Attraction(
                    "Taman Buaya Teluk Sengat, Kota Tinggi",
                    "Dibuka sejak 1979, taman buaya kini menempatkan lebih 1000 ekor buaya.",
                    "Dibuka sejak 1979, taman buaya kini menempatkan lebih 1000 ekor buaya. Anda berpeluang untuk melihat pelbagai jenis buaya di sini malahan dikatakan terdapat buaya yang sudah berusia lebih 100 tahun. Di samping itu, terdapat juga pertunjukan buaya di sini di mana penjaga buaya akan memberi makanan kepada buaya-buaya di dalam sangkar dengan jarak yang dekat.\n" +
                            "\n" +
                            "Untuk pengalaman yang lebih menerujakan, anda boleh memegang sendiri anak buaya yang tidak berbahaya. Anda boleh membelai mereka dan menangkap gambar bersama mereka. Dan untuk melengkapkan perjalanan anda di sini, anda boleh berkunjung ke gerai cenderahati di sini.\n" +
                            "\n" +
                            "Lokasi: Lot 1289 & 1290, Jalan Sembilan, Kampung Belading, Teluk Sengat, Kota Tinggi\n" +
                            "\n" +
                            "Waktu Operasi: 9 pg – 6 ptg\n" +
                            "\n" +
                            "Harga Tiket: Dewasa: RM8, Kanak-kanak: RM4\n",
                    Uri.parse("https://4.bp.blogspot.com/-ASJT5zoMFOQ/XDMBR2GiX6I/AAAAAAAABZM/etihOiMG7Ws8U4LXUekxGEMT4P4yrdO2wCLcBGAs/s1600/684C3623.jpg"),
                    Uri.parse("https://4.bp.blogspot.com/-ASJT5zoMFOQ/XDMBR2GiX6I/AAAAAAAABZM/etihOiMG7Ws8U4LXUekxGEMT4P4yrdO2wCLcBGAs/s1600/684C3623.jpg"),
                    new LatLng(1.565063, 104.026375),
                    CITY_JOHOR
            ));
        }});

    }};

    /**
     * Creates a list of geofences based on the city locations
     */
    public static List<Geofence> getGeofenceList() {
        List<Geofence> geofenceList = new ArrayList<Geofence>();
        for (String city : CITY_LOCATIONS.keySet()) {
            LatLng cityLatLng = CITY_LOCATIONS.get(city);
            geofenceList.add(new Geofence.Builder()
                    .setCircularRegion(cityLatLng.latitude, cityLatLng.longitude, TRIGGER_RADIUS)
                    .setRequestId(city)
                    .setTransitionTypes(TRIGGER_TRANSITION)
                    .setExpirationDuration(EXPIRATION_DURATION)
                    .build());
        }
        return geofenceList;
    }

    public static String getClosestCity(LatLng curLatLng) {
        if (curLatLng == null) {
            // If location is unknown return test city so some data is shown
            return TEST_CITY;
        }

        double minDistance = 0;
        String closestCity = null;
        for (Map.Entry<String, LatLng> entry: CITY_LOCATIONS.entrySet()) {
            double distance = SphericalUtil.computeDistanceBetween(curLatLng, entry.getValue());
            if (minDistance == 0 || distance < minDistance) {
                minDistance = distance;
                closestCity = entry.getKey();
            }
        }
        return closestCity;
    }
}
