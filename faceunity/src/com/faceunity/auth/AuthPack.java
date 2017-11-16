package com.faceunity.auth;

/**
 * 云信试用鉴权key，短时间会失效，无法商用，请自行向FU官方申请合法商用key。
 */
public class AuthPack {

    private final static byte trial_key[] = {-92, -98, -119, 38, 84, -57, -36, -25, -29, -63, 112, -28, 42, 6, 85, -26, 22, -87, -66, 21, 126, 123, -7, 78, -9, -86, 2, 94, -57, 23, 27, 107, -41, -25, 106, 118, 27, 18, -2, -44, 73, -103, -42, 20, -26, -36, 90, -49, -100, 63, -87, -97, -116, 70, -39, 22, 93, -50, -110, -55, 42, 61, 12, 50, -128, -89, 110, -30, 77, -9, 95, -24, -29, 115, 113, 93, -111, -65, 38, 48, -3, 27, 4, -57, -56, 17, -113, -9, 87, 72, -58, -70, -61, 14, 13, 93, -15, 31, -11, 106, 46, -91, -59, 104, -127, 4, 10, -11, -17, 119, -14, 105, -90, -75, 52, -21, -15, 41, -112, 54, -66, -1, -98, 36, -8, -91, -115, -125, 60, 119, -20, -70, 49, -12, 119, 25, -39, -20, -115, -59, 79, 79, -68, -122, -50, -64, 97, -24, -99, 126, -3, -2, 61, -44, -41, -32, -77, -57, -109, -71, 108, 87, 40, 102, 100, 57, -83, 69, -65, -57, 25, 45, -108, 63, -56, -31, 68, -68, 109, -23, 21, -87, 93, 44, -96, 46, 11, 104, -2, -126, 88, -121, -73, -89, -41, -108, 111, -117, -120, 94, 122, 103, -4, -59, 19, -114, 101, 62, 30, 20, -8, 67, -19, 100, 51, -16, 125, -124, 72, 118, 115, -63, -32, 103, 44, 90, -26, -19, 10, -14, 59, -85, 79, 63, 114, 7, 30, 60, -78, -22, 96, -119, -55, -66, -65, -43, 32, -64, -84, -105, 123, 53, 41, 13, 22, -57, 65, -39, 82, 87, -24, 97, 127, 118, 45, 67, 82, 66, 34, -36, -128, -28, -91, -24, -49, 23, -65, 44, -94, 83, 17, 44, 86, 58, -120, -57, -83, -16, -93, -111, -18, -17, 3, 71, -28, -19, 94, -5, 125, 84, 119, 11, -75, -84, 2, -6, -126, -93, 83, -103, -120, -39, 101, -45, 52, -43, -100, -70, -43, -121, 10, 96, -8, 8, 67, 42, -49, -104, -49, -65, -116, -9, -20, -104, -83, 59, 8, 54, -124, 16, 35, 30, -91, 122, -107, -98, 53, -48, -14, -86, 56, -88, -7, -1, 48, 92, 53, 92, -64, -126, -44, 120, 78, 120, 69, -90, 47, 122, -90, 32, 111, 73, 77, 105, 65, -75, 37, -15, 115, 94, -112, -114, 108, -93, 7, -37, -17, 16, 61, 33, -5, 83, -110, 124, -87, -50, -32, -50, -54, 89, -37, 27, -116, -26, -97, 93, 78, 25, 45, 61, -45, -107, -36, 69, 103, -110, -49, 47, 53, 3, 107, -93, 66, -102, -12, 40, 8, -59, 8, 79, 10, 15, 6, 82, -98, 0, -65, -91, 59, -1, -47, 92, -96, 127, -81, -78, -79, 56, 28, 112, 32, 49, -40, -84, 61, -39, 105, -19, 111, -23, 26, 88, 38, 107, -74, -80, 40, -105, -128, -49, -19, 19, 20, 35, 105, 50, -97, -20, -2, 65, 15, 61, -41, 66, 47, 20, -92, -119, 79, -37, 70, -126, -108, -38, -75, 28, 51, -45, 14, -30, -58, 2, 3, -28, -10, -22, -124, 1, -27, -74, -96, 68, -114, -73, 45, 124, -86, -15, 88, 10, -24, 107, 80, 61, -6, -65, 17, 17, 97, 120, 42, -68, -93, 123, 117, 12, -56, 1, 43, -53, 42, 106, -93, -22, 91, 126, -51, 114, -35, -40, -33, 29, 21, -44, -38, 46, -100, 108, -40, -102, 43, -11, -67, -98, 67, 15, -72, 117, -62, 53, -36, -24, -64, -110, 30, 124, 85, -90, -100, -80, 106, -110, -60, -28, -38, 114, -27, 87, 14, -52, -41, -10, 3, -63, 122, 105, -11, -119, 91, -33, -95, -127, 68, 12, -7, -124, -95, 101, 9, 16, 58, 94, -88, 79, -73, -78, 59, 88, 50, 54, -47, 121, 111, 87, 44, -89, 85, 77, 93, 124, 14, -116, 119, 43, -123, 25, -70, -22, -74, -16, -64, -77, -84, 109, 10, -24, -119, 82, -38, -14, -7, 105, 69, -81, 29, -125, -122, 37, 24, -26, 104, 122, -124, 107, -82, -62, -38, 119, -66, -28, -79, -61, -72, -109, -72, 46, 27, -14, 52, 68, 1, -77, -44, 116, 92, 66, 90, -99, 28, 25, -77, -113, -22, 41, -20, -127, 85, 34, -89, 51, 80, 17, 54, 85, -35, -25, 24, -45, 102, -71, -44, -7, 58, 61, -75, -59, -22, 82, 121, 108, 81, 80, 92, -27, -44, -39, -76, 69, -89, -103, -2, 38, -16, 64, 0, 126, -83, -96, -60, 96, 38, -123, -85, 85, 119, -117, 50, 114, -19, 122, 90, 57, -30, 84, 41, 50, -88, -51, 74, 75, 48, 86, 83, 87, -85, -99, 106, -62, -13, -83, -35, -106, -110, 53, 108, 14, -90, 5, 87, -11, -62, 70, -53, -53, -70, -50, 44, 104, -121, -6, -116, 10, 54, 12, -20, -112, -43, -83, -6, 103, 40, 7, 6, 96, 48, -93, -85, 17, 125, 79, -65, 42, 121, -58, -79, 54, 103, -118, 1, 47, -12, 45, -52, 106, -97, -66, 119, -115, -63, 4, 47, -100, -6, -84, -15, 73, 14, -51, -69, 6, 6, -1, -126, -107, 16, 15, -79, -31, -94, -64, 117, -13, 119, -102, -112, -97, -23, 10, -67, -42, -55, 65, 48, 76, 93, 55, 104, 47, 44, -96, -8, -109, 64, 98, -40, 74, -73, 118, 81, 32, 20, -65, -54, 71, -42, -103, -111, 62, 77, -71, -23, 12, -113, 63, -19, -93, 82, -58, -20, 24, 30, 43, 61, 59, -12, -20, -82, 24, -124, 124, 2, 12, -20, 119, -120, -93, 85, -20, 101, -122, 38, -122, -39, 92, 16, -60, -86, -39, 124, 115, -17, -1, -124, -104, -90, 0, 101, -126, 67, -81, 88, 3, 3, -118, 40, 24, -41, -84, -92, 96, -115, 28, 53, -115, -117, -104, -19, -60, 126, -48, -82, -52, -38, 77, -97, -100, 73, 45, -90, 43, -40, -51, 101, 99, -58, -29, 68, -101, -110, -91, -76, -112, -25, 78, 4, 74, -108, -100, 78, 73, -30, -31, 43, 55, 9, -6, -3, 73, 55, -102, -114, 20, 88, -46, -118, -66, 102, -115, 87, 102, -71, 114, -34, -115, -29, 123, -115, 16, 31, 18, -120, -21, -20, -48, 15, -84, -36, 72, 69, -5, 78, -106, 79, 11, -4, 68, 101, 2, -60, 78, -66, -34, 122, 6, 80, -53, 11, -108, 14, -111, -59, 65, 31, 59, -23, -74, 107, 44, 6, 56, 121, -125, -9, 51, -41, -114, 7, -34, -40, -57, -65, -11, 121, 4, 112, -60, -95, 119, -128, -85, 65, 122, 24, -93, -74, 24, -62, 23, -102, -71, -113, -119, -100, -86, -6, 62, -123, -110, -69, -9, 98, -20, -55, -108, 15, -103, -39, -67, 20, 116, 16, 99, 20, -14, -52, -28, -78, -118, -35, 94, -47, 126, 68, 30, -57, 10, -26, -28, -14, 87, 75, 60, 2, -25, 113, -91, 122, 57, -54, -105, 9, 61, 82, 117, -51, -22, -19, 38, -112, -94, 80, 3, 31};

    public static byte[] A() {
        return trial_key;
    }
}