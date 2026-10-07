/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class b {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    final byte[] i;
    final short[] j;
    int k;
    int l;
    int m;
    private int J;
    private int K;
    private int L;
    private int M;
    private b N;
    b n;
    b o;
    static short[][] p;
    static short[][] q;
    static int r;
    int s;
    static boolean t;
    static boolean u;
    static boolean v;
    static boolean w;
    static byte x;
    private final c O = new c();
    public static int[] y;
    public static byte[] z;
    public static short[] A;
    public static short[] B;
    private static final int[] P;
    private static final int[] Q;
    private static int R;
    private static int S;
    private static int T;
    private static int U;
    private static int V;
    private static int W;
    private static int X;
    private static int Y;
    private static final int[] Z;
    private static final int[] aa;
    private static b ab;
    static final int[] C;
    static int D;
    static int E;
    static int F;
    static int G;
    static boolean H;
    static int I;
    private static final c[] ac;
    private static int ad;

    public b() {
        this.i = new byte[19];
        this.j = new short[10];
        this.a();
    }

    public final void a(byte by, int n, int n2, a a2, int n3, byte by2, int n4, int n5, int n6, int n7, int n8) {
        this.i[0] = by;
        this.j[1] = (byte)n7;
        this.a = n << 8;
        this.b = n2 << 8;
        this.e = n4;
        this.j[0] = this.j[1];
        this.i[2] = (byte)n8;
        if ((n4 & 3) == 1) {
            this.i[16] = -1;
        } else if (this.i[2] >= 0) {
            this.i[16] = 0;
        }
        this.i[12] = (byte)n3;
        this.a(a2);
        this.i[9] = d.a(by2, this);
        this.i[10] = by2;
        if ((this.e & 3) == 3) {
            this.O.a(this.i[12] * 16);
            this.f();
            this.j[8] = this.j[4];
            this.j[9] = (short)(this.j[5] * 7 / 10);
            this.i[13] = -1;
        }
        this.j[7] = (short)n5;
        this.j[6] = (short)n6;
        this.e();
        this.i[18] = -1;
    }

    public final void a(byte by, int n, int n2, a a2, int n3, byte by2, int n4) {
        this.i[0] = by;
        this.j[1] = -1;
        this.a = n << 8;
        this.b = n2 << 8;
        this.e = n4;
        this.j[0] = -1;
        this.i[2] = -1;
        this.i[12] = (byte)n3;
        this.a(a2);
        if (a2 != null) {
            this.i[9] = d.a(by2, this);
            this.i[10] = by2;
            this.e();
        }
        this.i[18] = -1;
    }

    private void d(b b2) {
        b2.a = this.a;
        b2.b = this.b;
        b2.c = this.c;
        b2.d = this.d;
        b2.i[1] = this.i[1];
        b2.h = this.h;
        b2.e = this.e;
        b2.j[0] = this.j[0];
        b2.j[1] = this.j[1];
        b2.k = this.k;
    }

    public final void a() {
        if (this.i[11] >= 0) {
            b.j(this.i[11]);
        }
        this.i[0] = 0;
        this.a = 0;
        this.b = 0;
        this.f = -1;
        this.g = -1;
        this.i[4] = -1;
        this.i[12] = 0;
        this.O.a((a)null);
        if (this.i[9] > 0) {
            d.b(this.i[10], this.i[9]);
        }
        this.i[9] = 0;
        this.i[10] = -1;
        this.j[4] = 1;
        this.j[5] = 1;
        this.j[8] = 1;
        this.j[9] = 1;
        this.e = 0;
        this.j[7] = 0;
        this.j[6] = 0;
        this.i[2] = -1;
        this.i[16] = -1;
        this.n = null;
        this.o = null;
        this.c = 0;
        this.d = 0;
        this.i[1] = 0;
        this.h = 0;
        this.l = 0;
        this.i[6] = 0;
        this.N = null;
        this.i[3] = -1;
        this.L = -1;
        this.M = -1;
        this.i[8] = -1;
        this.i[11] = -1;
        this.i[13] = -1;
        this.i[17] = 0;
        this.s = 0;
        this.k = 0;
        this.i[18] = -1;
        d.b(this);
    }

    public final void a(byte by) {
        this.i[0] = by;
        this.l = 0;
    }

    public final void a(a a2) {
        this.O.a(a2);
        this.O.a = this.a;
        this.O.b = this.b;
    }

    public final void a(int n) {
        this.i[18] = (byte)n;
    }

    public final a b() {
        return this.O.c;
    }

    public final void b(int n) {
        int n2 = this.i[17] + 1;
        if (this.i[17] == 0) {
            this.i[17] = (byte)n;
        }
        int n3 = this.h;
        int n4 = q[r][n2] * 100 / d.a;
        int n5 = q[r][2] * 100 / d.a;
        if (n > 0) {
            if (this.i[17] == -1) {
                this.h += 2 * n5;
                if (this.h >= p[r][n2 + 1]) {
                    this.h = p[r][n2 + 1];
                    this.i[17] = 0;
                }
            } else {
                this.h += n4;
                if (this.h >= p[r][n2]) {
                    if (this.i[17] < 5 && t) {
                        this.i[17] = (byte)(this.i[17] + 1);
                    } else {
                        this.h = p[r][n2];
                    }
                }
            }
        } else if (n < 0) {
            if (this.i[17] == -1) {
                this.h += n4;
                if (this.h <= p[r][n2]) {
                    this.h = p[r][n2];
                }
            } else {
                this.h -= 2 * n5;
                if (n2 >= 1 && this.h <= p[r][n2 - 1]) {
                    this.h = p[r][n2 - 1];
                    this.i[17] = (byte)(this.i[17] - 1);
                }
            }
        }
        if (this.i[17] + 1 != n2 || n3 != this.h) {
            d.dc |= 2;
        }
    }

    public final void c(int n) {
        if (n == 0) {
            this.s = 0;
            return;
        }
        int n2 = this.h;
        if (this.h < 0) {
            this.h *= 17;
            this.h /= 10;
        } else if (this.h < p[r][2]) {
            this.h *= 3;
            this.h /= 2;
        } else if (this.h < p[r][3]) {
            this.h *= 5;
            this.h /= 4;
        }
        if (n > 0) {
            if (Math.abs(this.s) < Math.abs(this.h * 2 / 3)) {
                this.s += this.h * 60 / 100;
            }
        } else if (Math.abs(this.s) < Math.abs(this.h * 2 / 3)) {
            this.s -= this.h * 60 / 100;
        }
        this.h = n2;
    }

    private void C() {
        int n;
        if (this.j[1] == 32000) {
            this.j[0] = 32000;
        }
        if (this.i[0] == 3 && x >= 0) {
            this.c = this.h * 2 * d.j(128 - 16 * x) / d.a;
            this.d = this.h * 2 * d.i(128 - 16 * x) / d.a;
            this.e &= 0xFFDFFFFF;
            this.u();
            if ((this.e & 0x200000) != 0) {
                this.h = 0;
                this.i[17] = 0;
                d.dc |= 2;
                x = (byte)-1;
            }
            return;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (this.h != 0) {
            n2 = this.h * d.j(256 - 16 * this.i[1]) / d.a;
            n3 = this.h * d.i(256 - 16 * this.i[1]) / d.a;
            n4 = n2;
            n5 = n3;
            if ((this.e & 0x400000) != 0) {
                n4 >>= 2;
                n5 >>= 2;
            }
            if (n4 != 0 && this.c != n4 && (n4 * this.c <= 0 || n4 / this.c > 0)) {
                this.c += n4 * 100 >> 10;
            }
            if (n5 != 0 && this.d != n5 && (n5 * this.d <= 0 || n5 / this.d > 0)) {
                this.d += n5 * 100 >> 10;
            }
        }
        int n6 = this.s * 100 / d.a;
        if (u && Math.abs(n6) > 16) {
            n6 = 16 * (n6 >= 0 ? 1 : -1);
        }
        if (!t && n6 < 1024 && this.i[0] == 3 && this.i[17] > 0) {
            for (n = this.i[17]; n > 0 && this.h < p[r][n]; n = (int)((byte)(n - 1))) {
            }
            if (this.i[17] != n) {
                this.i[17] = n;
                this.b(1);
            }
        }
        if (this.c != 0 || this.d != 0) {
            int n7;
            int n8;
            this.u();
            if (Math.abs(this.c) < 512 && Math.abs(this.d) < 512 && (this.i[0] != 3 || !t && !w)) {
                this.i[17] = 0;
                this.f(0);
                d.dc |= 2;
                return;
            }
            if (this.s != 0) {
                n = this.i[1];
                this.k += n6;
                if (this.i[0] == 3) {
                    n8 = this.h * d.j(n6 >> 8) >> 8;
                    n7 = p[r][2] / 2;
                    if (this.h > n7) {
                        this.h = Math.max(n8, n7 + 1);
                        d.dc |= 2;
                    }
                }
                if (this.k < 0) {
                    this.k += 65536;
                } else if (this.k >= 65536) {
                    this.k -= 65536;
                }
                this.i[1] = (byte)((256 - (this.k >> 8) + 256 - 8) / 16 & 0xF);
                if (this.i[1] != n) {
                    this.e();
                }
                this.s = Math.abs(this.s) > 32 ? ((this.e & 0x400000) != 0 ? (this.s -= n6 / 16) : (this.s -= 2 * n6 / 16)) : 0;
            }
            n = this.c - n2;
            n8 = this.d - n3;
            n7 = Math.abs(n);
            int n9 = Math.abs(n8);
            if (n == 0 && n8 == 0) {
                this.s = 0;
                this.e &= 0xFFBFFFFF;
            } else {
                int n10;
                int n11 = ((this.d >> 8) * d.j(256 - this.i[1] * 16) - (this.c >> 8) * d.i(256 - this.i[1] * 16) >> 8) * d.a;
                int n12 = 10;
                if (n11 != 0) {
                    n12 = Math.abs(this.h) / Math.abs(n11);
                }
                if ((Math.abs(n11) > p[r][2] / 2 && n12 < 4 || n12 <= 1) && Math.abs(n11) < p[r][3]) {
                    n10 = d.j(Y >> 8);
                    int n13 = d.i(Y >> 8);
                    int n14 = d.j(this.k >> 8);
                    int n15 = d.i(this.k >> 8);
                    int n16 = (this.j[8] * n10 - this.j[9] * n13) / 3 >> 8;
                    int n17 = (this.j[9] * n10 + this.j[8] * n13) / 3 >> 8;
                    int n18 = (this.j[8] * n14 - this.j[9] * n15) / 3 >> 8;
                    int n19 = (this.j[9] * n14 + this.j[8] * n15) / 3 >> 8;
                    int n20 = (this.j[8] * n10 + this.j[9] * n13) / 3 >> 8;
                    int n21 = (-this.j[9] * n10 + this.j[8] * n13) / 3 >> 8;
                    int n22 = (this.j[8] * n14 + this.j[9] * n15) / 3 >> 8;
                    int n23 = (-this.j[9] * n14 + this.j[8] * n15) / 3 >> 8;
                    int n24 = Math.abs(n11) * (Math.abs(n11) * 153 / p[r][3]) / p[r][3];
                    n24 = n24 | n24 << 8 | n24 << 16;
                    if (this.s == 0 || n12 == 0) {
                        d.a(W + n16, X + n17, this.a + n18, this.b + n19, 2, n24);
                        d.a(W + n20, X + n21, this.a + n22, this.b + n23, 2, n24);
                    }
                    if (this.s <= 0 || n12 == 0) {
                        d.a(W - n20, X - n21, this.a - n22, this.b - n23, 3, n24);
                    }
                    if (this.s >= 0 || n12 == 0) {
                        d.a(W - n16, X - n17, this.a - n18, this.b - n19, 3, n24);
                    }
                    if (this.i[0] == 3) {
                        b.c(this, true);
                    }
                }
                n10 = q[r][2] * 4;
                if ((this.e & 0x400000) != 0) {
                    n10 = n10 * 2 / 3;
                }
                n = n * n10 * 100 / (d.a * (n9 + n7));
                n8 = n8 * n10 * 100 / (d.a * (n9 + n7));
                this.c = n7 < 1024 ? n2 : (this.c -= 2 * n);
                this.d = n9 < 1024 ? n3 : (this.d -= 2 * n8);
                this.e = this.h >= 0 || (Math.abs(n) + Math.abs(n8)) * 3 / 2 <= n10 ? (this.e &= 0xFFBFFFFF) : (this.e |= 0x400000);
            }
        } else {
            this.e &= 0xFFBFFFFF;
        }
        if (this.h != 0) {
            if (this.i[0] != 3) {
                n = this.h * 100 * 2 / (16 * d.a);
                this.h = n == 0 ? 0 : (this.h -= n);
            } else if (!(Math.abs(this.h) >= p[r][2] / 2 || t || v || w)) {
                this.h -= (this.h + 1) * 100 / (d.a * 2);
                d.dc |= 2;
            }
        }
        n = 256 - (this.k >> 8) + 7;
        if (this.i[1] != (n = n >> 4 & 0xF)) {
            this.i[1] = (byte)n;
            this.e();
        }
    }

    public final void c() {
        this.l += 100;
        this.m += 100;
        if (this == d.cd) {
            d.co += 100;
        }
        switch (this.i[0]) {
            case 4: {
                this.G();
                d.cn = this.j[0];
                return;
            }
            case 3: {
                if ((this.e & 0x2000) == 0) {
                    this.M += 100;
                    if (this.M > 200) {
                        this.e &= 0xFFFFFFFB;
                    }
                } else {
                    this.M = 0;
                    this.e &= 0xFFFFDFFF;
                }
                if (this.i[17] >= 3 && (this.e & 4) == 4) {
                    this.e &= 0xFFFFFFFB;
                }
            }
            case 5: {
                this.C();
                if (this.i[11] >= 0) {
                    b.f((int)this.i[11], this);
                }
                if (this.j[0] > 0 || this.m <= 4000) break;
                b.j(this.i[11]);
                this.i[11] = -1;
                this.i[13] = -1;
                this.a(7, null);
                if (this.i[0] != 3) break;
                d.dc |= 2;
                return;
            }
            case 6: {
                if (this.j[0] > 0) {
                    if (this.i[6] == 0 || this.i[6] != 8 && this.i[2] >= 0) {
                        if (d.cw >= 3 && (this.e & 0x20) == 32) {
                            this.a((byte)6, d.cd);
                            return;
                        }
                        if (this.i[15] == -1 || this.i[4] == -1) {
                            this.a((byte)9, (b)null);
                            return;
                        }
                        this.O();
                    } else {
                        this.P();
                    }
                } else {
                    this.C();
                    if (this.m > 4000) {
                        b.j(this.i[11]);
                        this.i[11] = -1;
                        this.i[13] = -1;
                        this.a(7, null);
                    }
                }
                if (this.i[11] < 0) break;
                b.f((int)this.i[11], this);
                return;
            }
            case 7: {
                if (d.cq == this || !this.O.a() && (d.d(this) || this.m <= 2000)) break;
                d.a(this, 7);
                d.a(3, this);
                return;
            }
            case 8: {
                this.e &= 0xFFFFFFE7;
                if ((this.e & 0x400) != 0) {
                    if (this.c != 1 && this.d != 1) {
                        this.u();
                        int n = this.c >= 0 ? 1 : -1;
                        int n2 = this.d >= 0 ? 1 : -1;
                        int n3 = (n * this.c + n2 * this.d >> 8) + 1;
                        this.c -= 26 * ((this.c >> 8) * 100 / n3);
                        this.d -= 26 * ((this.d >> 8) * 100 / n3);
                        if (n * this.c < 0) {
                            this.c = 0;
                        }
                        if (n2 * this.d < 0) {
                            this.d = 0;
                        }
                        if (this.j[0] <= 0 && n3 < 6400) {
                            d.a(W, X, this.a, this.b, 1, 0xDD0000);
                            d.a(W + 768, X + 1024, this.a + 1024, this.b + 768, 1, 0xFF0000);
                        }
                        if (Math.abs(this.c) >= 256 || Math.abs(this.d) >= 256) break;
                        this.c = 1;
                        this.d = 1;
                        this.l = 0;
                        return;
                    }
                    if (this.l <= 1000 && this.j[0] > 0) break;
                    this.e &= 0xFFFFFBFF;
                    if (this.j[0] <= 0) {
                        this.a(7, null);
                    }
                    this.e();
                    return;
                }
                if (this.i[2] >= 0) {
                    this.L();
                    return;
                }
                if (this.i[6] == 0) {
                    if (d.cw > 0 && (this.e & 0x20) != 0 && !d.ee) {
                        this.a((byte)6, d.cd);
                    }
                    if ((this.e & 0x20000) != 0 && this.b(d.cd) < 3037) {
                        d.cr = this;
                    }
                    this.M();
                    return;
                }
                this.N();
                return;
            }
            case 9: {
                if (this.l < this.J) break;
                d.a(0, this);
                return;
            }
            case 10: {
                if ((this.e & 0x800) != 0 || this.f == -1 || !d.cA) break;
                short[] sArray = d.bg[this.f & 0xFF];
                int n = (this.f >> 8 & 0xFF) * 6;
                short s = sArray[n + 3];
                int n4 = this.a + ((byte)sArray[n + 4] << 8);
                int n5 = this.b + (sArray[n + 4] >> 8 << 8);
                if ((byte)s < 0 || !d.cd.c(n4, n5, n4 + (sArray[n + 5] & 0xFF00), n5 + (sArray[n + 5] >>> 8 >> 8))) break;
                d.cu = s & 0xF;
                d.cv = s >>> 4 & 0xF;
                return;
            }
            case 2: {
                if ((this.e & 0x800) != 0 || this.f != -1 || this.l <= 25000) break;
                d.a(0, this);
                return;
            }
        }
    }

    public final void a(int n, b b2) {
        switch (this.i[0]) {
            case 3: {
                this.d(n, b2);
                return;
            }
            case 4: {
                this.e(n, b2);
                return;
            }
            case 5: 
            case 6: {
                this.c(n, b2);
                return;
            }
            case 8: {
                this.b(n, b2);
            }
        }
    }

    private void D() {
        d.a(2, this, 0);
        if (!d.ee) {
            this.a(12, null);
        }
        d.a(this, 7);
        d.b(this.i[10], this.i[9]);
        this.i[9] = d.a((byte)0, this);
        this.i[10] = 0;
        this.i[0] = 9;
        this.l = 0;
        this.J = 3000;
        this.e = 1;
        this.j[0] = 0;
        this.c = 0;
        this.d = 0;
        this.h = 0;
        this.i[1] = (byte)(this.i[1] & 0xFC);
        this.e();
        if (!d.ee) {
            d.a(d.bB[19], 0, 0, this.a, this.b + 2, 0);
        }
    }

    private void E() {
        this.a((byte)7);
        this.i[18] = -1;
        this.e &= 0xFFFFF7FF;
        this.a(d.bB[20]);
        this.e();
        if (!d.ee && d.d(this)) {
            d.w();
        }
        if (!d.ee) {
            d.a(d.bB[20], 25, 0, this.a, this.b, 0);
        }
        this.h = 0;
        this.m = 0;
        d.b(this.a, this.b, 35, this.j[8] * 3, this);
    }

    private void b(int n, b b2) {
        switch (n & 0xFF) {
            case 6: {
                if (this.i[2] != -1 || this.i[4] != -1) {
                    this.f(0);
                    int n2 = this.i[6];
                    if (this.i[2] >= 0) {
                        this.i[2] = -1;
                        if (this.i[6] == 0) {
                            n2 = this.i[3] == 0 || this.i[12] >= 2 ? 4 : 5;
                        }
                    } else if (this.i[6] != 6) {
                        n2 = this.i[3] == 0 || this.i[12] >= 2 ? 4 : 5;
                    }
                    this.a((byte)n2, b2);
                }
                if (this.j[0] <= 0) break;
                this.j[0] = (short)(this.j[0] - (n >> 8 & 0xFF));
                if (this.j[0] <= 0) {
                    this.j[0] = 0;
                    this.a(b2, true);
                    this.e |= 0x400;
                    this.e();
                }
                this.a(b2, n);
                return;
            }
            case 7: {
                this.D();
                if (this.i[12] >= 2) {
                    d.r(20);
                    return;
                }
                d.r(21);
                return;
            }
            case 9: {
                this.j[0] = (short)(this.j[0] - (n >> 8 & 0xFF));
                if (this.j[0] <= 0) {
                    this.j[0] = 0;
                }
                this.a(b2, n);
                if (d.ee && this.i[6] == 0) {
                    this.a((byte)4, (b)null);
                } else if ((this.e & 0x20) == 0 && this.i[6] == 0 && this.i[3] == 0) {
                    this.a((byte)4, b2);
                }
                if (b2 == null) {
                    this.J = this.a;
                    this.K = this.b;
                    return;
                }
                this.J = b2.a;
                this.K = b2.b;
                return;
            }
            case 11: {
                this.a(b2, false);
                if (Math.abs(b2.c) + Math.abs(b2.d) > 1000 / d.a << 8) {
                    this.b(9 | this.j[0] << 8, b2);
                } else {
                    this.b(2569, b2);
                }
                if ((this.e & 0x400) == 0) {
                    int n3 = (this.a - b2.a >= 0 ? 1 : -1) * 2048;
                    int n4 = (this.b - b2.b >= 0 ? 1 : -1) * 2048;
                    d.f(this.m() + n3, this.n() + n4, 1);
                    this.e &= 0xFFFFFFE7;
                    this.e |= 0x400;
                    if (this.i[2] >= 0) {
                        this.i[2] = -1;
                        if (this.i[6] == 0) {
                            this.a((byte)(this.i[3] == 0 || this.i[12] >= 2 ? 4 : 5), b2);
                        }
                    }
                }
                this.e();
                return;
            }
            case 1: {
                d.b(this.i[10], this.i[9]);
                this.i[9] = 0;
                this.i[10] = -1;
                this.a((byte)1, b2);
                return;
            }
            case 2: {
                if (this.i[6] != 1 && this.i[6] != 3) {
                    return;
                }
                if (!this.b(b2, false)) break;
                this.i[10] = 1;
                this.i[9] = d.a(this.i[10], this);
                boolean bl = false;
                for (int i = 0; i < d.et; ++i) {
                    if (this != d.eu[i]) continue;
                    this.a((byte)2, d.cd);
                    this.L = -1;
                    this.M = -1;
                    bl = true;
                    break;
                }
                if (bl) break;
                this.a((byte)(n >> 8), b2);
                return;
            }
            case 12: {
                if (this.i[8] < 0) break;
                b b3 = d.M(0);
                this.d(b3);
                b3.b += 515;
                b3.i[0] = 2;
                b3.e = 0;
                b3.j[9] = 1;
                if (this.i[8] == 0) {
                    this.i[8] = 6;
                }
                b3.j[9] = this.i[8] == 6 ? (short)d.a(50, 500) : (short)d.a(1, 5);
                b3.c = 0;
                b3.d = 0;
                b3.h = 0;
                b3.i[1] = 0;
                b3.a(d.bB[14]);
                b3.i[12] = this.i[8];
                b3.e();
                b3.i[9] = d.a((byte)0, b3);
                b3.i[10] = 0;
                this.i[8] = -1;
            }
        }
    }

    private void c(int n, b b2) {
        switch (n & 0xFF) {
            case 6: {
                this.d(n >> 8 & 0xFF);
                d.A(1);
                if ((this.e & 0x20) != 0 && this.i[0] != 5) {
                    d.A(4);
                }
                if (this.j[0] <= 0 && this.i[0] == 6) {
                    d.A(3);
                    if ((this.e & 0x20) != 0 && this.i[0] != 5) {
                        d.A(5);
                    }
                }
                if ((this.e & 0x800) == 0) break;
                d.a(this, n);
                return;
            }
            case 7: {
                if ((this.e & 0x800) != 0) {
                    d.a(this, n);
                }
                this.E();
                return;
            }
            case 9: {
                this.d(n >> 8 & 0xFF);
                return;
            }
            case 2: {
                if (this.i[0] == 5) {
                    return;
                }
                if (d.ed) {
                    this.i[0] = 5;
                    this.i[6] = 0;
                    return;
                }
                b b3 = d.M(2);
                b3.i[0] = 8;
                b3.e = 1;
                d.a(b3, this.a, this.b, (this.e & 0x20) == 32, -1);
                if (!b3.b(this, true)) {
                    d.a(2, b3);
                    return;
                }
                this.i[0] = 5;
                this.i[6] = 0;
                if ((this.e & 0x20) == 0) {
                    if (this.i[6] == 6) {
                        b3.a((byte)6, b2);
                    } else {
                        b3.a((byte)4, b2);
                    }
                    b3.h = b3.j[7];
                    b3.m = -2000;
                } else {
                    b3.a((byte)6, b2);
                    b3.h = 0;
                    b3.m = d.s[b3.i[3]];
                }
                b3.e();
                return;
            }
            case 3: {
                d.A(7);
                if ((this.e & 0x20) != 0 && this.i[0] != 5) {
                    d.A(8);
                }
                b2.e |= 0x100000;
                if (this.i[6] == 7) break;
                this.a((byte)7, b2);
            }
        }
    }

    private void a(b b2, boolean bl) {
        int n = this.a - b2.a;
        int n2 = this.b - b2.b;
        int n3 = (Math.abs(n2 += 24 * (n2 >= 0 ? 1 : -1) << 8) + Math.abs(n += 24 * (n >= 0 ? 1 : -1) << 8) >> 8) + 1;
        this.c = 32 * (n / n3);
        this.d = 32 * (n2 / n3);
        if (bl) {
            return;
        }
        this.c += Math.abs(b2.d) * ((n >> 8) + (n >= 0 ? 1 : -1)) / (n3 * 2);
        this.d += Math.abs(b2.c) * ((n2 >> 8) + (n2 >= 0 ? 1 : -1)) / (n3 * 2);
        this.i[1] = 0;
        if (this.d > 0) {
            this.i[1] = -4;
        } else if (this.d < 0) {
            this.i[1] = 4;
        } else if (this.c > 0) {
            this.i[1] = (byte)(this.i[1] / 2);
        } else if (this.c < 0) {
            this.i[1] = (byte)(8 - this.i[1] / 2);
        }
        if (this.i[1] < 0) {
            this.i[1] = (byte)(this.i[1] + 16);
        }
        b2.c = b2.c * 8 / 10;
        b2.d = b2.d * 8 / 10;
        this.u();
    }

    final void d(int n) {
        if (d.y(2) && this.i[0] == 3) {
            return;
        }
        this.j[0] = (short)(this.j[0] - n);
        if (this.j[0] <= 0) {
            this.j[0] = 0;
            if (this.i[13] < 0) {
                this.i[13] = 0;
                this.m = 0;
            } else {
                this.m += 50 * n;
            }
        } else if (this.i[11] < 0 && this.j[0] <= 13) {
            this.i[11] = b.c(this, false);
        }
        if ((this.e & 0x800) != 0 && this.i[2] != 0 && this.i[6] == 4 && this.j[0] < 20) {
            for (int i = 0; i < 2; ++i) {
                this.i[0] = 6;
                this.a(2, null);
            }
        }
    }

    private void F() {
        int n;
        int n2;
        if (!d.d(this)) {
            return;
        }
        int n3 = this.a - this.j[2] + this.j[4] / 2;
        int n4 = this.b - this.j[3] + this.j[5] / 2;
        n3 += -(B[this.i[1] * 2] > 0 ? 1 : (B[this.i[1] * 2] == 0 ? 0 : -1)) * (this.j[4] / 2);
        n4 += -(B[this.i[1] * 2 + 1] > 0 ? 1 : (B[this.i[1] * 2 + 1] == 0 ? 0 : -1)) * (this.j[5] / 2);
        this.e |= 0x18;
        if (this.i[3] == 0) {
            return;
        }
        if (this.N == null) {
            n2 = n3 - B[this.i[1] * 2] * 120;
            n = n4 - B[this.i[1] * 2 + 1] * 138;
        } else {
            n2 = this.N.m();
            n = this.N.n();
        }
        int n5 = n2 - n3;
        int n6 = n - n4;
        int n7 = 0;
        short s = this == d.cd ? d.p[this.i[3]] : d.t[this.i[3]];
        n7 = d.k(n5 * n5 + n6 * n6);
        if (n7 > 0) {
            int n8 = n5 * s / n7;
            int n9 = n6 * s / n7;
            d.a(n3, n4, n8, n9, this);
            if (this.i[3] == 3 || this.i[3] == 4) {
                d.a(n3, n4, n8 / 2, n9 / 2, this);
            }
        }
    }

    private void a(b b2, int n) {
        if (b2 != null && (b2.i[0] == 4 || b2.i[0] == 3)) {
            d.A(2);
            if ((this.e & 0x20) != 0 && this.i[0] != 5) {
                d.A(4);
            }
            if (this.j[0] <= 0) {
                d.A(3);
                if ((this.e & 0x20) != 0 && this.i[0] != 5) {
                    d.A(5);
                }
                if ((this.e & 0x800) == 2048) {
                    d.a(this, n);
                }
            }
        }
    }

    private boolean b(b b2, boolean bl) {
        if (this.i[0] != 8 && this.i[0] != 4) {
            return false;
        }
        int n = b2.i[1] * 16;
        int n2 = 0;
        if (!bl) {
            ++n2;
        }
        while (n2 < 4) {
            int n3;
            int n4;
            if (n2 == 0) {
                n4 = b2.j[8] * d.j(n) / 12 - b2.j[9] * d.i(n) / 2 >> 8;
                n3 = -b2.j[9] * d.j(n) / 2 - b2.j[8] * d.i(n) / 12 >> 8;
                n4 -= 5376 * d.i(n) >> 8;
                n3 -= 3840 * d.j(n) >> 8;
                this.i[1] = (byte)(b2.i[1] + 4 & 0xF);
            } else if (n2 == 1) {
                n4 = b2.j[8] * d.j(n) / 12 + b2.j[9] * d.i(n) / 2 >> 8;
                n3 = b2.j[9] * d.j(n) / 2 - b2.j[8] * d.i(n) / 12 >> 8;
                n4 += 5376 * d.i(n) >> 8;
                n3 += 3840 * d.j(n) >> 8;
                this.i[1] = (byte)(b2.i[1] + 12 & 0xF);
            } else if (n2 == 2) {
                n4 = b2.j[8] * d.j(n) / 2 - b2.j[9] * d.i(n) / 12 >> 8;
                n3 = -b2.j[9] * d.j(n) / 12 - b2.j[8] * d.i(n) / 2 >> 8;
                n4 += 5376 * d.j(n) >> 8;
                n3 -= 3840 * d.i(n) >> 8;
                this.i[1] = (byte)(b2.i[1] + 0 & 0xF);
            } else {
                n4 = -b2.j[8] * d.j(n) / 2 - b2.j[9] * d.i(n) / 12 >> 8;
                n3 = -b2.j[9] * d.j(n) / 12 + b2.j[8] * d.i(n) / 2 >> 8;
                n4 -= 5376 * d.j(n) >> 8;
                n3 += 3840 * d.i(n) >> 8;
                this.i[1] = (byte)(b2.i[1] + 8 & 0xF);
            }
            this.a = b2.a + n4;
            this.b = b2.b + n3;
            this.w();
            if (!this.e(false)) break;
            if (n2 == 3) {
                this.a = b2.a;
                this.b = b2.b;
            }
            ++n2;
        }
        return true;
    }

    private void G() {
        if ((this.e & 0x200) == 512) {
            return;
        }
        if (!d.cD) {
            if ((this.e & 0x100) == 256) {
                this.t();
                return;
            }
            if ((this.e & 0x400) == 1024) {
                if (this.c != 1 && this.d != 1) {
                    this.t();
                    this.w();
                    this.e(true);
                    this.a(d.ff[3], true, true);
                    int n = this.c >= 0 ? 1 : -1;
                    int n2 = this.d >= 0 ? 1 : -1;
                    int n3 = (n * this.c + n2 * this.d >> 8) + 1;
                    this.c -= 28 * ((this.c >> 8) * 100 / n3);
                    this.d -= 28 * ((this.d >> 8) * 100 / n3);
                    if (n * this.c < 0) {
                        this.c = 0;
                    }
                    if (n2 * this.d < 0) {
                        this.d = 0;
                    }
                    if (Math.abs(this.c) < 256 && Math.abs(this.d) < 256) {
                        this.c = 1;
                        this.d = 1;
                        this.l = 0;
                        return;
                    }
                } else if (this.l > 1000) {
                    this.c = 0;
                    this.d = 0;
                    d.cd.i[1] = (byte)(d.cd.i[1] + 1);
                    d.cd.i[1] = (byte)(d.cd.i[1] & 0xF);
                    this.e &= 0xFFFFFBFF;
                    if (this.j[0] <= 0) {
                        this.j[0] = 0;
                        this.a(7, null);
                    }
                    d.cD = true;
                    this.e();
                }
                return;
            }
            this.o();
            this.e(1000);
            if (this.N != null && this.b(this.N) > 25) {
                this.g(d.a);
            } else {
                this.h(d.a * 3);
            }
        }
        this.u();
        if (this.a == W && this.b == X && (this.c != 0 || this.d != 0) && (this.e & 0x1C0) == 0) {
            d.cD = true;
            this.N = null;
            d.cq = null;
            this.l = 0;
            this.e &= 0xFFFFFDFF;
        }
    }

    private void d(int n, b b2) {
        switch (n & 0xFF) {
            case 2: {
                this.e &= 0xFFFFFFF7;
                this.e &= 0xFFFFFFFB;
                if (!d.ce.b(this, true)) {
                    return;
                }
                int n2 = d.ce.a;
                int n3 = d.ce.b;
                int n4 = d.cd.h / 27 * (d.cd.h / 27) / d.a;
                d.a(this, 2);
                this.i[0] = 5;
                d.cd = d.ce;
                d.ce = null;
                d.fY = d.cd;
                this.d(d.cd);
                d.cd.i[0] = 4;
                d.cd.e = 2;
                d.cd.j[0] = d.cn;
                d.cd.j[1] = 100;
                d.cd.h = 1;
                d.cd.i[1] = (byte)(d.cd.i[1] + 4);
                d.cd.i[1] = (byte)(d.cd.i[1] & 0xF);
                d.cd.i[1] = (byte)(d.cd.i[1] & 0xFFFFFFFC);
                if (n4 >= 25) {
                    d.cd.e |= 0x400;
                    d.cD = false;
                    d.cd.e(9 | (n4 - 20) / 5 << 8, null);
                    d.f(d.cd.m(), d.cd.n(), 1);
                } else {
                    d.cd.s();
                }
                d.cd.e();
                d.B();
                d.cd.a = n2;
                d.cd.b = n3;
                d.cd.i[9] = d.a((byte)1, d.cd);
                d.cd.i[10] = 1;
                d.cA = true;
                d.dc |= 4;
                d.dc |= 2;
                for (int i = 0; i < d.et; ++i) {
                    d.eu[i].a((byte)2, d.cd);
                }
                break;
            }
            case 6: {
                if (d.y(1)) {
                    return;
                }
                this.d(n >> 8 & 0xFF);
                return;
            }
            case 7: {
                if (!d.ed) {
                    this.a(2, this);
                } else {
                    d.a(this, n);
                }
                this.E();
                if (d.ed) break;
                d.cd.a(7, null);
                return;
            }
            case 8: {
                d.cg = d.cf;
                d.cf = (byte)(d.aZ[d.cI][d.ct * 5 + 2] & 0xFF);
                d.ch = (byte)(d.aZ[d.cI][d.ct * 5 + 2] >> 8);
                d.ci = (byte)(d.aZ[d.cI][d.ct * 5 + 2] >> 16);
                d.cj = this.i[14];
                d.ck = this.j[0];
                d.cl = this.i[18];
                d.t(6);
                return;
            }
            case 10: {
                if (this.i[17] < 3) {
                    if ((this.e & 4) != 4) {
                        this.e |= 4;
                        d.co = 0;
                    } else if (d.co >= 1500) {
                        this.a(2, b2);
                        d.cd.a(10, b2);
                    }
                }
                this.e |= 0x2000;
                return;
            }
            case 4: {
                this.e(b2);
                return;
            }
            case 9: {
                this.d(n >> 8 & 0xFF);
            }
        }
    }

    private void e(int n, b b2) {
        switch (n & 0xFF) {
            case 1: {
                int n2 = this.b(b2);
                if (n2 < 0 || n2 > 33750) {
                    d.cD = true;
                    this.e &= 0xFFFFFDFF;
                    return;
                }
                d.cD = false;
                this.N = b2;
                if (n2 > 2646) {
                    this.e &= 0xFFFFFDFF;
                    return;
                }
                if (b2.h > 1366) {
                    d.cD = true;
                    this.N = null;
                    d.cq = null;
                    d.co = 0;
                    this.e &= 0xFFFFFDFF;
                    this.e &= 0xFFFFFFF7;
                    this.e();
                    b2.i[6] = 9;
                    return;
                }
                if ((this.e & 0x200) == 0) {
                    b2.a(3, this);
                    if (b2.i[0] != 5) {
                        this.e |= 8;
                    }
                    this.h = 0;
                    this.s();
                    this.e();
                    this.e |= 0x200;
                    d.co = 0;
                    return;
                }
                if (b2.i[0] == 6) {
                    if ((b2.e & 0x20) == 32 && d.co > 375) {
                        b2.a(2, b2);
                        d.A(10);
                        d.cD = true;
                        this.e = 2;
                        this.e();
                        return;
                    }
                    if (d.co < 1500) {
                        return;
                    }
                    b2.a(2, b2);
                } else if (d.co < 750) {
                    return;
                }
                if ((b2.e & 0x100000) == 0) {
                    d.A(6);
                }
                b2.e |= 0x100000;
                if (b2.i[8] >= 0) {
                    if (b2.i[8] == 6) {
                        d.e(6, d.a(50, 500));
                    } else {
                        d.e(b2.i[8], d.a(1, 5));
                    }
                    b2.i[8] = -1;
                }
                d.ce = this;
                d.b(this.i[10], this.i[9]);
                this.i[9] = 0;
                this.i[10] = -1;
                d.fY = d.cd = b2;
                b2.i[0] = 3;
                b2.k = 256 - (b2.i[1] << 4) << 8;
                b2.i[17] = 0;
                b2.s = 0;
                b2.f = -1;
                b2.i[6] = 0;
                b2.e();
                d.cA = false;
                d.cD = true;
                d.a(b2, 1);
                d.a(d.m(d.bt[d.bs][b2.i[14] * 3 + 2]), 0, true);
                if (d.dj < 18) {
                    d.dj = 320;
                    d.dc |= 0x31;
                }
                r = d.bt[d.bs][b2.i[14] * 3 + 2] - 156;
                x = (byte)-1;
                d.dc |= 4;
                d.dc |= 2;
                return;
            }
            case 4: {
                this.e(b2);
                if (d.cm[this.i[3]] > 0 || this.i[3] == 1) break;
                byte by = this.i[3];
                do {
                    this.i[3] = (byte)(this.i[3] + 1);
                    this.i[3] = (byte)(this.i[3] % 6);
                } while (d.cm[this.i[3]] <= 0 && this.i[3] != by);
                if (this.i[3] == by) {
                    d.a(d.m(60), 0, true);
                    this.i[3] = 1;
                    return;
                }
                if (this.i[3] == 5) {
                    d.x();
                }
                d.dc |= 4;
                return;
            }
            case 6: {
                if (d.y(1)) {
                    return;
                }
                this.j[0] = (short)(this.j[0] - (n >> 8 & 0xFF));
                if (!d.cD && d.cq != null) {
                    this.j[0] = (short)(this.j[0] - 6);
                }
                d.dc |= 0x102;
                if (this.j[0] > 0) break;
                this.j[0] = 0;
                this.a(7, b2);
                return;
            }
            case 7: {
                if (d.cB) {
                    return;
                }
                this.h = 0;
                this.e = 2;
                this.j[0] = 0;
                d.cn = 0;
                this.s();
                this.e();
                if (!d.ee) {
                    d.a(d.bB[19], 0, 0, this.a, this.b + 2, 0);
                }
                if (b2 != null) {
                    d.ce = b2;
                }
                d.cB = true;
                d.bD = 0;
                d.bF = 0;
                d.bE = 0;
                if (d.dP < 0) break;
                d.N();
                return;
            }
            case 8: {
                d.cg = d.cf;
                d.cf = (byte)(d.aZ[d.cI][d.ct * 5 + 2] & 0xFF);
                d.ch = (byte)(d.aZ[d.cI][d.ct * 5 + 2] >> 8);
                d.ci = (byte)(d.aZ[d.cI][d.ct * 5 + 2] >> 16);
                d.t(6);
                return;
            }
            case 9: {
                if (d.y(1)) {
                    return;
                }
                this.j[0] = (short)(this.j[0] - (n >>> 8 & 0xFF));
                d.dc |= 2;
                if ((n >>> 8 & 0xFF) > 0) {
                    d.dc |= 0x100;
                }
                if (this.j[0] > 0) break;
                this.j[0] = 0;
                this.a(7, null);
                return;
            }
            case 10: {
                this.h = 0;
                this.e = 2;
                this.e |= 0x400;
                this.s();
                this.e();
                d.cE = true;
                d.bD = 0;
                d.bF = 0;
                d.bE = 0;
                if (d.dP < 0) break;
                d.N();
                return;
            }
            case 11: {
                this.a(b2, false);
                if ((this.e & 0x400) == 0 && Math.abs(b2.c) + Math.abs(b2.d) > 1000 / d.a << 8) {
                    this.e(2569, b2);
                    int n3 = (this.a - b2.a >= 0 ? 1 : -1) * 2048;
                    int n4 = (this.b - b2.b >= 0 ? 1 : -1) * 2048;
                    d.f(this.m() + n3, this.n() + n4, 1);
                }
                this.h = 0;
                this.e = 2 | this.e & 0x100;
                this.e |= 0x400;
                d.cq = null;
                d.cp = null;
                d.cD = false;
                this.e();
            }
        }
    }

    private void e(b b2) {
        this.N = b2;
        int n = this.i[3];
        if (this.i[0] == 3) {
            n = 3;
        }
        if (d.cC) {
            return;
        }
        if (this.l > d.n[n]) {
            int n2 = d.cm[n];
            this.l = 0;
            if (n != 1) {
                if (n2 <= 0) {
                    return;
                }
                if (--n2 >= 0) {
                    d.cm[n] = n2;
                    d.dc |= 4;
                } else {
                    return;
                }
                if ((n2 & 0xFFFF) == 0 && (n2 & 0xFFFF0000) != 0) {
                    d.cC = true;
                }
            }
            if ((this.e & 0x18) != 24) {
                this.e |= 0x18;
                this.e();
            }
            d.av = d.au;
            d.a(d.cd, 4);
            d.bH = true;
            d.A(0);
            if (b2 != null) {
                int n3 = this.b(b2);
                if (n != 5 && n3 > 1350 && d.a(0, 100) < d.q[n]) {
                    if (n > 1) {
                        d.f(b2.m() + (d.a(-32, 33) << 8), b2.n() + (d.a(-32, 33) << 8), 0);
                    }
                    return;
                }
                int n4 = this.a - b2.a;
                int n5 = this.b - b2.b;
                int n6 = d.l[n];
                if (b2.i[0] == 8) {
                    int n7 = 0;
                    int n8 = 0;
                    if (Math.abs(n4) > Math.abs(n5)) {
                        n7 = -(n4 >= 0 ? 1 : -1) * 2048;
                    } else {
                        n8 = -(n4 >= 0 ? 1 : -1) * 2048;
                    }
                    d.f(b2.m() + n7, b2.n() + n8, 1);
                    if (n3 < 1350) {
                        n6 += 15;
                    }
                } else if (b2.i[0] == 6 || b2.i[0] == 5) {
                    int n9 = 0;
                    int n10 = 0;
                    if (Math.abs(n4) > Math.abs(n5)) {
                        n9 = -(n4 >= 0 ? 1 : -1) * 2048;
                    } else {
                        n10 = -(n4 >= 0 ? 1 : -1) * 2048;
                    }
                    d.f(b2.m() + n9, b2.n() + n10, 0);
                }
                if (n == 5) {
                    d.f(b2.m(), b2.n(), 3);
                    d.b(b2.a + (n4 >= 0 ? 1 : -1) * (d.a(1, 4) * d.a(1, 4) << 8), b2.b + (n5 >= 0 ? 1 : -1) * (d.a(1, 4) * d.a(1, 4) << 8), n6, 33750, this);
                    d.w();
                    d.a(d.bB[20], 25, 0, b2.a, b2.b, 0);
                    return;
                }
                if (n > 1) {
                    d.f(b2.m() + (n4 >= 0 ? 1 : -1) * (d.a(10, 24) << 8), b2.n() + (n5 >= 0 ? 1 : -1) * (d.a(10, 24) << 8), 0);
                }
                b2.a(6 | (n6 & 0xFF) << 8, this);
                return;
            }
            if (n >= 1) {
                int n11 = -1;
                int n12 = -1;
                switch (this.d()) {
                    case 0: {
                        n11 = d.fW + 61440 - 2560;
                        n12 = this.b;
                        break;
                    }
                    case 1: {
                        n11 = this.a;
                        n12 = d.fX + 2560;
                        break;
                    }
                    case 2: {
                        n11 = d.fW + 2560;
                        n12 = this.b;
                        break;
                    }
                    case 3: {
                        n11 = this.a;
                        n12 = d.fX + 70656 - 2560;
                    }
                }
                if (n == 5) {
                    d.b(n11, n12, (int)d.l[5], 33750, this);
                    d.f(n11, n12, 3);
                    d.w();
                    d.a(d.bB[20], 25, 0, n11, n12, 0);
                    return;
                }
                d.f(n11, n12, 0);
            }
        }
    }

    public final int d() {
        if ((this.i[1] & 2) != 0) {
            if (this.i[1] == 2 || this.i[1] == 14) {
                return 0;
            }
            return 2;
        }
        return this.i[1] >> 2;
    }

    public final void e() {
        int n = -1;
        switch (this.e & 3) {
            case 0: {
                if (this.i[0] == 10) {
                    if (this.i[12] >= 2) {
                        n = 15;
                        if (this.j[0] <= 0) {
                            n += 4;
                        }
                        n += 208;
                        n += (this.i[12] - 2) * 20;
                        break;
                    }
                    n = 33;
                    if (this.j[0] <= 0) {
                        n += 10;
                    }
                    n += 120 + this.i[12] * 44;
                    break;
                }
                n = this.i[12];
                break;
            }
            case 1: {
                if (this.i[12] >= 2) {
                    n = (this.i[1] >> 2) * 5;
                    if (this.j[0] <= 0 || (this.e & 0x400) == 1024) {
                        n += 4;
                    } else if (this.h > 0) {
                        n = this.h < 1280 ? ++n : (n += 2);
                    }
                    n += 208;
                    n += (this.i[12] - 2) * 20;
                    break;
                }
                n = (this.i[1] >> 2) * 11;
                if (this.j[0] <= 0 || (this.e & 0x400) == 1024) {
                    n += 10;
                } else if (this.h == 0) {
                    if ((this.e & 8) == 8) {
                        n = this.H();
                    }
                } else {
                    n = this.h < 1280 ? ++n : (n += 2);
                }
                n += 120 + this.i[12] * 44;
                break;
            }
            case 2: {
                n = this.d() * 30;
                if (this.j[0] <= 0 || (this.e & 0x400) == 1024) {
                    n += 29;
                    break;
                }
                if ((this.e & 0x100) == 256) {
                    n += 27;
                    break;
                }
                if (this.h == 0) {
                    if ((this.e & 8) != 8) break;
                    n = this.I();
                    break;
                }
                n += 2;
                break;
            }
            case 3: {
                if (this.i[0] == 7) {
                    n = (this.i[1] >> 1) + 16;
                    break;
                }
                n = this.i[1];
                n += this.i[12] * 16;
            }
        }
        this.O.a(n);
        this.f();
    }

    private int a(int n, b b2, int n2, int n3, int n4, int n5, boolean bl) {
        if (b2 == null) {
            n += n2;
        } else {
            int n6 = d.b(b2.a - this.a, b2.b - this.b);
            n = n6 % 3 == 0 ? 0 + n2 : (n6 % 3 == 1 ? 0 + n3 : 0 + n4);
            n += n5 * ((n6 + 1) % 12 / 3);
            if (bl) {
                this.i[1] = (byte)(n / n5 << 2);
            }
        }
        return n;
    }

    private int H() {
        int n = (this.i[1] >> 2) * 11;
        n = this.a(n, this.N, 3, 7, 5, 11, false);
        if (this.N != null && (this.e & 0x18) == 24) {
            ++n;
        }
        return n;
    }

    private int I() {
        int n = this.d() * 30;
        int n2 = this.i[3] - 1;
        if (this.i[3] > 3) {
            --n2;
        } else if (this.i[3] == 3) {
            n2 = 0;
        }
        n = this.a(n, d.cp, 3, 19, 11, 30, true);
        n += (n2 *= 2);
        if ((this.e & 0x18) == 24) {
            ++n;
        }
        return n;
    }

    public final void f() {
        this.O.a = this.a;
        this.O.b = this.b;
        int[] nArray = this.O.c();
        this.j[2] = (short)(this.a - nArray[0]);
        this.j[3] = (short)(this.b - nArray[1]);
        this.j[4] = (short)(nArray[2] - nArray[0]);
        this.j[5] = (short)(nArray[3] - nArray[1]);
    }

    public final void g() {
        int n;
        int n2;
        int n3;
        Object object;
        int n4 = this.a;
        int n5 = this.b;
        Graphics graphics = d.am;
        if (!d.d(this)) {
            return;
        }
        n4 = (n4 >> 8) + d.bI;
        n5 = (n5 >> 8) + d.bJ;
        int n6 = d.j(((int)d.au + n4 - d.bI + n5 - d.bJ & 0xFF) * 256 / 16 & 0xFF) * 3 >> 8;
        if (this.i[0] == 10 && (this.e & 0x800) == 0 && this.f != -1) {
            object = d.bg[this.f & 0xFF];
            n3 = (this.f >> 8 & 0xFF) * 6;
            n2 = object[n3 + 3];
            n = ((int)d.au >> 2) % y.length;
            graphics.setColor(y[n]);
            graphics.drawArc(n4 + (byte)object[n3 + 4], n5 + (object[n3 + 4] >> 8), object[n3 + 5] & 0xFF, object[n3 + 5] >>> 8, 0, 360);
            graphics.drawArc(n4 + (byte)object[n3 + 4] - 1, n5 + (object[n3 + 4] >> 8) - 1, (object[n3 + 5] & 0xFF) + 2, (object[n3 + 5] >>> 8) + 2, 0, 360);
            if ((n2 & 0xF) == 2 && d.dq[(n2 >>> 4 & 0xF) * 10 + 5] == -1) {
                d.bB[1].a(graphics, 5, 0, n4 + (byte)object[n3 + 4] + (object[n3 + 5] & 0xFF) / 2, n5 + (object[n3 + 4] >> 8) - n6, 0, 0, 0);
            } else if ((n2 & 0xF) != 0) {
                d.bB[1].a(graphics, (int)d.dk[(n2 & 0xF) * 8 + 7], 0, n4 + (byte)object[n3 + 4] + (object[n3 + 5] & 0xFF) / 2, n5 + (object[n3 + 4] >> 8) - n6, 0, 0, 0);
            }
            if (n2 != 0) {
                return;
            }
        }
        if (this.i[0] == 8 || this.i[0] == 4) {
            if ((this.e & 0x18) == 24) {
                graphics.setColor(0xFFFFFF);
                graphics.fillArc(n4 - 9, n5, 18, 8, 0, 360);
            } else if (this.i[0] == 8 && (this.i[6] == 2 || this.i[6] == 3 || (this.e & 0x800000) != 0)) {
                graphics.setColor(65280);
                graphics.fillArc(n4 - 9, n5, 18, 8, 0, 360);
            } else if (d.ee && (this.e & 0x1000) != 0) {
                graphics.setColor(16441133);
                graphics.fillArc(n4 - 9, n5, 18, 8, 0, 360);
            } else if (!d.bY) {
                d.bB[25].a(graphics, 6, n4 - 8, n5 - 2, 0);
            }
        } else if (d.ee && this.i[0] == 9) {
            d.bB[19].a(d.fF, 0, (this.a >> 8) - d.fU - d.eK, (this.b >> 8) - d.fV - d.eL + 5, 0, 0, 0);
        }
        if (this.i[0] == 2) {
            n5 -= 4 + n6;
        }
        this.b(n4, n5);
        if (this.i[0] == 3 && (this.e & 0x18) == 24 && (d.av == d.au || d.av == d.au + 1L)) {
            a a2 = this.O.c;
            object = a2;
            n3 = a2.m[object.l[this.O.d] * 5] & 0xFF;
            n2 = n4 + object.j[(object.h[n3] << 2) + 1];
            n = n5 + object.j[(object.h[n3] << 2) + 2];
            d.bB[2].a(d.am, 382 + this.i[1] / 2, n2, n, 0, 0, 0);
        }
        if (this.i[0] == 5 || this.i[0] == 6 || this.i[0] == 3) {
            short s = d.bt[d.bs][this.i[14] * 3 + 2];
            if (s == 156 || s == 163) {
                if (this.i[6] == 6) {
                    n3 = (int)d.au % d.bB[23].a(this.i[1]);
                    d.bB[23].a(d.am, (int)this.i[1], n3, n4, n5 - (this.O.e & 1), 0, 0, 0);
                } else {
                    d.bB[23].a(d.am, this.i[1] + 16, 0, n4, n5 - (this.O.e & 1), 0, 0, 0);
                }
            }
            if (this.i[13] >= 0) {
                a a3 = null;
                n2 = this.i[1];
                a3 = this.j[0] <= 0 ? d.bB[20] : d.bB[23];
                if (a3 != null) {
                    if (this.i[13] >= a3.a(n2)) {
                        this.i[13] = 0;
                    }
                    a3.a(d.am, n2, (int)this.i[13], n4, n5, 0, 0, 0);
                    this.i[13] = (byte)((long)this.i[13] + (d.au & 1L));
                }
            }
            if (d.ed && this.i[2] >= 0) {
                int n7 = 0;
                while (d.ek[n7] != this) {
                    n7 = (byte)(n7 + 1);
                }
                if (n7 < 3) {
                    d.bB[24].a(graphics, n7 + 1, n4, n5 - 10, 0, 0, 0);
                }
            }
        }
        if ((this.i[0] == 6 || this.i[0] == 3) && (d.bY || d.bZ)) {
            int n8 = this.O.d % 16;
            int n9 = 0;
            if (this.i[14] == 7 || this.i[14] == 8) {
                n9 = 16;
            }
            if (this.i[14] == 4 || this.i[14] == 5) {
                n9 = 32;
            }
            if (d.ee) {
                d.bB[25].a(graphics, n9 + n8, n4, n5, 0, 0, 0);
            } else {
                d.c(n9 + n8, n4, n5 - (this.O.e & 1));
            }
        }
        if ((this.e & 0x20000) != 0) {
            this.h();
        }
        if (this.i[0] == 4 || this.i[0] == 8) {
            if ((this.e & 0x18) != 0) {
                int n10 = (this.e & 2) == 2 ? this.d() * 30 : (this.i[1] >> 2) * 11;
                if ((this.e & 8) == 8) {
                    int n11 = n10 = this.i[0] == 4 ? this.I() : this.H();
                }
                if (this.i[0] == 8) {
                    n10 += 120 + this.i[12] * 44;
                }
                this.O.b(n10);
                return;
            }
            this.O.b();
            return;
        }
        if ((this.i[0] == 5 || this.i[0] == 3 || this.i[0] == 6) && Math.abs(this.h) < 1000) {
            return;
        }
        this.O.b();
    }

    public final void a(int n, int n2, int n3) {
        int n4 = this.m() >> 8;
        int n5 = this.n() >> 8;
        n4 += d.bI;
        n5 += d.bJ;
        Graphics graphics = d.am;
        if (n >= 0) {
            graphics.setColor(n);
        } else if (this.j[0] <= 0) {
            graphics.setColor(0);
        } else if (this.j[0] < this.j[1] / 2) {
            graphics.setColor(255, this.j[0] * 255 / this.j[1], 0);
        } else {
            graphics.setColor(255 - (this.j[0] - this.j[1] / 2) * 255 / this.j[1], 255, 0);
        }
        int n6 = n3 > 12 ? n2 * 2 : n2 * 2 * 25 / ((n3 + 1) * 2);
        graphics.drawLine(n4 - n6 + 0, n5 - 3, n4 - n6 + 0, n5 + 3);
        graphics.drawLine(n4 - n6 + 1, n5 - 2, n4 - n6 + 1, n5 + 2);
        graphics.drawLine(n4 - n6 + 2, n5 - 1, n4 - n6 + 2, n5 + 1);
        graphics.drawLine(n4 - n6 + 3, n5 - 0, n4 - n6 + 3, n5 + 0);
        graphics.drawLine(n4 + n6 - 0, n5 - 3, n4 + n6 - 0, n5 + 3);
        graphics.drawLine(n4 + n6 - 1, n5 - 2, n4 + n6 - 1, n5 + 2);
        graphics.drawLine(n4 + n6 - 2, n5 - 1, n4 + n6 - 2, n5 + 1);
        graphics.drawLine(n4 + n6 - 3, n5 - 0, n4 + n6 - 3, n5 + 0);
        graphics.drawLine(n4 - 3, n5 - n6 + 0, n4 + 3, n5 - n6 + 0);
        graphics.drawLine(n4 - 2, n5 - n6 + 1, n4 + 2, n5 - n6 + 1);
        graphics.drawLine(n4 - 1, n5 - n6 + 2, n4 + 1, n5 - n6 + 2);
        graphics.drawLine(n4 - 0, n5 - n6 + 3, n4 + 0, n5 - n6 + 3);
    }

    public final void a(int n, int n2) {
        int n3 = this.m() >> 8;
        int n4 = this.n() >> 8;
        Graphics graphics = d.am;
        graphics.setColor(n2 * 10 & 0xFF, 255, n2 * 10 & 0xFF);
        graphics.drawLine((n3 += d.bI) - n, (n4 += d.bJ) - n, n3 - n / 2, n4 - n);
        graphics.drawLine(n3 - n, n4 - n, n3 - n, n4 - n / 2);
        graphics.drawLine(n3 - n, n4 + n, n3 - n / 2, n4 + n);
        graphics.drawLine(n3 - n, n4 + n, n3 - n, n4 + n / 2);
        graphics.drawLine(n3 + n, n4 - n, n3 + n / 2, n4 - n);
        graphics.drawLine(n3 + n, n4 - n, n3 + n, n4 - n / 2);
        graphics.drawLine(n3 + n, n4 + n, n3 + n / 2, n4 + n);
        graphics.drawLine(n3 + n, n4 + n, n3 + n, n4 + n / 2);
    }

    public final void h() {
        int n;
        int n2;
        this.O.a = this.a;
        this.O.b = this.b;
        if ((this.e & 0x20000) != 0) {
            n2 = this.a >> 8;
            n = this.b - this.j[3] * 5 / 4 >> 8;
        } else {
            n2 = this.a >> 8;
            n = this.b >> 8;
        }
        n2 += d.bI;
        n += d.bJ;
        if ((this.e & 0x20000) != 0) {
            int n3 = d.j(((int)d.au & 0xFF) * 256 / 16 & 0xFF) * 3 >> 8;
            d.bB[1].a(d.am, 5, 0, n2, n - n3, 0, 0, 0);
            return;
        }
        d.bB[1].a(d.am, 0, ((int)d.au & 0xFF) % d.bB[1].k[0], n2, n, 0, 0, 0);
    }

    public final void b(int n, int n2) {
        this.O.a = n;
        this.O.b = n2;
        int n3 = 0;
        if (this.i[18] != -1) {
            n3 = this.O.d();
            this.O.c(this.i[18]);
        }
        this.O.a(d.am);
        if (this.i[18] != -1) {
            this.O.c(n3);
        }
    }

    public final void a(byte by, b b2) {
        if (this.i[6] != by) {
            this.i[7] = this.i[6];
            this.i[6] = by;
            this.N = b2;
            this.l = 0;
            this.m = 0;
        }
        if (this.i[6] == 0 && (this.e & 3) != 3) {
            this.k();
        }
        if (this.i[6] == 9 && !this.a(true) && !this.a(false)) {
            this.a(2, null);
            this.i[0] = 5;
        }
    }

    public final int i() {
        return (this.a >> 8) / d.fw * d.fw << 8;
    }

    public final int j() {
        return (this.b >> 8) / d.fw * d.fw << 8;
    }

    public static final int c(int n, int n2) {
        return d.bh[n][n2 * 5 + 0] << 8;
    }

    public static final int d(int n, int n2) {
        return d.bh[n][n2 * 5 + 1] << 8;
    }

    public static final byte b(int n, int n2, int n3) {
        if (n3 < 2) {
            return (byte)(d.bh[n][n2 * 5 + 2] >>> n3 * 8 & 0xFF);
        }
        return (byte)(d.bh[n][n2 * 5 + 3] >>> (n3 - 2) * 8 & 0xFF);
    }

    public final short c(int n, int n2, int n3) {
        int[] nArray = new int[]{1, -d.fz, -1, d.fz};
        short s = d.bh[n][n2 * 5 + 0];
        short s2 = d.bh[n][n2 * 5 + 1];
        int n4 = d.p(this.a, this.b);
        int n5 = n4 + nArray[n3];
        int n6 = (A[n3 * 4 * 2] > 0 ? 1 : (A[n3 * 4 * 2] == 0 ? 0 : -1)) * d.fw;
        int n7 = (A[n3 * 4 * 2 + 1] > 0 ? 1 : (A[n3 * 4 * 2 + 1] == 0 ? 0 : -1)) * d.fx;
        if (((n3 & 1) == 1 || n4 / d.fz == n5 / d.fz) && n5 >= 0 && n5 < d.fB) {
            int n8 = d.fy[n5] & 0x1F;
            if (d.bh[n8] == null) {
                return -1;
            }
            int n9 = -1;
            int n10 = 75;
            for (int i = 0; i < d.bh[n8].length; i += 5) {
                int n11;
                int n12 = d.bh[n8][i + 0] - (s - n6);
                int n13 = d.bh[n8][i + 1] - (s2 - n7);
                if ((n12 > 0 ? 1 : (n12 == 0 ? 0 : -1)) != (A[n3 * 4 * 2] > 0 ? 1 : (A[n3 * 4 * 2] == 0 ? 0 : -1)) || (n13 > 0 ? 1 : (n13 == 0 ? 0 : -1)) != (A[n3 * 4 * 2 + 1] > 0 ? 1 : (A[n3 * 4 * 2 + 1] == 0 ? 0 : -1)) || (n11 = Math.abs(n12) + Math.abs(n13)) >= n10) continue;
                n10 = n11;
                n9 = i;
            }
            if (n9 >= 0) {
                return (short)(n9 / 5 & 0xFF | n5 << 8);
            }
        }
        return -1;
    }

    public final void e(int n, int n2) {
        this.J = b.c(n, n2) + this.i();
        this.K = b.d(n, n2) + this.j();
        this.i[4] = (byte)n2;
        this.i[5] = (byte)n;
    }

    public final void d(int n, int n2, int n3) {
        this.J = b.c(n2, n3) + (d.Q(n) << 8);
        this.K = b.d(n2, n3) + (d.R(n) << 8);
        this.i[4] = (byte)n3;
        this.i[5] = (byte)n2;
    }

    public final void k() {
        int n;
        int n2;
        int n3;
        Object[] objectArray;
        int n4 = this.a - this.i() >> 8;
        int n5 = this.b - this.j() >> 8;
        if (d.p(this.a, this.b) < 0 || d.p(this.a, this.b) >= d.fy.length) {
            return;
        }
        int n6 = d.q(this.a, this.b);
        int n7 = d.p(this.a, this.b);
        int n8 = -1;
        int n9 = 0xFFFFFFF;
        if (d.bh[n6] == null) {
            objectArray = new int[]{1, -d.fz, -1, d.fz};
            for (n3 = 0; n3 < 4; ++n3) {
                n2 = n7 + objectArray[n3];
                n = d.fy[n2] & 0x1F;
                if ((n3 & 1) != 1 && n7 / d.fz != n2 / d.fz || n2 < 0 || n2 >= d.fB || d.bh[n] == null) continue;
                n6 = n;
                break;
            }
            if (d.bh[n6] == null) {
                return;
            }
        }
        objectArray = d.bh[n6];
        for (n2 = 0; n2 < objectArray.length / 5; ++n2) {
            n = objectArray[n2 * 5 + 0] - n4;
            n3 = objectArray[n2 * 5 + 1] - n5;
            int n10 = Math.abs(n) + Math.abs(n3);
            if (n10 >= n9) continue;
            n9 = n10;
            n8 = n2;
        }
        this.e(n6, n8);
    }

    public static final int f(int n, int n2) {
        return d.aY[n][n2 * 7 + 0] << 8;
    }

    public static final int g(int n, int n2) {
        return d.aY[n][n2 * 7 + 1] << 8;
    }

    public static final short e(int n, int n2, int n3) {
        short s = 0;
        switch (n3) {
            case 0: {
                s = (short)(d.aY[n][n2 * 7 + 5] >>> 16);
                break;
            }
            case 1: {
                s = (short)(d.aY[n][n2 * 7 + 5] & 0xFFFF);
                break;
            }
            case 2: {
                s = (short)(d.aY[n][n2 * 7 + 6] >>> 16);
                break;
            }
            case 3: {
                s = (short)(d.aY[n][n2 * 7 + 6] & 0xFFFF);
            }
        }
        return s;
    }

    public static final int a(int n, int n2, int n3, int n4) {
        int n5 = b.f(n, n2);
        switch (n3) {
            case 0: {
                n5 += ((d.aY[n][n2 * 7 + 3] >>> 24) - 128) * 24 << 8;
                n5 += n4 >> 1 << 8;
                break;
            }
            case 1: {
                n5 += ((d.aY[n][n2 * 7 + 4] >>> 24) - 128) * 24 << 8;
                break;
            }
            case 2: {
                n5 += ((d.aY[n][n2 * 7 + 3] >>> 8 & 0xFF) - 128) * 24 << 8;
                n5 -= n4 >> 1 << 8;
                break;
            }
            case 3: {
                n5 += ((d.aY[n][n2 * 7 + 4] >>> 8 & 0xFF) - 128) * 24 << 8;
            }
        }
        return n5;
    }

    public static final int b(int n, int n2, int n3, int n4) {
        int n5 = b.g(n, n2);
        switch (n3) {
            case 0: {
                n5 += ((d.aY[n][n2 * 7 + 3] >>> 16 & 0xFF) - 128) * 24 << 8;
                break;
            }
            case 1: {
                n5 += ((d.aY[n][n2 * 7 + 4] >>> 16 & 0xFF) - 128) * 24 << 8;
                n5 -= n4 >> 1 << 8;
                break;
            }
            case 2: {
                n5 += ((d.aY[n][n2 * 7 + 3] & 0xFF) - 128) * 24 << 8;
                break;
            }
            case 3: {
                n5 += ((d.aY[n][n2 * 7 + 4] & 0xFF) - 128) * 24 << 8;
                n5 += n4 >> 1 << 8;
            }
        }
        return n5;
    }

    public final void f(int n, int n2, int n3) {
        this.a = b.a(n, n2, n3, this.j[4] >> 8);
        this.b = b.b(n, n2, n3, this.j[5] >> 8);
    }

    public final void h(int n, int n2) {
        this.a = d.i(-n, -n2);
        this.b = d.j(-n, -n2);
    }

    public final void g(int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        if (this.i[1] == this.i[15]) {
            this.L = -1;
            this.M = -1;
            this.i[3] = 0;
        } else {
            if (n < 0) {
                n4 = d.i(-n, -n2);
                n5 = d.j(-n, -n2);
            } else {
                n4 = b.f(n, n2);
                n5 = b.g(n, n2);
            }
            int n6 = this.j[4] * 9 / 10;
            int n7 = this.j[4] * 1 / 4;
            int n8 = this.j[5] * 9 / 10;
            int n9 = this.j[5] * 1 / 4;
            if (d.ed && this.i[2] >= 0) {
                n7 = n6;
                n9 = n8;
            }
            switch (this.i[1]) {
                case 0: {
                    if (this.i[15] == 12) {
                        this.L = n4 - n6;
                        this.i[3] = -1;
                    } else {
                        this.L = n4 - n7;
                        this.i[3] = 1;
                    }
                    this.M = n5;
                    break;
                }
                case 4: {
                    this.L = n4;
                    if (this.i[15] == 0) {
                        this.M = n5 + n8;
                        this.i[3] = -1;
                        break;
                    }
                    this.M = n5 + n9;
                    this.i[3] = 1;
                    break;
                }
                case 8: {
                    if (this.i[15] == 4) {
                        this.L = n4 + n6;
                        this.i[3] = -1;
                    } else {
                        this.L = n4 + n7;
                        this.i[3] = 1;
                    }
                    this.M = n5;
                    break;
                }
                case 12: {
                    this.L = n4;
                    if (this.i[15] == 8) {
                        this.M = n5 - n8;
                        this.i[3] = -1;
                        break;
                    }
                    this.M = n5 - n9;
                    this.i[3] = 1;
                }
            }
        }
        if (n < 0) {
            this.J = d.i(-n, -n2);
            this.K = d.j(-n, -n2);
            return;
        }
        this.J = b.a(n, n2, n3, this.j[4] >> 8);
        this.K = b.b(n, n2, n3, this.j[5] >> 8);
        this.i[4] = (byte)n2;
        this.i[5] = (byte)n;
    }

    public final boolean a(boolean bl) {
        int n;
        int n2;
        int n3 = this.a >> 8;
        int n4 = this.b >> 8;
        int n5 = d.p(this.a, this.b);
        int n6 = -1;
        int n7 = -1;
        int n8 = 0xFFFFFFF;
        int n9 = n5;
        int[] nArray = new int[]{1, -d.fz, -1, d.fz};
        for (n2 = 0; n2 < 5; ++n2) {
            if (((n2 & 1) == 0 || n5 / d.fz == n9 / d.fz) && n9 >= 0 && n9 < d.fB && d.aY[n9] != null) {
                int[] nArray2 = d.aY[n9];
                n = 0;
                for (int i = 0; i < nArray2.length; i += 7) {
                    int n10;
                    int n11 = nArray2[i + 0] - n3;
                    int n12 = nArray2[i + 1] - n4;
                    if ((!bl || (n11 >= 0 ? 1 : -1) == (A[this.i[1]] >= 0 ? 1 : -1) && (n12 >= 0 ? 1 : -1) == (A[this.i[1]] >= 0 ? 1 : -1)) && (n10 = Math.abs(n11) + Math.abs(n12)) < n8) {
                        n8 = n10;
                        n6 = n;
                        n7 = n9;
                    }
                    ++n;
                }
            }
            if (n2 >= 4) continue;
            n9 = n5 + nArray[n2];
        }
        if (n8 > 300 || n6 == -1) {
            return false;
        }
        n5 = n7;
        this.J = b.f(n5, n6);
        this.K = b.g(n5, n6);
        this.i[4] = (byte)n6;
        this.i[5] = (byte)n5;
        n2 = this.J - this.a;
        int n13 = this.K - this.b;
        this.i[15] = Math.abs(n2) > Math.abs(n13) ? (n2 > 0 ? 0 : 8) : (n13 >= 0 ? 12 : 4);
        n = this.i[1];
        this.i[1] = this.i[15];
        if ((this.i[15] & 3) > 2) {
            this.g(n5, n6, 3 - ((this.i[15] & 0xFFFFFFFC) + 4 >> 2));
        } else {
            this.g(n5, n6, 3 - ((this.i[15] & 0xFFFFFFFC) >> 2));
        }
        this.i[1] = n;
        return true;
    }

    private boolean J() {
        int n = 200 * Math.max(2, this.h * 2 / d.a) * 24 / 16;
        if (this.i[6] != 2 && this.i[6] != 3) {
            if (this.a > this.J - n && this.a < this.J + n && this.b > this.K - n && this.b < this.K + n) {
                return true;
            }
        } else {
            switch (this.i[1] + 1 & 0xF & 0xFFFFFFFC) {
                case 0: {
                    if (this.a <= this.J - n) break;
                    return true;
                }
                case 4: {
                    if (this.b >= this.K + n) break;
                    return true;
                }
                case 8: {
                    if (this.a >= this.J + n) break;
                    return true;
                }
                case 12: {
                    if (this.b <= this.K - n) break;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean K() {
        if (d.ed) {
            if (this.i[16] < d.bk[this.i[2]].length) {
                byte by = d.bk[this.i[2]][this.i[16] + 1];
                byte by2 = d.bk[this.i[2]][this.i[16] + 2];
                int n = b.f((int)by2, by) - 12288;
                int n2 = b.g(by2, by) - 12288;
                return this.c(n, n2, n + 24576, n2 + 24576);
            }
            return true;
        }
        int n = 400 / d.a * 24 / 16;
        switch (this.i[15] + 1 & 0xF & 0xFFFFFFFC) {
            case 0: {
                if (this.a <= this.J - n) break;
                return true;
            }
            case 4: {
                if (this.b >= this.K + n) break;
                return true;
            }
            case 8: {
                if (this.a >= this.J + n) break;
                return true;
            }
            case 12: {
                if (this.b <= this.K - n) break;
                return true;
            }
        }
        return false;
    }

    private void L() {
        int n;
        if (this.l < 200) {
            this.u();
            return;
        }
        if ((this.i[6] == 4 || this.i[6] == 5) && ((n = this.b(d.cd)) > 0 && this.i[6] == 4 && n < 9600 || this.i[6] == 5 && n < 15000)) {
            this.i[2] = -1;
            return;
        }
        if (this.i[16] < d.bl[this.i[2]].length) {
            byte[] byArray = d.bl[this.i[2]];
            int n2 = byArray[this.i[16] + 2];
            switch (byArray[this.i[16] + 1]) {
                case 0: {
                    boolean bl = false;
                    this.i[12] = n2;
                    this.a(d.bB[2]);
                    if (this.i[12] >= 1 && this.i[12] < 2) {
                        this.e |= 0x20;
                    }
                    this.l();
                    break;
                }
                case 1: {
                    byte by = byArray[this.i[16] + 2 + 1];
                    int n3 = d.fy[by] & 0x1F;
                    this.a = b.c(n3, n2) + (d.Q(by) << 8);
                    this.b = b.d(n3, n2) + (d.R(by) << 8);
                    this.i(12);
                    this.f(0);
                    this.l();
                    break;
                }
                case 2: {
                    this.i(n2);
                    this.l();
                    break;
                }
                case 3: {
                    this.f(this.j[7]);
                    this.u();
                    this.e();
                    if (this.J()) {
                        this.l();
                        break;
                    }
                    this.e(500);
                    break;
                }
                case 4: {
                    this.K += this.l;
                    if (this.K < this.J) break;
                    this.l();
                    return;
                }
                case 5: {
                    if (H != ((this.i[1] & 4) == 0)) {
                        if (this.h != 0) {
                            this.f(0);
                            this.e();
                        }
                        return;
                    }
                    this.l();
                    break;
                }
                case 6: {
                    this.i[16] = 0;
                    for (int i = 0; i < n2; ++i) {
                        this.l();
                    }
                    break;
                }
                case 7: {
                    if (d.ee && (this.e & 0x800) != 0) {
                        d.N();
                        return;
                    }
                    d.a(2, this);
                    return;
                }
                case 8: {
                    this.b(true);
                    break;
                }
                case 9: {
                    this.e &= 0xFFFFFBFF;
                    this.j[0] = 0;
                    this.a(7, null);
                    this.e();
                }
            }
        } else if (this.i[6] == 0) {
            this.i[2] = -1;
            this.a((byte)0, (b)null);
        }
        this.l = 0;
    }

    final void l() {
        this.i[16] = this.i[16] == -1 ? (byte)0 : (byte)(this.i[16] + (d.bl[this.i[2]][this.i[16] + 0] + 1));
        this.J = -1;
        this.K = -1;
        if (this.i[16] >= d.bl[this.i[2]].length) {
            return;
        }
        byte[] byArray = d.bl[this.i[2]];
        byte by = byArray[this.i[16] + 2];
        switch (byArray[this.i[16] + 1]) {
            case 3: {
                byte by2 = byArray[this.i[16] + 2 + 1];
                int n = d.fy[by2] & 0x1F;
                this.J = b.c(n, by) + (d.Q(by2) << 8);
                this.K = b.d(n, by) + (d.R(by2) << 8);
                this.i[4] = by;
                this.i[5] = (byte)n;
                return;
            }
            case 4: {
                this.J = by * 1000;
                this.K = 0;
                this.l = 0;
                this.f(0);
                this.e();
                return;
            }
            case 8: {
                this.N = d.d(2, -1, by);
                if (this.N != null) break;
                this.N = d.d(3, -1, by);
            }
        }
    }

    private void M() {
        int n;
        this.u();
        if (this.l < 200) {
            return;
        }
        this.e &= 0xFFFFFFBF;
        if ((this.e & 0x200000) != 0) {
            if (ab != null) {
                this.a -= A[this.i[1] * 2] * 8;
                this.b -= A[this.i[1] * 2 + 1] * 8;
            }
            this.c(true);
            this.e &= 0xFFDFFFFF;
            this.l = -200;
            if ((this.e & 0x100) == 0) {
                this.L = this.a + A[this.i[1] * 2] * 24 * 2;
                this.M = this.b + A[this.i[1] * 2 + 1] * 24 * 2;
                this.e |= 0x100;
                return;
            }
            byte by = b.b(this.i[5], this.i[4], this.i[1] >> 2);
            if (by == -1) {
                this.L = this.a + A[this.i[1] * 2] * 24 * 2;
                this.M = this.b + A[this.i[1] * 2 + 1] * 24 * 2;
                return;
            }
            this.e((int)this.i[5], by);
            return;
        }
        if ((this.e & 0x100) != 0) {
            int n2 = this.J;
            int n3 = this.K;
            this.J = this.L;
            this.K = this.M;
            if (this.J()) {
                this.e &= 0xFFFFFEFF;
                this.L = -1;
                this.M = -1;
            }
            this.J = n2;
            this.K = n3;
            this.g(this.j[7] - this.h);
            this.l = 0;
            return;
        }
        if (this.L > 0) {
            this.h(this.j[6]);
            if (this.l < this.L) {
                return;
            }
            this.L = 0;
            this.l = 0;
            this.e &= 0xFFFFFDFF;
            this.e();
        }
        if (this.m > 20000 && d.a(0, 100) < 15) {
            this.L = d.a(2, 30) * 100;
            this.m = 0;
        }
        int n4 = 0;
        int n5 = 0;
        if ((this.i[1] & 4) == 0) {
            n = this.K - this.b;
            if (Math.abs(n) <= 768) {
                this.d = 0;
            } else {
                n5 = this.d = d.d * (n >= 0 ? 1 : -1) * 16 / 24;
            }
        } else {
            n = this.J - this.a;
            if (Math.abs(n) <= 768) {
                this.c = 0;
            } else {
                n4 = this.c = d.d * (n >= 0 ? 1 : -1) * 16 / 24;
            }
        }
        if (this.J()) {
            int n6 = this.i[5];
            int n7 = d.bh[n6][this.i[4] * 5 + 4] & 0xFF;
            int n8 = 0;
            int n9 = 0;
            if (d.a(0, 100) < 30) {
                n9 = 2;
            }
            if (d.a(0, 100) > 50) {
                ++n9;
            }
            int n10 = 0;
            do {
                if ((n8 = this.i[1] / 4 + z[n9 * 4 + n10++]) < 0) {
                    n8 += 4;
                    continue;
                }
                n8 &= 3;
            } while ((n7 & 1 << n8) == 0 && n10 < 4);
            byte by = b.b(n6, this.i[4], n8);
            int n11 = -1;
            if (by == -1 || n10 == 4) {
                short s = this.c(n6, this.i[4], this.i[1] / 4);
                if (s != -1) {
                    n11 = (byte)(s >>> 8);
                    by = (byte)(s & 0xFF);
                    n6 = d.fy[n11] & 0x1F;
                } else if (by == -1) {
                    return;
                }
            }
            if (n11 == -1) {
                this.e(n6, by);
            } else {
                this.d(n11, n6, by);
            }
            if (n10 == 4 && n11 == -1) {
                this.L = d.a(1, 30) * 500;
                this.l = 0;
            }
        }
        this.g(this.j[7] - this.h);
        if (n4 != 0 && this.c == 0) {
            this.c = n4;
        }
        if (n5 != 0 && this.d == 0) {
            this.d = n5;
        }
        this.e(1000);
        this.l = 0;
    }

    private void N() {
        if (this.N == null && this.i[6] != 4 || this.N == d.cd && (d.cB || d.cE)) {
            this.a((byte)0, (b)null);
            this.e &= 0xFF7FFFFF;
            d.b(this);
            return;
        }
        if (this.h != 0) {
            this.u();
        }
        if (this.l < 200) {
            this.e &= 0xFFFFFFE7;
            return;
        }
        if (this.N != null) {
            if (this.N == d.ce) {
                this.N = d.cd;
            } else if (this.N.i[0] == 5 && d.cA) {
                this.N = d.cd;
            }
            this.o();
        }
        if ((this.e & 0x200000) != 0) {
            if (ab != null) {
                this.a -= A[this.i[1] * 2] * 8;
                this.b -= A[this.i[1] * 2 + 1] * 8;
            }
            int n = this.J - this.a;
            int n2 = this.K - this.b;
            if (this.i[6] == 4) {
                n *= -1;
                n2 *= -1;
            }
            if ((this.i[1] & 4) == 0) {
                this.i(n2 >= 0 ? 12 : 4);
            } else {
                this.i(n > 0 ? 0 : 8);
            }
            this.e &= 0xFFDFFFFF;
            if ((this.e & 0x100) == 0) {
                this.L = this.a + A[this.i[1] * 2] * 12;
                this.M = this.b + A[this.i[1] * 2 + 1] * 12;
                this.e |= 0x100;
                return;
            }
            this.k();
            return;
        }
        if ((this.e & 0x100) != 0) {
            int n = this.J;
            int n3 = this.K;
            this.J = this.L;
            this.K = this.M;
            if (this.J()) {
                this.e &= 0xFFFFFEFF;
                this.L = -1;
                this.M = -1;
            }
            this.J = n;
            this.K = n3;
            if (this.h != 1280) {
                this.h = 1280;
                this.s();
                this.e();
            }
            this.l = 0;
            return;
        }
        this.M += this.l;
        if (this.L > 0) {
            this.h(this.j[6]);
            if (this.M < this.L) {
                return;
            }
            this.L = 0;
            this.M = 0;
            this.e &= 0xFFFFFDFF;
            this.e();
        }
        switch (this.i[6]) {
            case 1: {
                if (this.N.i[0] != 6 && this.N.i[0] != 3) {
                    this.a(2, null);
                    this.a((byte)0, (b)null);
                    break;
                }
                this.a = this.N.a;
                this.b = this.N.b;
                break;
            }
            case 2: {
                if (d.cp != null) {
                    this.a((byte)3, d.cp);
                    break;
                }
                this.N = d.cd;
                this.e(1000);
                int n = this.b(this.N);
                if (n > 0 && n < 1536) {
                    if (this.h < 0) break;
                    this.h(this.h - 0);
                    this.e();
                    break;
                }
                if (this.h > 1280) break;
                this.g(this.j[6]);
                this.e();
                break;
            }
            case 3: {
                this.N = d.cp;
                if (this.N == null) {
                    this.a((byte)2, d.cd);
                    return;
                }
                this.h(this.j[6]);
                this.e(1000);
                this.b(false);
                break;
            }
            case 5: {
                if (this.i[3] <= 0) {
                    this.a((byte)4, this.N);
                    return;
                }
                this.e(1000);
                if (!d.ec && this.b(this.N) <= 15000) {
                    this.b(false);
                    break;
                }
                if ((this.e & 0x800) != 0) break;
                this.a((byte)0, (b)null);
                return;
            }
            case 4: {
                if (this.j(this.J, this.K) > 60000) {
                    this.a((byte)0, (b)null);
                    this.h = 512;
                    this.s();
                    this.e();
                    return;
                }
                this.p();
                if (this.h == 1280) break;
                this.h = 1280;
                this.s();
                this.e();
                break;
            }
            case 6: {
                if (this.N.j[0] <= 0 || (this.e & 0x20) != 0 && (d.cw == 0 || d.ee)) {
                    this.a((byte)0, (b)null);
                    return;
                }
                int n = this.b(this.N);
                if ((this.N.e & 3) == 3 && n <= 2500 && this.N.j[0] > 0) {
                    this.h(this.j[6]);
                    if (!d.ec && (this.e & 0x20) != 0) {
                        this.N.a(10, this);
                    }
                    return;
                }
                this.e(1000);
                if (!(d.ec || (this.N.e & 3) >= 3 && (this.e & 0x20) != 0 && d.cw <= 2 || n > 5400)) {
                    this.h(this.j[6]);
                    this.b(false);
                    return;
                }
                if (n > 9600) {
                    if (this.h == 1280) break;
                    this.h = 1280;
                    this.s();
                    this.e();
                    break;
                }
                this.g(d.a);
            }
        }
        this.l = 0;
    }

    public final void b(boolean bl) {
        if (this.h > 0) {
            return;
        }
        if (!bl && (this.e & 8) == 0) {
            this.e |= 8;
            this.e();
        }
        if (this.m >= d.s[this.i[3]]) {
            this.m = 0;
            this.F();
            this.e();
            if (bl) {
                this.l();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void O() {
        block36: {
            int n;
            int n2;
            byte by;
            short s;
            int n3;
            byte by2;
            block35: {
                if (this.h != 0) {
                    this.u();
                }
                if (!(d.ed && this.K() || this.l >= 200)) {
                    return;
                }
                if (d.ed && this.i[2] != -1) {
                    d.a(this);
                }
                if (this.K()) {
                    by2 = this.i[5];
                    if (d.fj != 0 && (this.i[2] < 0 || this.i[6] != 10 && this.i[6] != 4 && this.i[6] != 6) && (H != ((this.i[1] & 4) == 0) || I > 7200)) {
                        this.h = 0;
                        this.s();
                        return;
                    }
                    n3 = 0;
                    s = 0;
                    by = 0;
                    if (this.i[2] == -1) {
                        n2 = d.aY[by2][this.i[4] * 7 + 2];
                        n = 0;
                        if (d.a(0, 100) < 25) {
                            n = 2;
                        }
                        if (d.a(0, 100) > 50) {
                            ++n;
                        }
                        break block35;
                    } else {
                        int n4;
                        int n5;
                        if (this.i[16] < d.bk[this.i[2]].length) {
                            this.i[16] = (byte)(this.i[16] + (d.bk[this.i[2]][this.i[16] + 0] + 1));
                        }
                        if (d.ed) {
                            n5 = 0;
                            while (d.ek[n5] != this) {
                                ++n5;
                            }
                            d.ej[n5] = this.i[16];
                        }
                        if (this.i[16] >= d.bk[this.i[2]].length) {
                            this.h(this.h);
                            return;
                        }
                        s = d.bk[this.i[2]][this.i[16] + 1];
                        by = d.bk[this.i[2]][this.i[16] + 2];
                        if (s < 0 || by < 0) {
                            n5 = d.i(-by, -s) - this.a;
                            n4 = d.j(-by, -s) - this.b;
                        } else {
                            n5 = b.f((int)by, s) - this.a;
                            n4 = b.g(by, s) - this.b;
                        }
                        this.i[15] = Math.abs(n5) > Math.abs(n4) ? (n5 > 0 ? 0 : 8) : (n4 > 0 ? 12 : 4);
                        n3 = this.i[15] >> 2;
                        this.g(by, s, n3 ^ 2);
                        this.l = 133;
                        return;
                    }
                }
                if (this.i[1] == this.i[15]) {
                    int n6 = 2050;
                    if (d.ed && this.i[2] >= 0) {
                        n6 = this.j[7];
                    }
                    if (this.h < n6) {
                        this.g(n6 - this.h);
                    }
                    this.Q();
                    break block36;
                } else {
                    int n7 = 1000;
                    int n8 = 800;
                    if (d.ed && this.i[2] >= 0) {
                        n7 = 1800;
                        n8 = 1000;
                    }
                    if (this.h > n7) {
                        this.h(this.h - n7);
                    } else if (this.h < n8) {
                        this.g(n7 - this.h);
                    }
                    if (this.L == -1) {
                        if (this.i[3] > 0) {
                            this.d(false);
                        } else {
                            this.c(false);
                        }
                        this.l = 66;
                        return;
                    }
                    switch (this.i[1]) {
                        case 0: {
                            if (this.a < this.L) break;
                            this.L = -1;
                            break;
                        }
                        case 4: {
                            if (this.b > this.M) break;
                            this.L = -1;
                            break;
                        }
                        case 8: {
                            if (this.a > this.L) break;
                            this.L = -1;
                            break;
                        }
                        case 12: {
                            if (this.b < this.M) break;
                            this.L = -1;
                            break;
                        }
                    }
                }
                break block36;
            }
            int n9 = 0;
            do {
                if ((n3 = this.i[1] / 4 + z[n * 4 + n9++]) < 0) {
                    n3 += 4;
                    continue;
                }
                n3 &= 3;
            } while ((n2 & 1 << n3 * 2) == 0 && n9 <= 4);
            s = b.e(by2, this.i[4], n3);
            by = (byte)(s >>> 8);
            s = (short)(s & 0xFF);
            if (by == -1) {
                return;
            }
            this.i[15] = (byte)(n3 << 2);
            this.g(by, s, n3 ^ 2);
        }
        this.l = 0;
    }

    private void P() {
        if (this.i[6] == 8) {
            this.C();
        } else if (this.h != 0) {
            this.u();
        }
        if (this.l < 100) {
            return;
        }
        if ((d.cB || d.cE) && this.N == d.cd) {
            this.a((byte)0, (b)null);
            return;
        }
        switch (this.i[6]) {
            case 7: {
                if ((this.e & 0x800) == 0 && this.m >= 500 && this.m - 100 < 500 && d.a(0, 100) >= 95) {
                    this.h = 2050;
                    this.s();
                    this.i[6] = 9;
                    this.l = 0;
                    this.m = 0;
                    return;
                }
                this.h(this.h);
                return;
            }
            case 8: {
                if (Math.abs(this.c) > 512 || Math.abs(this.d) > 512) break;
                if (this.i[2] == -1) {
                    this.a((byte)9, (b)null);
                    return;
                }
                this.a(this.i[7], (b)null);
                if (this.i[7] != 6 && this.i[7] != 4) break;
                this.a(2, this.N);
                return;
            }
            case 9: {
                if ((this.e & 0x200000) != 0) {
                    this.h(256);
                    this.e &= 0xFFDFFFFF;
                    return;
                }
                if (this.m > 250) {
                    this.q();
                    if (this.i[15] != this.i[1]) {
                        if (this.i[3] > 0) {
                            this.d(false);
                        } else {
                            this.c(false);
                        }
                        this.g(true);
                    } else {
                        this.g(false);
                        this.Q();
                    }
                    this.m = 0;
                }
                if (this.j(this.J, this.K) >= (this.j[8] >> 8) * (this.j[8] >> 8) || (this.i[1] & 3) != 0) break;
                this.a((byte)0, (b)null);
                return;
            }
            case 6: {
                if (this.N == null) {
                    this.i[13] = -1;
                    this.a((byte)0, (b)null);
                    return;
                }
                if (this.i[13] < 0) {
                    this.i[13] = 0;
                }
                if (this.N == d.ce) {
                    this.N = d.cd;
                } else if (this.N.i[0] == 5 && d.cA) {
                    this.N = d.cd;
                }
                this.o();
                this.q();
                if (this.i[15] == this.i[1]) {
                    this.Q();
                } else if (this.m > 500) {
                    if (this.i[3] > 0) {
                        this.d(false);
                    } else {
                        this.c(false);
                    }
                    this.m = 0;
                }
                if ((this.N.e & 3) < 3 && this.b(this.N) < 9600) {
                    if (this.h > 500) {
                        this.h(this.h - 500);
                        return;
                    }
                    this.a(2, null);
                    return;
                }
                if ((this.e & 0x200000) == 0) {
                    this.g(false);
                    return;
                }
                this.g(2050 - this.h);
            }
        }
    }

    private void g(boolean bl) {
        if (bl) {
            if (this.h > 1000) {
                this.h(this.h - 1000);
                return;
            }
            if (this.h < 1000) {
                this.g(1000 - this.h);
                return;
            }
        } else if (this.h < 2050) {
            this.g(2050 - this.h);
        }
    }

    private void Q() {
        if ((this.i[1] & 3) != 0) {
            return;
        }
        if ((this.i[1] & 4) == 0) {
            int n = this.K - this.b;
            if (Math.abs(n) <= 512) {
                this.d = 0;
                return;
            }
            this.d = d.b * (n >= 0 ? 1 : -1);
            return;
        }
        int n = this.J - this.a;
        if (Math.abs(n) <= 512) {
            this.c = 0;
            return;
        }
        this.c = d.b * (n >= 0 ? 1 : -1);
    }

    public final int m() {
        return this.a - this.j[2] + this.j[4] / 2;
    }

    public final int n() {
        return this.b - this.j[3] + this.j[5] / 2;
    }

    public final void i(int n, int n2) {
        this.J = n;
        this.K = n2;
    }

    public final void a(b b2) {
        this.N = b2;
        this.o();
    }

    public final void o() {
        if (this.N == null) {
            return;
        }
        this.J = this.N.m();
        this.K = this.N.n();
        if (this.i[0] == 4 && (this.N.i[0] == 5 || this.N.i[0] == 6)) {
            this.J += (this.N.j[4] / 2 >> 8) * d.i(this.N.k >> 8);
            this.K -= (this.N.j[5] / 2 >> 8) * d.j(this.N.k >> 8);
        }
    }

    public final void e(int n) {
        int n2 = this.J - this.a;
        int n3 = this.K - this.b;
        if (this.m > n || this.h == 0) {
            byte by = this.i[1];
            if (Math.abs(n2) > Math.abs(n3)) {
                this.i(n2 > 0 ? 0 : 8);
            } else {
                this.i(n3 >= 0 ? 12 : 4);
            }
            if ((this.i[1] & 4) == 0) {
                if (Math.abs(n3) * 3 > Math.abs(n2) * 2) {
                    this.i(n3 >= 0 ? 12 : 4);
                }
            } else if (Math.abs(n2) * 3 > Math.abs(n3) * 2) {
                this.i(n2 > 0 ? 0 : 8);
            }
            if (by != this.i[1]) {
                this.m = 0;
            }
        }
    }

    public final void p() {
        if (this.m > 1000 || this.h == 0) {
            int n = this.J - this.a;
            int n2 = this.K - this.b;
            byte by = this.i[1];
            if (Math.abs(n) > Math.abs(n2)) {
                this.i(n < 0 ? 0 : 8);
            } else {
                this.i(n2 < 0 ? 12 : 4);
            }
            if (by != this.i[1]) {
                this.m = 0;
            }
        }
    }

    public final void q() {
        int n = this.J - this.a;
        int n2 = this.K - this.b;
        if (n2 == 0) {
            this.i[15] = n > 0 ? 0 : 8;
            return;
        }
        int n3 = Math.abs((n << 8) / n2);
        int n4 = 0;
        n4 = n3 < 128 ? 3 : (n3 < 256 ? 2 : (n3 < 384 ? 1 : 0));
        if (n > 0) {
            if (n2 > 0) {
                n4 = (byte)(16 - n4);
            }
        } else {
            n4 = n2 > 0 ? (int)((byte)(8 + n4)) : (int)((byte)(8 - n4));
        }
        this.i[15] = (byte)(n4 & 0xF);
        this.i[3] = (byte)(n4 - this.i[1] > 0 ? 1 : (n4 - this.i[1] == 0 ? 0 : -1));
        if (Math.abs(n4 - this.i[1]) > Math.abs(n4 + 16 - this.i[1])) {
            this.i[3] = (byte)(this.i[3] * -1);
        }
    }

    public final int b(b b2) {
        int n = b2.a - this.a >> 8;
        int n2 = b2.b - this.b >> 8;
        return n * n + n2 * n2;
    }

    public final int j(int n, int n2) {
        int n3 = n - this.a >> 8;
        int n4 = n2 - this.b >> 8;
        return n3 * n3 + n4 * n4;
    }

    public final void f(int n) {
        this.h = n;
        this.s = 0;
        this.s();
    }

    public final int r() {
        return this.h;
    }

    public final void g(int n) {
        int n2 = this.h;
        if (this.i[0] == 4) {
            if (this.h == 1792 && this.l < 1200) {
                return;
            }
            this.h += n > this.j[6] ? this.j[6] : n;
            if (n2 < 1792 && this.h >= 1792) {
                this.h = 1792;
                this.l = 0;
            } else if (this.h > this.j[7]) {
                this.h = this.j[7];
            }
        } else {
            this.h += n > this.j[6] ? this.j[6] : n;
            if (this.h > this.j[7]) {
                this.h = this.j[7];
            }
        }
        if (this.h == n2) {
            return;
        }
        if ((this.e & 0x18) != 0) {
            this.e &= 0xFFFFFFE7;
            this.e();
        } else if (n2 == 0 && this.h > 0) {
            this.e();
        }
        this.s();
    }

    public final void h(int n) {
        if (this.h <= 0) {
            return;
        }
        this.h -= n > 700 ? 700 : n;
        if (this.h <= 0) {
            this.h = 0;
            this.e();
        }
        this.s();
    }

    final void s() {
        this.c = A[this.i[1] * 2] * (this.h / d.a);
        this.d = A[this.i[1] * 2 + 1] * (this.h / d.a);
    }

    public final void t() {
        this.a += (this.c * 100 >> 8) * 24 / 16;
        this.b += (this.d * 100 >> 8) * 24 / 16;
    }

    public final void u() {
        int n;
        W = this.a;
        X = this.b;
        byte by = this.i[1];
        if (this.h == 0 && this.c == 0 && this.d == 0 && this.s == 0) {
            if ((this.e & 3) == 3) {
                this.e(true);
            }
            this.e &= 0xFFFFFFBF;
            return;
        }
        if ((this.e & 0x800) == 0 && this.f != -1 && this.f >> 16 != (n = d.p(this.a, this.b))) {
            this.f = -1;
        }
        switch (this.i[0]) {
            case 4: {
                if (d.y(9)) {
                    this.t();
                    return;
                }
                if (d.cD || (this.e & 0x400) != 0) {
                    this.R();
                    return;
                }
                this.t();
                this.w();
                if (!this.e(false) && !this.a(d.ff[3], true, true) || ab != null && ab == d.cq) break;
                this.a = W;
                this.b = X;
                return;
            }
            case 3: 
            case 5: {
                this.t();
                this.w();
                if (this.i[0] == 3 && d.y(9)) {
                    return;
                }
                this.e(true);
                this.a(d.ff[2], true, true);
                this.a(d.ff[3], true, true);
                return;
            }
            case 1: {
                return;
            }
            case 6: {
                if (this.i[6] != 0) {
                    this.t();
                    this.w();
                    this.e(true);
                    if (d.cA) {
                        this.a(d.cd, false, true);
                    }
                    this.a(d.ff[2], true, true);
                    this.a(d.ff[3], true, true);
                    return;
                }
                if (this.i[1] == this.i[15] || this.L != -1 || this.h < 800 || this.h > 1000) {
                    n = this.j[8] * this.c / (Math.abs(this.c) + Math.abs(this.d) + 1);
                    int n2 = this.j[8] * this.d / (Math.abs(this.c) + Math.abs(this.d) + 1);
                    int n3 = (this.j[8] * d.j(256 - this.i[1] * 16) >> 8) / 4;
                    int n4 = (this.j[8] * d.i(256 - this.i[1] * 16) >> 8) / 4;
                    if (Math.abs(n3) + Math.abs(n4) > Math.abs(n) + Math.abs(n2)) {
                        n = n3;
                        n2 = n4;
                    }
                    this.a += n;
                    this.b += n2;
                } else {
                    this.t();
                }
                this.w();
                if (this.a(d.cd, false, false) || this.a(d.ff[3], true, false)) {
                    n = ab.j(W, X);
                    this.h = n > (this.j[8] >> 8) * (this.j[8] >> 8) * 3 / 2 ? (this.h -= this.j[7] * 100 / 1000) : (this.h -= 2 * this.j[7] * 100 / 1000);
                    if (this.h < 400) {
                        this.h = 0;
                    }
                    this.s();
                    if (this.i[1] != this.i[15]) {
                        this.a = W;
                        this.b = X;
                        this.i[1] = by;
                        this.k = 256 - this.i[1] * 16 << 8;
                        this.s();
                        this.e();
                        return;
                    }
                }
                this.a = W;
                this.b = X;
                if (this.h == 0 && this.c == 0 && this.d == 0) break;
                this.t();
                this.w();
                this.a(d.cd, false, true);
                this.a(d.ff[3], true, true);
                this.a(d.ff[2], true, true);
                return;
            }
            case 8: {
                this.t();
                this.w();
                if (!this.e(false) && !this.a(d.ff[3], true, true)) break;
                this.l = 0;
                this.m = 0;
                this.a = W;
                this.b = X;
                this.c = 0;
                this.d = 0;
                this.h = 0;
                return;
            }
            default: {
                this.t();
            }
        }
    }

    private void R() {
        this.t();
        this.w();
        boolean bl = this.e(false);
        if (!(bl || this.a(d.ff[3], true, false) || this.a(d.ff[2], true, false))) {
            this.e &= 0xFFFFFF3F;
            return;
        }
        this.a = W;
        this.b = X;
        if (bl) {
            int n = 0;
            --this.h;
            if ((this.e & 0x40) == 0 || (this.e & 0x80) != 0) {
                this.e &= 0xFFFFFF3F;
                n = (this.i[1] & 2) == 0 ? this.i[1] + 12 : this.i[1] + 14;
                if ((this.i[1] & 2) != 0 && ((n %= 16) & 4) == 0) {
                    this.c = A[n * 2] * (this.h / d.a);
                    this.d = 0;
                } else {
                    this.c = A[n * 2] * (512 / d.a);
                    this.d = A[n * 2 + 1] * (512 / d.a);
                }
                this.t();
                this.w();
                if (!this.e(false) && !this.a(d.ff[3], true, false)) {
                    this.e |= 0xC0;
                    return;
                }
                this.a = W;
                this.b = X;
            }
            if ((this.e & 0x40) == 0 || (this.e & 0x80) == 0) {
                this.e &= 0xFFFFFF3F;
                n = (this.i[1] & 2) != 0 ? this.i[1] + 2 : this.i[1] + 4;
                if ((this.i[1] & 2) != 0 && ((n %= 16) & 4) == 0) {
                    this.c = A[n * 2] * (this.h / d.a);
                    this.d = 0;
                } else {
                    this.c = A[n * 2] * (512 / d.a);
                    this.d = A[n * 2 + 1] * (512 / d.a);
                }
                this.t();
                this.w();
                if (!this.e(true) && !this.a(d.ff[3], true, true)) {
                    this.e |= 0x40;
                    return;
                }
                this.a = W;
                this.b = X;
            }
            this.h = 0;
            this.c = 0;
            this.d = 0;
            return;
        }
        b b2 = ab;
        if (b2 == this) {
            this.c = 0;
            this.d = 0;
            this.h = 0;
            return;
        }
        switch (b2.i[0]) {
            case 5: 
            case 6: {
                int n = b2.a - b2.j[2];
                int n2 = b2.b - b2.j[3];
                int n3 = this.i[1];
                if ((this.i[1] & 2) != 0) {
                    n3 = this.i[1] == 2 || this.i[1] == 14 ? 0 : 8;
                }
                if ((n3 & 4) == 0) {
                    this.J = n;
                    this.K = this.b;
                    if (n3 == 0) {
                        this.J += b2.j[4];
                        this.J += 1024;
                        this.J += 2689;
                    } else {
                        this.J -= 1024;
                        this.J -= 2689;
                    }
                } else {
                    this.J = this.a;
                    this.K = n2;
                    if (n3 == 12) {
                        this.K += b2.j[5];
                        this.K += 1921;
                        this.K += 1024;
                    } else {
                        this.K -= 1921;
                        this.K -= 1024;
                    }
                }
                this.a = this.J;
                this.b = this.K;
                this.w();
                this.a = W;
                this.b = X;
                if (this.e(false) || this.a(d.ff[3], true, false)) {
                    this.e &= 0xFFFFFEFF;
                } else if ((this.e & 0x40) == 0) {
                    this.m = 0;
                    this.e |= 0x40;
                } else if (this.m > 200) {
                    d.cD = false;
                    d.cq = null;
                    d.cp = null;
                    this.i[1] = n3;
                    this.h = 1792;
                    this.s();
                    this.e &= 0xFFFFFFBF;
                    this.e |= 0x100;
                }
                this.e();
                return;
            }
            case 8: {
                this.t();
                if (b2.c == 0 && b2.d == 0) {
                    return;
                }
                int n = 0;
                n = B[this.i[1] * 2] == 0 ? (this.a - b2.a >= 0 ? 1 : -1) * (B[this.i[1] * 2 + 1] >= 0 ? 1 : -1) : (this.b - b2.b >= 0 ? 1 : -1) * -(B[this.i[1] * 2] >= 0 ? 1 : -1);
                int n4 = this.i[1] + n * 3;
                n4 = n4 < 0 ? (n4 += 16) : (n4 %= 16);
                b2.h = 0;
                b2.c = A[n4 * 2] * (512 / d.a);
                b2.d = A[n4 * 2 + 1] * (512 / d.a);
                b2.e |= 0x40;
                b2.l = 0;
                return;
            }
        }
        this.c = 0;
        this.d = 0;
        this.h = 0;
    }

    public final boolean v() {
        switch (this.i[1] & 0xFFFFFFFC) {
            case 0: {
                if (this.a <= this.J) break;
                return true;
            }
            case 4: {
                if (this.b >= this.K) break;
                return true;
            }
            case 8: {
                if (this.a >= this.J) break;
                return true;
            }
            case 12: {
                if (this.b <= this.K) break;
                return true;
            }
        }
        return false;
    }

    public final void c(boolean bl) {
        if (!bl && this.h == 0) {
            return;
        }
        switch (this.e & 3) {
            case 1: {
                this.i[1] = (byte)(this.i[1] + 12);
                break;
            }
            case 2: {
                this.i[1] = (byte)(this.i[1] + 14);
                break;
            }
            case 3: {
                this.i[1] = (byte)(this.i[1] + 15);
            }
        }
        this.i[1] = (byte)(this.i[1] & 0xF);
        this.k = 256 - this.i[1] * 16 << 8;
        this.s();
        this.e();
    }

    public final void d(boolean bl) {
        if (!bl && this.h == 0) {
            x = (byte)-1;
            d.cd.i[17] = 0;
            return;
        }
        switch (this.e & 3) {
            case 1: {
                this.i[1] = (byte)(this.i[1] + 4);
                break;
            }
            case 2: {
                this.i[1] = (byte)(this.i[1] + 2);
                break;
            }
            case 3: {
                this.i[1] = (byte)(this.i[1] + 1);
            }
        }
        this.i[1] = (byte)(this.i[1] & 0xF);
        this.k = 256 - this.i[1] * 16 << 8;
        this.s();
        this.e();
    }

    public final void i(int n) {
        if (this.i[1] == n) {
            return;
        }
        this.i[1] = (byte)n;
        this.k = 256 - this.i[1] * 16 << 8;
        if (this.h > 0) {
            this.s();
        }
        this.e();
    }

    final void w() {
        Y = this.k;
        S = T = this.j[9] / 2;
        this.e &= 0xFFF3FFFF;
        if ((this.e & 3) == 3) {
            R = 3;
            int n = this.j[8] * d.j(256 - this.i[1] * 16) / 3 >> 8;
            int n2 = this.j[8] * d.i(256 - this.i[1] * 16) / 3 >> 8;
            int n3 = this.i[1] % 8;
            if (n3 == 2 || n3 == 6) {
                n2 *= 90;
                n2 /= 100;
                T -= 256;
                S -= 256;
            } else if (n3 == 1 || n3 == 7) {
                n2 *= 95;
                n2 /= 100;
                T -= 256;
            } else if (n3 == 3 || n3 == 5) {
                n2 *= 85;
                n2 /= 100;
                S -= 256;
            } else if (n3 == 4) {
                n2 *= 80;
                n2 /= 100;
            }
            U = S * 2;
            V = T * 2;
            b.P[0] = this.a - S;
            b.Q[0] = this.b - T;
            b.P[1] = this.a + (this.i[17] >= 0 ? 1 : -1) * n - S;
            b.Q[1] = this.b + (this.i[17] >= 0 ? 1 : -1) * n2 - T;
            b.P[2] = this.a - (this.i[17] >= 0 ? 1 : -1) * n - S;
            b.Q[2] = this.b - (this.i[17] >= 0 ? 1 : -1) * n2 - T;
            return;
        }
        if (this.i[0] == 4 || this.i[0] == 8) {
            U = 5376;
            V = 3840;
            R = 1;
            b.P[0] = this.a - U / 2;
            b.Q[0] = this.b - V / 2;
            return;
        }
        R = 0;
        S = 0;
        T = 0;
        U = 0;
        V = 0;
    }

    final boolean e(boolean bl) {
        boolean bl2 = this.f(bl);
        if (this == d.cd) {
            if (bl2) {
                this.c >>= 1;
                this.d >>= 1;
                this.h >>= 1;
                if (G <= 0) {
                    this.a = D;
                    this.b = E;
                    this.k = F;
                    G = 12;
                }
                --G;
            } else {
                D = this.a;
                E = this.b;
                F = this.k;
                G = 12;
            }
        }
        return bl2;
    }

    final boolean f(boolean bl) {
        int n;
        int n2 = 0;
        boolean bl2 = false;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (this.x()) {
            this.e |= 0x200000;
            if (!bl) {
                ab = null;
                return true;
            }
            this.a = W;
            this.b = X;
            this.c = 0;
            this.d = 0;
            this.h = 0;
            this.k = Y;
            this.d((Math.abs(this.d) + Math.abs(this.c) >> 8) * d.a * 5 / p[0][6]);
            return true;
        }
        if (this.a(d.ff[1], true, false)) {
            this.e |= 0x200000;
            if (!bl) {
                ab = null;
                return true;
            }
            this.a = W;
            this.b = X;
            this.c = 0;
            this.d = 0;
            this.h = 0;
            this.k = Y;
            this.d((Math.abs(this.d) + Math.abs(this.c) >> 8) * d.a * 5 / p[0][6]);
            return true;
        }
        for (n = 0; n < R; ++n) {
            int n7;
            for (n7 = 0; n7 < 4; ++n7) {
                b.C[n7] = 0;
            }
            int n8 = P[n] - P[0];
            int n9 = Q[n] - Q[0];
            for (n7 = 0; n7 < 4; ++n7) {
                int n10;
                int n11 = P[n] + n7 % 2 * U;
                int n12 = Q[n] + n7 / 2 * V;
                int n13 = d.t(n11, n12);
                if (n13 != 2) continue;
                this.e |= 0x200000;
                if (!bl) {
                    ab = null;
                    return true;
                }
                if (n11 < 0) {
                    n11 += 6144;
                }
                if (n12 < 0) {
                    n12 += 6144;
                }
                int n14 = -((n12 >> 8) % 24) + 24 * (1 - n7 / 2) - 1;
                int n15 = -((n11 >> 8) % 24) + 24 * (1 - n7 % 2) - 1;
                b.C[2 + n7 % 2] = C[2 + n7 % 2] != 0 ? 0 : n14;
                b.C[n7 / 2] = C[n7 / 2] != 0 ? 0 : n15;
                bl2 = true;
                int n16 = n10 = this.h >= 0 ? 1 : -1;
                n2 = n7 / 2 == 0 ? (n2 += n8 * n10 / 2) : (n2 -= n8 * n10 / 2);
                if (n7 % 2 == 0) {
                    n2 -= n9 * n10 / 2;
                    continue;
                }
                n2 += n9 * n10 / 2;
            }
            if (!bl2) continue;
            n3 = Math.abs(C[0]) > Math.abs(C[1]) ? C[0] : C[1];
            n4 = Math.abs(C[2]) > Math.abs(C[3]) ? C[2] : C[3];
            n5 = Math.abs(n3);
            n6 = Math.abs(n4);
            break;
        }
        if (bl2) {
            if (n3 != 0 || n4 != 0) {
                if (n3 != 0) {
                    this.e |= 0x40000;
                }
                if (n4 != 0) {
                    this.e |= 0x80000;
                }
                if ((n3 == 0 || n5 > n6) && n4 != 0) {
                    this.b += n4 << 8;
                    this.a += (n6 << 8) * (n3 > 0 ? 1 : (n3 == 0 ? 0 : -1));
                    if (R == 3) {
                        this.d((Math.abs(this.d) >> 8) * d.a * 5 / p[0][6]);
                    }
                    this.d = 0;
                } else {
                    this.a += n3 << 8;
                    this.b += (n5 << 8) * (n4 > 0 ? 1 : (n4 == 0 ? 0 : -1));
                    if (R == 3) {
                        this.d((Math.abs(this.c) >> 8) * d.a * 5 / p[0][6]);
                    }
                    this.c = 0;
                }
            }
            this.k = Y;
            if (n2 != 0) {
                this.s = this.h * (n2 >= 0 ? 1 : -1);
                this.k += this.s;
                this.e();
                this.s /= 5;
            }
            if (R == 3) {
                if (this.h > p[r][2]) {
                    d.f(P[n] + U / 2, Q[n] + V / 2, 2);
                }
                this.h = (this.d * d.i(256 - this.i[1] * 16) + this.c * d.j(256 - this.i[1] * 16) >> 8) * d.a >> 8;
            }
            if (this.i[0] == 3) {
                if (this.i[17] > 0) {
                    while (this.i[17] > 0 && p[r][this.i[17]] > this.h) {
                        this.i[17] = (byte)(this.i[17] - 1);
                    }
                } else if (this.i[17] < 0) {
                    this.i[17] = 0;
                }
                d.dc |= 2;
            }
            this.e |= 0x200000;
            ab = null;
            return true;
        }
        this.e &= 0xFFDFFFFF;
        return false;
    }

    final boolean a(b b2, boolean bl, boolean bl2) {
        if (b2 == null) {
            return false;
        }
        if (R == 3 && this.h == 0 && this.c == 0 && this.d == 0 && this.s == 0) {
            return false;
        }
        int n = 0;
        boolean bl3 = false;
        while (b2 != null) {
            if (b2 == this || b2.i[0] == 10) {
                if (bl) {
                    b2 = b2.o;
                    continue;
                }
                return false;
            }
            int n2 = (Math.max(this.j[8], this.j[4]) + Math.max(b2.j[8], b2.j[4])) / 2;
            int n3 = (Math.max(this.j[8], this.j[5]) + Math.max(b2.j[8], b2.j[5])) / 2;
            if (Math.abs(this.a - b2.a) <= n2 && Math.abs(this.b - b2.b) <= n3) {
                int n4;
                int n5;
                if ((b2.e & 3) == 3) {
                    int n6;
                    n = 3;
                    short s = b2.j[8];
                    int n7 = s * d.j(256 - b2.i[1] * 16) / 3 >> 8;
                    int n8 = s * d.i(256 - b2.i[1] * 16) / 3 >> 8;
                    int n9 = n6 = b2.j[9] / 2;
                    int n10 = this.i[1] % 8;
                    if (n10 == 2 || n10 == 6) {
                        --n6;
                        --n9;
                    } else if (n10 == 1 || n10 == 7) {
                        --n6;
                    } else if (n10 == 3 || n10 == 5) {
                        --n9;
                    }
                    n5 = n6 * 2;
                    n4 = n9 * 2;
                    b.Z[0] = b2.a - n9;
                    b.aa[0] = b2.b - n6;
                    b.Z[1] = b2.a + n7 - n9;
                    b.aa[1] = b2.b + n8 - n6;
                    b.Z[2] = b2.a - n7 - n9;
                    b.aa[2] = b2.b - n8 - n6;
                } else {
                    if ((this.e & 3) == 3 && b2.i[6] == 1 && b2.N == this || b2.i[0] == 1 && (b2.e & 8) == 0) {
                        if (bl) {
                            b2 = b2.o;
                            continue;
                        }
                        b2 = null;
                        continue;
                    }
                    b.aa[0] = b2.b - b2.j[3];
                    n5 = b2.j[5];
                    b.Z[0] = b2.a - b2.j[2];
                    n4 = b2.j[4];
                    if (b2.i[0] == 8 || b2.i[0] == 4 || b2.i[0] == 1) {
                        aa[0] = aa[0] + b2.j[5] * 3 / 4;
                        n5 /= 4;
                        Z[0] = Z[0] + b2.j[4] / 4;
                        n4 /= 2;
                    }
                    n = 1;
                }
                for (int i = R - 1; i >= 0; --i) {
                    int n11 = P[i];
                    int n12 = Q[i];
                    int n13 = n11 + U;
                    int n14 = n12 + V;
                    for (int j = n - 1; j >= 0; --j) {
                        if (Z[j] > n13 || Z[j] + n4 < n11 || aa[j] > n14 || aa[j] + n5 < n12) continue;
                        if (bl2 && R == 3 && b2.i[0] == 6) {
                            b2.a((byte)8, this);
                        }
                        ab = b2;
                        if (R == 3 && b2.i[0] != 1) {
                            bl3 = true;
                        }
                        if ((this.i[0] == 4 || this.i[0] == 3) && b2.i[0] == 2) {
                            if (!d.cA && b2.i[12] != 8 || b2.i[12] == 8 && d.cw == 0 || b2.i[12] == 9 && d.cn == 100) continue;
                            d.e(b2.i[12], b2.j[9]);
                            d.a(0, b2);
                            return true;
                        }
                        if (R == 1 && n == 3) {
                            this.e |= 0x200000;
                            ab = b2;
                            return true;
                        }
                        if (!(bl2 || R == 3 && b2.i[0] == 1)) {
                            ab = b2;
                            return true;
                        }
                        if (this.h >= b2.h) {
                            this.e |= 0x200000;
                        } else {
                            b2.e |= 0x200000;
                        }
                        if (n == 3) {
                            int n15;
                            if (this.h > p[r][2] || b2.h > p[r][2]) {
                                d.f((n11 + Z[j] + n4) / 2, (n12 + aa[j] + n5) / 2, 2);
                            }
                            int n16 = P[i] - Z[0];
                            int n17 = aa[0] - Q[i];
                            if ((Z[j] - P[i]) * this.c < 0) {
                                n16 /= 4;
                            }
                            if ((aa[j] - Q[i]) * this.d < 0) {
                                n17 /= 4;
                            }
                            int n18 = (b2.j[8] + this.j[8]) / 2;
                            int n19 = Math.abs(this.c) + Math.abs(this.d);
                            int n20 = n19 + 1;
                            if (this.i[0] == 3) {
                                n19 *= 2;
                            }
                            int n21 = (this.d * n16 + this.c * n17) / n18;
                            if ((b2.e & 0x40000) == 0 && (this.e & 0x40000) == 0) {
                                b2.d(Math.abs((n21 - b2.s) * 5 / p[0][6]));
                                b2.s = n21;
                                if ((b2.e & 4) != 0) {
                                    b2.s /= 4;
                                }
                            }
                            int n22 = Math.abs(b2.c) + Math.abs(b2.d) + 1;
                            int n23 = n20 >> 8 >> 8;
                            int n24 = n22 >> 8 >> 8;
                            if (this.i[0] == 3) {
                                n23 *= 2;
                            } else if (b2.i[0] == 3) {
                                n24 *= 2;
                            }
                            if ((this.e & 0x10000) != 0) {
                                n23 *= 4;
                                n23 /= 2;
                            }
                            if ((b2.e & 4) != 0) {
                                n23 /= 1000;
                                n24 += 300;
                            }
                            if (n23 == 0) {
                                n23 = 1;
                            }
                            if (n24 == 0) {
                                n24 = 1;
                            }
                            int n25 = n24 * 100 / n23;
                            int n26 = n23 * 100 / n24;
                            if ((b2.e & 0x40000) != 0 || (this.e & 0x40000) != 0) {
                                this.c = 0;
                                b2.c = 0;
                            } else if ((Z[0] - P[0]) * this.c > 0) {
                                b2.c = n15 = (this.c * Math.abs(n21) + (b2.c * n25 + this.c * n26) / (n25 + n26) * (n19 + 1 - Math.abs(n21))) / (n19 + 1);
                                this.c = n15;
                            }
                            if ((b2.e & 0x80000) != 0 || (this.e & 0x80000) != 0) {
                                this.d = 0;
                                b2.d = 0;
                            } else if ((aa[0] - Q[0]) * this.d > 0) {
                                b2.d = n15 = (this.d * Math.abs(n21) + (b2.d * n25 + this.d * n26) / (n25 + n26) * (n19 + 1 - Math.abs(n21))) / (n19 + 1);
                                this.d = n15;
                            }
                            n15 = b2.h;
                            b2.h = (b2.d * d.i(256 - b2.i[1] * 16) + b2.c * d.j(256 - b2.i[1] * 16) >> 8 >> 8) * d.a;
                            if ((b2.e & 3) == 3) {
                                b2.d(Math.abs((b2.h - n15) * 5 / p[0][6]));
                            }
                            n15 = this.h;
                            this.h = (this.d * d.i(256 - this.i[1] * 16) + this.c * d.j(256 - this.i[1] * 16) >> 8 >> 8) * d.a;
                            if ((this.e & 3) == 3) {
                                this.d(Math.abs((this.h - n15) * 5 / p[0][6]));
                            }
                            if (this.i[0] == 3) {
                                if ((b2.e & 0x20) != 0 && b2.i[0] != 5) {
                                    d.bA = true;
                                    d.A(11);
                                }
                                if (this.i[17] > 0) {
                                    while (this.i[17] > 0 && p[r][this.i[17]] > this.h) {
                                        this.i[17] = (byte)(this.i[17] - 1);
                                    }
                                } else if (this.i[17] < 0) {
                                    this.i[17] = 0;
                                }
                                d.dc |= 2;
                            } else if (b2.i[0] == 3 && (this.e & 0x20) != 0 && this.i[0] != 5) {
                                d.bA = true;
                                d.A(11);
                            }
                            int n27 = 0;
                            int n28 = 0;
                            n27 = Z[j] >= n11 ? -(Z[j] - n13) : -(Z[j] + n4 - n11);
                            n28 = aa[j] >= n12 ? -(aa[j] - n14) : -(aa[j] + n5 - n12);
                            int n29 = Math.abs(n27);
                            int n30 = Math.abs(n28);
                            if (n29 <= n30) {
                                this.a(b2, n27, n29 * (n28 >= 0 ? 1 : -1), n25, n26);
                            } else {
                                this.a(b2, n30 * (n27 >= 0 ? 1 : -1), n28, n25, n26);
                            }
                            if (!bl) {
                                return true;
                            }
                        } else if (R == 3 && (b2.i[0] == 8 || b2.i[0] == 4)) {
                            if ((b2.e & 0x400) == 0 && ((b2.e & 0x100) == 0 || b2.i[0] == 8)) {
                                b2.a(11, this);
                            }
                            if (!bl) {
                                return bl3;
                            }
                        }
                        i = -1;
                        j = -1;
                    }
                }
            }
            if (bl) {
                b2 = b2.o;
                continue;
            }
            b2 = null;
        }
        return bl3;
    }

    final boolean x() {
        boolean bl = false;
        boolean bl2 = false;
        if (R == 3) {
            return false;
        }
        int[] nArray = new int[4];
        for (int i = 0; i < 4; ++i) {
            boolean bl3 = false;
            for (int j = 0; j < i; ++j) {
                if (d.cN[j] != d.cN[i]) continue;
                bl3 = true;
                break;
            }
            if (bl3) continue;
            int n = d.cN[i];
            int n2 = d.Q(n);
            int n3 = d.R(n);
            int n4 = d.cL[i];
            if (d.bc == null || d.bc[n4] == null) continue;
            short[] sArray = d.bc[n4];
            for (int j = 0; j < sArray.length; j += 5) {
                if (sArray[j + 4] != 1 || (sArray[j + 3] >> 3 & 0xFF) != 0 && (sArray[j + 3] >> 3 & 0xFF) != n + 1) continue;
                short s = sArray[j + 2];
                a a2 = d.bB[13];
                int n5 = sArray[j + 0] + n2 << 8;
                int n6 = sArray[j + 1] + n3 << 8;
                a2.a(nArray, (int)s, 0, n5, n6, 0, 0, 0);
                if (nArray[0] > P[0] + U || nArray[2] < P[0] || nArray[1] > Q[0] + V || nArray[3] < Q[0]) continue;
                ab = this;
                return true;
            }
        }
        return false;
    }

    public final boolean c(b b2) {
        int n = this.a - this.j[2];
        int n2 = this.b - this.j[3];
        int n3 = n + this.j[4];
        int n4 = n2 + this.j[5];
        int n5 = b2.a - b2.j[2];
        int n6 = b2.b - b2.j[3];
        int n7 = n5 + b2.j[4];
        int n8 = n6 + b2.j[5];
        return n < n7 && n3 > n5 && n2 < n8 && n4 > n6;
    }

    public final boolean c(int n, int n2, int n3, int n4) {
        int n5 = this.a - this.j[2];
        int n6 = this.b - this.j[3];
        int n7 = n5 + this.j[4];
        int n8 = n6 + this.j[5];
        return n5 < n3 && n7 > n && n6 < n4 && n8 > n2;
    }

    public final void a(b b2, int n, int n2, int n3, int n4) {
        if ((b2.e & 0xC0000) != 0) {
            if ((b2.e & 0x40000) != 0) {
                this.a -= n;
                this.e |= 0x40000;
            }
            if ((b2.e & 0x80000) != 0) {
                this.b -= n2;
                this.e |= 0x80000;
                return;
            }
        } else if ((this.e & 0xC0000) != 0) {
            if ((this.e & 0x40000) != 0) {
                b2.a += n;
            }
            if ((this.e & 0x80000) != 0) {
                b2.b += n2;
                return;
            }
        } else {
            b2.a += n * n3 / (n3 + n4);
            b2.b += n2 * n3 / (n3 + n4);
            this.a -= n * n4 / (n3 + n4);
            this.b -= n2 * n4 / (n3 + n4);
        }
    }

    public static final void y() {
        if ((I += 100) >= 8000) {
            H = !H;
            I -= 8000;
        }
    }

    static final void z() {
        for (int i = 0; i < 32; ++i) {
            b.ac[i] = new c();
            if (i < 8) {
                ac[i].a(d.bB[20]);
            } else {
                ac[i].a(d.bB[21]);
            }
            ac[i].a(i < 8 ? 24 : 0);
        }
        ad = 0;
    }

    static final void A() {
        for (int i = 0; i < 32; ++i) {
            b.ac[i] = null;
        }
        ad = 0;
        System.gc();
    }

    static final void B() {
        d.bB[20].b(0);
        for (int i = 0; i < 32; ++i) {
            if (i == 8) {
                d.bB[20].b(1);
            }
            if ((ad & 1 << i) == 0) continue;
            int n = b.ac[i].a;
            int n2 = b.ac[i].b;
            b.ac[i].a = (n >> 8) + d.bI;
            b.ac[i].b = (n2 >> 8) + d.bJ;
            ac[i].a(d.am);
            b.ac[i].a = n;
            b.ac[i].b = n2;
            ac[i].b();
            if (i < 8 || !ac[i].a()) continue;
            ad &= ~(1 << i);
        }
        d.bB[20].b(0);
    }

    private static void f(int n, b b2) {
        if (ac[n].a()) {
            b.ac[n].a = b2.m() + (b2.j[8] / 3 >> 8) * d.j(b2.k >> 8);
            b.ac[n].b = b2.n() + (b2.j[8] / 3 >> 8) * d.i(b2.k >> 8);
        }
    }

    private static byte c(b b2, boolean bl) {
        if (bl) {
            for (byte by = 8; by < 32; by = (byte)((byte)(by + 1))) {
                if ((ad & 1 << by) != 0) continue;
                b.ac[by].a = b2.m() - (b2.j[8] / 3 >> 8) * d.j(b2.k >> 8);
                b.ac[by].b = b2.n() - (b2.j[8] / 3 >> 8) * d.i(b2.k >> 8);
                ad |= 1 << by;
                return by;
            }
        } else {
            for (byte by = 0; by < 8; by = (byte)((byte)(by + 1))) {
                if ((ad & 1 << by) != 0) continue;
                b.ac[by].a = b2.m() + (b2.j[8] / 3 >> 8) * d.j(b2.k >> 8);
                b.ac[by].b = b2.n() + (b2.j[8] / 3 >> 8) * d.i(b2.k >> 8);
                ad |= 1 << by;
                return by;
            }
        }
        return -1;
    }

    private static void j(int n) {
        ad &= ~(1 << n);
    }

    static {
        x = (byte)-1;
        P = new int[3];
        Q = new int[3];
        R = 0;
        S = 0;
        T = 0;
        U = 0;
        V = 0;
        W = 0;
        X = 0;
        Y = 0;
        Z = new int[4];
        aa = new int[4];
        C = new int[4];
        ac = new c[32];
    }
}
