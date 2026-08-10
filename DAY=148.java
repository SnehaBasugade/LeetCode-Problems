public static String kangaroo(int x1, int v1, int x2, int v2) {

    // If kangaroo 1 is behind
    if (x1 < x2 && v1 <= v2) {
        return "NO";
    }

    // If kangaroo 2 is behind
    if (x2 < x1 && v2 <= v1) {
        return "NO";
    }

    // Check whether they can meet
    if ((x2 - x1) % (v1 - v2) == 0) {
        return "YES";
    }

    return "NO";
}