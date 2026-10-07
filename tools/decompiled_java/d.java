/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.GameCanvas
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 *  javax.microedition.media.control.VolumeControl
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.InvalidRecordIDException
 *  javax.microedition.rms.RecordEnumeration
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
extends GameCanvas
implements Runnable {
    static int a = 100;
    static final int b = 196608 / (a * 2);
    static int[] c;
    static final int d;
    static byte[] e;
    static int[] f;
    static byte[] g;
    static byte[] h;
    static byte[] i;
    static byte[] j;
    public static int[] k;
    static byte[] l;
    static byte[] m;
    static short[] n;
    static short[] o;
    static short[] p;
    static short[] q;
    static short[] r;
    static short[] s;
    static short[] t;
    static short[] u;
    static short[] v;
    static short[] w;
    static byte[] x;
    static int[] y;
    static byte[] z;
    static short[] A;
    static short[] B;
    static byte[] C;
    static byte[] D;
    static short[] E;
    private static InputStream gp;
    private static String gq;
    private static int gr;
    private static int[] gs;
    private static int gt;
    static Random F;
    public static int[] G;
    public static short H;
    static byte[] I;
    static short[] J;
    static int K;
    static int L;
    private static byte[][] gu;
    static int M;
    static final byte[] N;
    static Player O;
    static int P;
    static int Q;
    static int R;
    static boolean S;
    static int T;
    static int[] U;
    static a V;
    static int W;
    static int X;
    static byte Y;
    static int Z;
    static boolean aa;
    static String ab;
    private static a gv;
    private static c gw;
    private static Image gx;
    private static a gy;
    static boolean ac;
    private static Image gz;
    private static Image gA;
    private static int gB;
    private static int gC;
    private static int gD;
    static int ad;
    static int ae;
    static int af;
    static boolean ag;
    static byte ah;
    private static String gE;
    private static int gF;
    static boolean ai;
    static boolean aj;
    static boolean ak;
    static boolean al;
    static Graphics am;
    static byte[] an;
    static byte[] ao;
    static int ap;
    static boolean aq;
    static boolean ar;
    static boolean as;
    static long at;
    private boolean gG = false;
    static long au;
    static long av;
    static long aw;
    static long ax;
    static long ay;
    static int az;
    static Image aA;
    static Image aB;
    static Image aC;
    static Image[] aD;
    static Image[] aE;
    static Image[] aF;
    static byte[][] aG;
    static byte[][] aH;
    static byte[][] aI;
    static String[] aJ;
    static byte[] aK;
    static byte aL;
    static byte[] aM;
    static byte aN;
    static byte[] aO;
    static byte aP;
    static int aQ;
    static int aR;
    static int aS;
    static boolean aT;
    static boolean aU;
    static final String aV;
    static final String aW;
    public static boolean aX;
    static int[][] aY;
    static int[][] aZ;
    static short[][] ba;
    static short[][] bb;
    static short[][] bc;
    static short[][] bd;
    static short[][] be;
    static short[][] bf;
    static short[][] bg;
    static short[][] bh;
    static short[][] bi;
    static short[][] bj;
    static byte[][] bk;
    static byte[][] bl;
    static byte[] bm;
    static final String[] bn;
    static byte[] bo;
    static byte[][] bp;
    static boolean[] bq;
    static byte[][] br;
    static int bs;
    static short[][] bt;
    private static int gH;
    static byte[] bu;
    static int bv;
    static int bw;
    static int[] bx;
    static final boolean[] by;
    static boolean bz;
    static boolean bA;
    static a[] bB;
    static int[] bC;
    static int bD;
    static int bE;
    static int bF;
    static int bG;
    static boolean bH;
    static int bI;
    static int bJ;
    static int bK;
    static int bL;
    static int bM;
    public static long bN;
    public static boolean bO;
    public static boolean bP;
    public static boolean bQ;
    public static boolean bR;
    public static Graphics bS;
    public static boolean bT;
    public static int bU;
    public static int bV;
    public static int bW;
    static int[] bX;
    static boolean bY;
    static boolean bZ;
    static int ca;
    private static int gI;
    private static boolean[] gJ;
    static final int[] cb;
    static final int[] cc;
    static b cd;
    static b ce;
    static byte cf;
    static byte cg;
    static byte ch;
    static byte ci;
    static byte cj;
    static short ck;
    static byte cl;
    static final int[] cm;
    static short cn;
    static int co;
    static b cp;
    static b cq;
    static b cr;
    static final b cs;
    static int ct;
    static int cu;
    static int cv;
    static int cw;
    private static int gK;
    private static int gL;
    static int cx;
    static byte cy;
    static byte cz;
    static boolean cA;
    static boolean cB;
    static boolean cC;
    static boolean cD;
    static boolean cE;
    static boolean cF;
    static boolean cG;
    static byte cH;
    static int cI;
    static int cJ;
    private static long gM;
    public static final int[] cK;
    static final int[] cL;
    static final int[] cM;
    static final int[] cN;
    static int cO;
    static int cP;
    static boolean cQ;
    static final byte[] cR;
    static int cS;
    static int cT;
    private static c gN;
    private static c gO;
    static c cU;
    static a cV;
    static a cW;
    static a cX;
    static String[] cY;
    static int[] cZ;
    static int da;
    static int db;
    public static int dc;
    static boolean dd;
    static boolean de;
    static short[] df;
    static int[] dg;
    static short[] dh;
    static int[] di;
    public static int dj;
    private static int gP;
    private static int gQ;
    private static int gR;
    private static int gS;
    private static int gT;
    private static int gU;
    private static int gV;
    private static String gW;
    private static long gX;
    static short[] dk;
    static short[][] dl;
    static short[] dm;
    static short[] dn;
    static boolean do;
    static short[] dp;
    static final short[] dq;
    static byte[] dr;
    static final short[][] ds;
    static final short[] dt;
    static int du;
    static int dv;
    static int dw;
    static int dx;
    static int dy;
    static int dz;
    static int dA;
    static boolean dB;
    static boolean dC;
    static final short[] dD;
    static int dE;
    static int dF;
    static int dG;
    static int dH;
    static int dI;
    static int dJ;
    static int dK;
    static short[][] dL;
    static short[][] dM;
    static short[][] dN;
    static short[][] dO;
    static int dP;
    static int dQ;
    static int dR;
    static int dS;
    static int dT;
    static int dU;
    static int dV;
    static int dW;
    static short dX;
    static int dY;
    static int dZ;
    static int ea;
    static int eb;
    static boolean ec;
    static boolean ed;
    static boolean ee;
    static int ef;
    static byte eg;
    static byte eh;
    static byte ei;
    static final byte[] ej;
    static final b[] ek;
    static int el;
    static int em;
    static String en;
    static int eo;
    static boolean ep;
    static int eq;
    static b er;
    static int es;
    static int et;
    static final b[] eu;
    public static byte[] ev;
    static String ew;
    static String ex;
    static int ey;
    static int ez;
    static int eA;
    static String eB;
    static String eC;
    static String eD;
    static String eE;
    static int eF;
    static boolean eG;
    static int eH;
    static int eI;
    static int eJ;
    private static final byte[] gY;
    private static final byte[] gZ;
    static int eK;
    static int eL;
    static int eM;
    static int eN;
    static int eO;
    static int eP;
    static int eQ;
    static int eR;
    static int eS;
    static int eT;
    static int eU;
    static int eV;
    static byte eW;
    static byte eX;
    static byte eY;
    static short eZ;
    static short fa;
    static boolean fb;
    static Image fc;
    static b fd;
    static final int[] fe;
    private static final b[] ha;
    private static int hb;
    static final b[] ff;
    static final int[] fg;
    static final int[] fh;
    private static int hc;
    private static int hd;
    private static int he;
    private static int hf;
    public static int fi;
    public static int fj;
    private static int hg;
    static int fk;
    public static short[] fl;
    public static int fm;
    public static int fn;
    private static final int[] hh;
    private static final b[] hi;
    private static final int[] hj;
    static final int fo;
    static a fp;
    static byte[] fq;
    static byte[] fr;
    static byte[] fs;
    static int ft;
    static int fu;
    static int fv;
    static int fw;
    static int fx;
    static byte[] fy;
    static int fz;
    static int fA;
    static int fB;
    static int fC;
    static int fD;
    static int fE;
    private static int[] hk;
    private static int hl;
    private static int[] hm;
    private static b[] hn;
    private static Image ho;
    static Graphics fF;
    static int fG;
    static int fH;
    static int fI;
    static int fJ;
    static int fK;
    static int fL;
    static int[] fM;
    public static int fN;
    public static int fO;
    public static int fP;
    public static int fQ;
    static int fR;
    static int fS;
    static int[] fT;
    static int fU;
    static int fV;
    static int fW;
    static int fX;
    private static int hp;
    private static int hq;
    private static int hr;
    private static int hs;
    private static byte ht;
    private static int hu;
    private static int hv;
    private static int hw;
    static b fY;
    static final int fZ;
    static final int ga;
    static final int gb;
    static final int gc;
    static final int gd;
    static final byte[] ge;
    static int[] gf;
    static int[] gg;
    static int[] gh;
    static int gi;
    static long gj;
    static short[] gk;
    static byte[] gl;
    static int gm;
    static long gn;
    static long go;

    static final boolean a(String string) {
        try {
            if (string == gq) {
                return true;
            }
            if (gp != null) {
                gp.close();
                gp = null;
                System.gc();
            }
            System.gc();
            gq = string;
            gp = gq.getClass().getResourceAsStream(string);
            gt = 0;
            gr = d.d();
            if (gs != null) {
                gs = null;
            }
            gs = new int[gr];
            for (int i = 0; i < gr; ++i) {
                d.gs[i] = d.e() + 2 + 4 * gr;
            }
        }
        catch (Exception exception) {}
        return true;
    }

    static final void a(int n) {
        try {
            int n2;
            if (gt == n) {
                gt = n + 1;
                return;
            }
            if (gt > n) {
                gp = gq.getClass().getResourceAsStream(gq);
                gt = 0;
                gp.skip(gs[0]);
            }
            if ((n2 = gs[n] - gs[gt]) > 0) {
                gp.skip(n2);
            }
            gt = n + 1;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static final void a() {
        try {
            if (gq != null) {
                if (gp != null) {
                    gp.close();
                    gp = null;
                }
                gs = null;
                gq = null;
            }
        }
        catch (Exception exception) {}
        System.gc();
    }

    static final int b() {
        try {
            return gp.read();
        }
        catch (Exception exception) {
            return 0;
        }
    }

    static final int a(byte[] byArray, int n, int n2) {
        return d.b(byArray, n, n2);
    }

    static final int a(byte[] byArray) {
        return d.b(byArray, 0, byArray.length);
    }

    static final int b(byte[] byArray, int n, int n2) {
        int n3 = n;
        int n4 = n2;
        int n5 = 0;
        try {
            while (n4 > 0) {
                n5 = gp.read(byArray, n3, n4);
                n4 -= n5;
                n3 += n5;
            }
        }
        catch (Exception exception) {}
        return n2;
    }

    static final byte[] b(int n) {
        if (n < 0 || n >= gr) {
            return null;
        }
        byte[] byArray = null;
        d.a(n);
        byArray = new byte[gs[n + 1] - gs[n]];
        d.a(byArray);
        return byArray;
    }

    static final int c() {
        return d.b() & 0xFF;
    }

    static final int d() {
        return d.b() & 0xFF | (d.b() & 0xFF) << 8;
    }

    static final int e() {
        return d.b() & 0xFF | (d.b() & 0xFF) << 8 | ((d.b() & 0xFF) << 16 | (d.b() & 0xFF) << 24);
    }

    static final Image c(int n) {
        byte[] byArray = d.b(n);
        return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
    }

    static final byte[] d(int n) {
        byte[] byArray = null;
        d.a(n);
        int n2 = d.b() & 0xFF;
        byArray = new byte[n2];
        d.a(byArray, 0, n2);
        return byArray;
    }

    static final short[] e(int n) {
        short[] sArray = null;
        d.a(n);
        int n2 = d.b() & 0xFF;
        sArray = new short[n2];
        for (int i = 0; i < n2; ++i) {
            sArray[i] = (short)d.d();
        }
        return sArray;
    }

    static final byte[][] f(int n) {
        byte[][] byArrayArray = null;
        d.a(n);
        int n2 = d.b() & 0xFF;
        byArrayArray = new byte[n2][];
        for (int i = 0; i < n2; ++i) {
            int n3 = d.b() & 0xFF;
            if (byArrayArray[i] != null) {
                byArrayArray[i] = null;
            }
            byArrayArray[i] = new byte[n3];
            for (int j = 0; j < n3; ++j) {
                byArrayArray[i][j] = (byte)d.b();
            }
        }
        return byArrayArray;
    }

    static final short[][] g(int n) {
        short[][] sArrayArray = null;
        d.a(n);
        int n2 = d.b() & 0xFF;
        sArrayArray = new short[n2][];
        for (int i = 0; i < n2; ++i) {
            int n3 = d.b() & 0xFF;
            if (sArrayArray[i] != null) {
                sArrayArray[i] = null;
            }
            sArrayArray[i] = new short[n3];
            for (int j = 0; j < n3; ++j) {
                sArrayArray[i][j] = (short)d.d();
            }
        }
        return sArrayArray;
    }

    static final int[][] h(int n) {
        int[][] nArrayArray = null;
        d.a(n);
        int n2 = d.b() & 0xFF;
        nArrayArray = new int[n2][];
        for (int i = 0; i < n2; ++i) {
            int n3 = d.b() & 0xFF;
            if (nArrayArray[i] != null) {
                nArrayArray[i] = null;
            }
            nArrayArray[i] = new int[n3];
            for (int j = 0; j < n3; ++j) {
                nArrayArray[i][j] = d.e();
            }
        }
        return nArrayArray;
    }

    static final void f() {
        if (G != null) {
            return;
        }
        d.a("/a");
        d.a(0);
        if (G != null) {
            G = null;
        }
        G = new int[256];
        for (int i = 0; i < 256; ++i) {
            d.G[i] = d.e();
        }
        d.a();
        F = new Random(System.currentTimeMillis());
        System.gc();
    }

    static final int a(int n, int n2) {
        if (n2 != n) {
            int n3 = F.nextInt();
            if (n3 < 0) {
                n3 *= -1;
            }
            return n + n3 % (n2 - n);
        }
        return n2;
    }

    static final int i(int n) {
        return d.j(64 - n);
    }

    static final int j(int n) {
        return G[n & 0xFF];
    }

    static final int b(int n, int n2) {
        if (Math.abs(n) * 7 > Math.abs(n2) * 25) {
            if (n > 0) {
                return 0;
            }
            return 6;
        }
        if (Math.abs(n2) * 7 > Math.abs(n) * 25) {
            if (n2 > 0) {
                return 9;
            }
            return 3;
        }
        if (Math.abs(n) > Math.abs(n2)) {
            if (n > 0) {
                if (n2 > 0) {
                    return 11;
                }
                return 1;
            }
            if (n2 > 0) {
                return 7;
            }
            return 5;
        }
        if (n > 0) {
            if (n2 > 0) {
                return 10;
            }
            return 2;
        }
        if (n2 > 0) {
            return 8;
        }
        return 4;
    }

    static final int k(int n) {
        long l = 0L;
        long l2 = 32768L;
        long l3 = 15L;
        do {
            long l4;
            if ((long)n < (l4 = (l << 1) + l2 << (int)l3--)) continue;
            l += l2;
            n = (int)((long)n - l4);
        } while ((l2 >>= 1) > 0L);
        return (int)l;
    }

    static final void l(int n) {
        int n2;
        if (n == K) {
            return;
        }
        H = 0;
        J = null;
        I = null;
        d.a("/o");
        I = d.b(n);
        K = n;
        H = 1;
        for (n2 = 0; n2 < I.length; ++n2) {
            if (I[n2] != 0) continue;
            H = (short)(H + 1);
        }
        if (J != null) {
            J = null;
        }
        J = new short[H + 2];
        int n3 = 0;
        for (n2 = 0; n2 < I.length; n2 = (int)((short)(n2 + 1))) {
            if (I[n2] != 0) continue;
            d.J[++n3] = n2;
        }
        d.J[d.H + 1] = (short)I.length;
        d.a();
    }

    static final String m(int n) {
        int n2;
        if (I == null) {
            return "";
        }
        if (n < 0 || n >= J.length) {
            return "";
        }
        int n3 = J[n] & 0xFFFF;
        if (n3 != 0) {
            ++n3;
        }
        if ((n2 = (J[n + 1] & 0xFFFF) - n3) == 0) {
            return "";
        }
        return new String(I, n3, n2);
    }

    public static final String n(int n) {
        return new String("" + n);
    }

    public static final String o(int n) {
        return new String("$" + d.n(n));
    }

    static final void p(int n) {
        if (gu == null) {
            gu = new byte[24][];
            M = -1;
        }
        d.a("/n");
        d.gu[n] = d.b(n);
    }

    static final void q(int n) {
        if (gu != null) {
            d.gu[n] = null;
        }
    }

    static final void r(int n) {
        d.c(n, 0);
    }

    static final void c(int n, int n2) {
        if (L == 0) {
            return;
        }
        try {
            int n3 = n2 = n2 > 0 ? n2 : N[n];
            if (P != -1 && n2 > N[P]) {
                return;
            }
            if (M >= 0 && d.i() && (n2 > N[M] || n == M)) {
                return;
            }
            P = n;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static final void g() {
        if (P == -1) {
            return;
        }
        int n = P;
        P = -1;
        try {
            if (M != n) {
                d.h();
                O = Manager.createPlayer((InputStream)new ByteArrayInputStream(gu[n]), (String)(n < 19 ? "audio/midi" : "audio/x-wav"));
            }
            if (O == null) {
                return;
            }
            if (M != n) {
                M = n;
                O.realize();
                O.prefetch();
            }
            if (n == 9) {
                O.setLoopCount(-1);
            } else {
                O.setLoopCount(1);
            }
            ((VolumeControl)O.getControl("VolumeControl")).setLevel(33 * L);
            O.start();
            return;
        }
        catch (Exception exception) {
            M = -1;
            return;
        }
    }

    static final void h() {
        try {
            if (O != null) {
                M = -1;
                P = -1;
                O.stop();
                O.deallocate();
                O.close();
                O = null;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static final boolean i() {
        if (O != null) {
            return O.getState() == 400;
        }
        return false;
    }

    static final boolean s(int n) {
        if (n == M && O != null) {
            return O.getState() == 400;
        }
        return false;
    }

    static final void j() {
        if (d.i() && M <= 9) {
            Q = M;
        }
    }

    static final void k() {
        ++L;
        L %= 4;
        if (!S) {
            d.h();
        }
        if (L != 0 && T == 5) {
            d.r(0);
        }
    }

    static final void t(int n) {
        W = T;
        T = n;
        Y = 0;
        Z = 0;
        if (am != null) {
            d.av();
        }
        if (n == 8) {
            d.r(9);
        }
    }

    static final void u(int n) {
        T = n;
        if (am != null) {
            d.av();
        }
    }

    private static void ac() {
        boolean bl = bQ;
        switch (T) {
            case -1: {
                d.h(true);
                d.by();
                G = null;
                F = null;
                gx = null;
                break;
            }
            case 0: {
                d.t(1);
                break;
            }
            case 1: {
                d.ad();
                break;
            }
            case 2: {
                d.ae();
                break;
            }
            case 3: {
                d.af();
                break;
            }
            case 4: {
                d.ag();
                break;
            }
            case 5: {
                d.ak();
                break;
            }
            case 6: {
                d.ao();
                break;
            }
            case 7: {
                d.at();
                break;
            }
            case 8: {
                d.aU();
                break;
            }
            case 9: {
                d.ah();
                break;
            }
            case 10: {
                d.aj();
                break;
            }
            case 11: {
                d.ai();
                break;
            }
            case 12: 
            case 13: {
                d.an();
                break;
            }
            case 15: {
                d.t();
                break;
            }
            case 14: {
                d.v();
                break;
            }
            default: {
                d.t(-1);
            }
        }
        if (bR) {
            bR = false;
            ag = true;
            d.t(9);
        }
        if (bl) {
            bQ = false;
        }
    }

    private static void ad() {
        if (Y == 0) {
            am.setClip(0, 0, 240, 320);
            am.setColor(0);
            am.fillRect(0, 0, 240, 320);
            Y = (byte)(Y + 1);
            return;
        }
        if (Y == 1) {
            try {
                d.a("/t");
                byte[] byArray = d.b(0);
                gv = new a();
                gv.a(byArray, 0);
                gv.a(0, 0, -1, -1);
                gv.a();
                gw = new c(gv, 120, 160);
                d.a();
            }
            catch (Exception exception) {
                return;
            }
            Y = (byte)(Y + 1);
        }
        Y = (byte)(Y + 1);
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 0, 240, 320);
        gw.b();
        gw.a(am);
        if (gw.a()) {
            d.t(2);
            gv = null;
            gw = null;
            System.gc();
        }
    }

    private static void ae() {
        Object object;
        if (Z == 0) {
            System.gc();
            d.f();
            fK = 1;
            d.Y();
            if (W < 2) {
                fF.setColor(0);
                fF.setClip(0, 0, 240, 320);
                fF.fillRect(0, 0, 240, 320);
            }
            bw = 0;
        } else if (Z == 1) {
            if (b.A == null) {
                int n;
                d.a("/e");
                object = d.f(0);
                short[][] sArray = d.g(1);
                int[][] nArray = d.h(2);
                d.a();
                b.A = sArray[0];
                b.B = sArray[1];
                r = sArray[2];
                s = sArray[3];
                t = sArray[4];
                u = sArray[5];
                d.n = sArray[6];
                o = sArray[7];
                p = sArray[8];
                q = sArray[9];
                df = sArray[10];
                dh = sArray[11];
                bt = new short[1][];
                for (n = 0; n < 1; ++n) {
                    d.bt[n] = sArray[12 + n];
                }
                A = sArray[13];
                v = sArray[14];
                w = sArray[15];
                dk = sArray[16];
                dl = new short[6][];
                for (n = 0; n < 6; ++n) {
                    d.dl[n] = sArray[17 + n];
                }
                E = sArray[23];
                B = sArray[24];
                c = nArray[0];
                f = nArray[1];
                k = nArray[2];
                y = nArray[3];
                fM = nArray[4];
                dg = nArray[5];
                di = nArray[6];
                b.y = nArray[7];
                g = object[0];
                h = object[1];
                l = object[2];
                m = object[3];
                C = object[4];
                D = object[5];
                z = object[6];
                x = object[7];
                bo = object[8];
                bp = new byte[2][];
                d.bp[0] = object[9];
                d.bp[1] = object[10];
                bq = new boolean[bp[0].length];
                br = new byte[2][];
                d.br[0] = object[11];
                d.br[1] = object[12];
                b.z = object[13];
                e = object[14];
                j = object[15];
                i = object[16];
                System.gc();
            }
            d.l(2);
        } else if (Z == 2) {
            byte[] byArray;
            d.a("/c");
            if (a.D == null) {
                a.D = d.b(3);
            }
            if (cW == null) {
                byArray = d.b(1);
                cW = new a();
                cW.a(byArray, 0);
                System.gc();
                cW.c(4);
            }
            if (cX == null) {
                byArray = d.b(0);
                cX = new a();
                cX.a(byArray, 0);
                System.gc();
            }
            cX.c(1);
            cX.d(-4);
            cX.b(1);
            d.a();
        } else if (Z == 3) {
            d.a("/d");
            byte[] byArray = d.b(2);
            gy = new a();
            gy.a(byArray, 0);
            d.a();
            gy.a(0, 0, -1, -1);
            gy.a();
        } else if (Z == 6) {
            d.p(0);
            d.p(18);
            d.a();
        } else if (Z == 4) {
            int n;
            d.a("/b");
            object = d.b(1);
            V = new a();
            V.a((byte[])object, 0);
            byte[] byArray = d.b(0);
            byArray = d.b(byArray);
            if (W < 2) {
                gx = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
            }
            int n2 = ((byArray[35] & 0xFF) << 8) + (byArray[36] & 0xFF) + 4;
            int n3 = 49 + n2;
            System.arraycopy(byArray, n3 + n2, byArray, 41, n2);
            gz = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
            U = new int[76800];
            for (n = 0; n < 240; ++n) {
                d.U[n] = 0;
            }
            for (n = 1; n < 320; ++n) {
                System.arraycopy(U, 0, U, n * 240, 240);
            }
            d.a();
        } else if (Z == 5) {
            int n;
            for (int i = 0; i < 7; ++i) {
                int n4;
                n = i;
                if (aT && Y == 1) {
                    if (n == 2) continue;
                    if (n > 2) {
                        --n;
                    }
                }
                int n5 = 34 + n * 3 - 2;
                int n6 = 146 + n * 22;
                d.a(n5, n6, 2, 6, 0x70AAAAAA);
                d.a(n5 + 1, n6, 1, 12, 0x70AAAAAA);
                n5 += 2;
                for (n4 = 0; n4 <= 180; n4 += 5) {
                    d.a(n5 + n4, n6, 5, 18, 0x70AAAAAA);
                }
                d.a(n5 + n4, n6, 185 - n4, 18, 0x70AAAAAA);
                d.a(n5 += 185, n6 + 6, 1, 12, 0x70AAAAAA);
                d.a(n5 + 1, n6 + 12, 1, 6, 0x70AAAAAA);
            }
            if (W > 2) {
                gA = Image.createImage((int)240, (int)320);
                Graphics graphics = gA.getGraphics();
                for (n = 0; n < 55; ++n) {
                    graphics.setColor(d.a(6459040, 6459040, (n - 0) * 255 / 55));
                    graphics.drawLine(0, n, 240, n);
                }
                graphics.setColor(6459040);
                graphics.fillRect(0, 55, 240, 265);
                graphics.drawImage(gz, 120, 0, 17);
                graphics.setClip(0, 0, 240, 320);
                V.a(graphics, 1, 0, 80, 0, 0, 0);
                V.a(graphics, 0, 0, 240, 0, 0, 0);
                gz = null;
                System.gc();
                graphics.drawRGB(U, 0, 240, 0, 0, 240, 320, true);
            }
        }
        int n = W == 1 ? Z * 240 / 6 : (31 + Z) * 240 / 36;
        d.x(n);
        System.gc();
        if (++Z >= 7) {
            if (W < 2) {
                if (!d.h(false)) {
                    aX = true;
                }
                d.s();
                d.t(3);
                Z = 1;
                return;
            }
            d.h(true);
            if (aa) {
                d.t(13);
            } else {
                d.t(5);
            }
            if (!d.i()) {
                d.r(0);
            }
        }
    }

    private static void af() {
        am.setColor(0);
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 0, 240, 320);
        cW.b(0);
        cW.b(am, 2, 120, 150, 33);
        am.setColor(0xFFFFFF);
        am.drawLine(90, 160, 150, 160);
        int n = Z == 0 && (au & 8L) == 0L ? 1 : 0;
        cW.b(n);
        cW.b(am, 14 - Z * 2, 120, 180, 3);
        n = Z == 1 && (au & 8L) == 0L ? 1 : 0;
        cW.b(n);
        cW.b(am, 13 + Z * 2, 120, 200, 3);
        cW.b(0);
        cW.b(am, 28, 3, 320, 36);
        if (an[3] < 0 || an[9] < 0) {
            Z ^= 1;
        }
        if (an[6] < 0 || an[14] < 0) {
            L = Z == 0 ? 3 : 0;
            d.h(true);
            d.r(0);
            d.t(4);
        }
    }

    private static void ag() {
        am.setClip(0, 0, 240, 320);
        for (int i = 0; i < 55; ++i) {
            am.setColor(d.a(16765085, 15506044, (i - 0) * 255 / 55));
            am.drawLine(0, i, 240, i);
        }
        am.setColor(16764315);
        am.fillRect(0, 55, 240, 265);
        am.drawImage(gx, 120, 0, 17);
        cW.b((au & 8L) == 0L ? 1 : 0);
        cW.b(am, 3, 120, 240, 17);
        if (an[6] < 0) {
            X = -1;
            d.t(5);
            gx = null;
            System.gc();
            if (W > 2) {
                gA = Image.createImage((int)240, (int)320);
                Graphics graphics = gA.getGraphics();
                for (int i = 0; i < 55; ++i) {
                    graphics.setColor(d.a(6459040, 6459040, (i - 0) * 255 / 55));
                    graphics.drawLine(0, i, 240, i);
                }
                graphics.setColor(6459040);
                graphics.fillRect(0, 55, 240, 265);
                graphics.drawImage(gz, 120, 0, 17);
                graphics.setClip(0, 0, 240, 320);
                V.a(graphics, 1, 0, 80, 0, 0, 0);
                V.a(graphics, 0, 0, 240, 0, 0, 0);
                gz = null;
                System.gc();
                graphics.drawRGB(U, 0, 240, 0, 0, 240, 320, true);
            }
        }
    }

    public static final int a(int n, int n2, int n3) {
        int n4 = ((n >> 16 & 0xFF) * n3 + (n2 >> 16 & 0xFF) * (255 - n3)) / 255 & 0xFF;
        int n5 = ((n >> 8 & 0xFF) * n3 + (n2 >> 8 & 0xFF) * (255 - n3)) / 255 & 0xFF;
        int n6 = ((n & 0xFF) * n3 + (n2 & 0xFF) * (255 - n3)) / 255 & 0xFF;
        return n4 << 16 | n5 << 8 | n6;
    }

    private static void ah() {
        block66: {
            int n;
            int n2;
            int n3;
            if (bQ) {
                d.at();
                am.setClip(0, 0, 240, 320);
                am.setColor(0);
                for (n3 = 0; n3 < 320; n3 += 2) {
                    am.drawLine(0, n3, 240, n3);
                }
                bQ = false;
            }
            n3 = 94;
            if (Y != 0 && Y != 5) {
                n2 = 0;
                if (Y == 6) {
                    n2 = 3;
                } else {
                    if (Y == 1 && ex == "") {
                        ++n2;
                    }
                    if (Y == 1 && ee) {
                        ++n2;
                    }
                    if (Y == 2) {
                        ++n2;
                        if (cf == 0 && (dP == 1 || dP == 19)) {
                            ++n2;
                        }
                    }
                }
                n3 = 94 + n2 * 19 / 2;
                d.c(38, n3, 202, 227 - n2 * 19 / 2);
                for (n = 1; n < 7 - n2; ++n) {
                    am.setColor(54, 20, 57);
                    am.drawLine(38, n3 + n * 19, 201, n3 + n * 19);
                    am.setColor(237, 155, 178);
                    am.drawLine(38, n3 + 1 + n * 19, 201, n3 + 1 + n * 19);
                }
                n3 += 4;
                am.setColor(0);
                am.fillRect(0, 294, 240, 26);
                d.b(36, -1, 40);
            }
            switch (Y) {
                case 0: {
                    Z = 0;
                    Y = X == 2 ? (byte)2 : (byte)1;
                    am.setClip(0, 0, 240, 320);
                    am.setColor(0);
                    for (n2 = 0; n2 < 320; n2 += 2) {
                        am.drawLine(0, n2, 240, n2);
                    }
                    if (!ag) break;
                    d.j();
                    d.h();
                    ag = false;
                    return;
                }
                case 1: {
                    n2 = 0;
                    for (n = 0; n < 7; ++n) {
                        if (n == Z) {
                            cX.b(0);
                        } else {
                            cX.b(1);
                        }
                        if (n == 3 && ex == "" || n == 1 && ee) continue;
                        cX.b(am, 12 + n, 120, n3 + n2 * 19 + 1, 17);
                        ++n2;
                    }
                    if (an[3] < 0) {
                        if (--Z < 0) {
                            Z = 6;
                        }
                        if (Z == 3 && ex == "") {
                            --Z;
                        } else if (Z == 1 && ee) {
                            --Z;
                        }
                    }
                    if (an[9] < 0) {
                        ++Z;
                        if ((Z %= 7) == 3 && ex == "") {
                            ++Z;
                        } else if (Z == 1 && ee) {
                            ++Z;
                        }
                    }
                    if (an[13] < 0) {
                        Z = 0;
                        Y = (byte)5;
                    }
                    if (an[6] >= 0 && an[14] >= 0) break;
                    d.r(18);
                    Y = (byte)5;
                    return;
                }
                case 2: {
                    cX.a(am, d.m(14), 120, n3 + 1, 17);
                    n2 = 0;
                    for (n = 0; n < 3; ++n) {
                        if (cf == 0 && (dP == 1 || dP == 19) && n == 2) continue;
                        if (n == Z) {
                            cX.b(0);
                        } else {
                            cX.b(1);
                        }
                        String string = "";
                        if (n == 0) {
                            string = d.m(30 + L);
                            S = L != 3;
                        } else if (n == 1) {
                            string = d.m(93 - ah);
                        } else if (n == 2) {
                            string = d.m(35 - cH);
                        }
                        cX.a(am, d.m(27 + n) + string, 120, n3 + (n2 + 2) * 19 + 1, 17);
                        ++n2;
                    }
                    if (an[3] < 0) {
                        if (--Z < 0) {
                            Z = 2;
                        }
                        if (cf == 0 && (dP == 1 || dP == 19) && Z == 2) {
                            --Z;
                        }
                    }
                    if (an[9] < 0) {
                        ++Z;
                        if (cf == 0 && (dP == 1 || dP == 19) && (Z %= 3) == 2) {
                            ++Z;
                            Z %= 3;
                        }
                    }
                    if (an[6] < 0 || an[14] < 0) {
                        switch (Z) {
                            case 0: {
                                d.k();
                                break;
                            }
                            case 1: {
                                ah = (byte)(1 - ah);
                                d.v(200);
                                break;
                            }
                            case 2: {
                                cH = (byte)(1 - cH);
                            }
                        }
                        d.r(18);
                    }
                    if (an[13] >= 0) break;
                    Y = 0;
                    X = -1;
                    bQ = true;
                    d.h();
                    return;
                }
                case 6: {
                    cX.b(1);
                    cX.b(am, 41, 120, n3 + 1, 17);
                    cX.b(Z);
                    cX.b(am, 94 - Z * 2, 120, n3 + 38 + 1, 17);
                    cX.b(Z ^ 1);
                    cX.b(am, 93 + Z * 2, 120, n3 + 57 + 1, 17);
                    if (an[3] < 0 || an[9] < 0) {
                        Z ^= 1;
                    }
                    if (an[6] < 0 || an[14] < 0) {
                        d.r(18);
                        if (Z == 0) {
                            if (X == -1) {
                                d.h(true);
                            }
                            d.t(X);
                            X = 2;
                            Q = -1;
                        } else {
                            Y = 0;
                            X = -1;
                            bQ = true;
                        }
                    }
                    if (an[13] >= 0) break;
                    Y = 0;
                    X = -1;
                    return;
                }
                case 5: {
                    switch (Z) {
                        case 0: {
                            dc |= 0xFF;
                            d.C(fW, fX);
                            d.t(W);
                            cX.b(1);
                            if (ed && eI == 0 && el > 0 && el < 4000) {
                                bQ = true;
                            }
                            if (Q != -1) {
                                d.r(Q);
                                Q = -1;
                                return;
                            }
                            break block66;
                        }
                        case 1: {
                            am.setClip(0, 0, 240, 320);
                            am.setColor(0);
                            am.fillRect(0, 0, 240, 320);
                            d.f(152, 168);
                            cX.b(am, 0, 120, 160, 3);
                            d.u(10);
                            Y = 0;
                            Z = 0;
                            return;
                        }
                        case 2: {
                            Y = 0;
                            X = 2;
                            bQ = true;
                            return;
                        }
                        case 3: {
                            d.u(11);
                            gD = 0;
                            return;
                        }
                        case 4: {
                            d.u(12);
                            Y = 0;
                            return;
                        }
                        case 5: {
                            Y = (byte)6;
                            X = 6;
                            Z = 1;
                            bQ = true;
                            return;
                        }
                        case 6: {
                            Y = (byte)6;
                            X = -1;
                            Z = 1;
                            bQ = true;
                        }
                    }
                }
            }
        }
    }

    private static void ai() {
        am.setColor(0);
        am.setClip(0, 0, 240, 320);
        am.fillRect(0, 0, 240, 320);
        cX.b(3);
        if (dP >= 0) {
            cX.b(am, 236 + dP, 120, 10, 3);
        }
        cX.b(1);
        cX.a(am, ex, 120, 160, 3, 240, gD * 12, (gD + 1) * 12, false);
        int n = 50;
        while (a.F[n - 1] == 0) {
            --n;
        }
        if (gD < (n - 1) / 12) {
            d.b(36, 37, -1);
        } else {
            d.b(36, -1, -1);
        }
        if (an[13] < 0) {
            dc |= 0xFF;
            bQ = true;
            d.u(9);
            Z = 3;
            Y = 1;
        }
        if (an[6] < 0 && gD < (n - 1) / 12) {
            ++gD;
        }
    }

    private static void aj() {
        if (Y != 1) {
            fK = 22;
            am.setClip(0, 0, 240, 320);
            am.setColor(0);
            am.fillRect(0, 0, 240, 320);
            d.f(152, 168);
            cX.b(am, 0, 120, 160, 3);
            if (Z == 0) {
                fR = 61440 / (fz * ft);
                fS = 68608 / (fA * fu);
                if (fR > 256) {
                    fR = 256;
                }
                if (fS > 256) {
                    fS = 256;
                }
                fG = -1;
                fH = -1;
            } else if (Z <= fr.length / fv) {
                int n = Z - 1;
                int n2 = 264 / ft;
                int n3 = n % n2 * ft;
                int n4 = n / n2 * fu;
                for (int i = 0; i < ft; ++i) {
                    for (int j = 0; j < fu; ++j) {
                        int n5 = fr[n * fv + i + j * ft] & 0xFF;
                        fF.setColor(fM[fq[n5 / 4] >> (3 - (n5 & 3)) * 2 & 3]);
                        fF.fillRect(n3 + i * fR / 256, n4 + j * fS / 256, 1, 1);
                    }
                }
            } else {
                fL = fK;
                Y = 1;
                dc = 255;
            }
            ++Z;
            return;
        }
        if (dc != 0) {
            d.l();
            dc &= 0xFFFF00FF;
        }
        am.setClip(0, 0, 240, 320);
        int n = (d.cd.a >> 8 >> 8) / 24;
        int n6 = (d.cd.a >> 8) - (n * 24 << 8);
        int n7 = (d.cd.b >> 8 >> 8) / 24;
        int n8 = (d.cd.b >> 8) - (n7 * 24 << 8);
        int n9 = ad + n * fR + (n6 * fR / 24 >> 8) - 2;
        int n10 = ae + n7 * fS + (n8 * fS / 24 >> 8) - 2;
        am.setColor(Math.abs(((int)au * 6 & 0xFF) - 127) + 126, 0, 0);
        am.fillRect(n9, n10, 5, 5);
        am.fillRect(17, af, 12, 12);
        am.setColor(0);
        am.drawRect(16, af - 1, 13, 13);
        d.b(36, -1, -1);
        if (an[13] < 0) {
            fK = 1;
            fG = -1;
            fH = -1;
            d.Z();
            dc |= 0xFF;
            bQ = true;
            d.u(9);
            Z = 1;
            Y = 1;
            return;
        }
    }

    public static final void l() {
        am.setClip(0, 0, 240, 320);
        am.setColor(8701183);
        am.fillRect(0, 0, 240, 320);
        am.setColor(8701183);
        am.fillRect(ad, ae, 240 - 2 * ad, 320);
        if (cf == 0) {
            ad = (240 - (fz * ft * fR >> 8)) / 2;
            ae = 39;
            af = 239;
        } else {
            ad = (240 - (fz * ft * fR >> 8)) / 2;
            ae = 26;
            af = 262;
        }
        d.c(am);
        if (cf == 0) {
            am.setColor(20656);
            am.fillRect(0, 0, 240, ae);
            am.fillRect(0, 200, 240, 120);
            am.setColor(8559870);
            am.drawRect(0, 37, 239, 164);
            am.drawRect(1, 38, 237, 162);
            cX.a(am, d.m(13), 120, 13, 17);
        } else {
            am.setColor(20656);
            am.fillRect(0, 0, 240, ae);
            am.fillRect(0, 250, 240, 70);
            am.setColor(8559870);
            am.drawRect(0, ae - 2, 239, 227);
            am.drawRect(1, ae - 1, 237, 225);
            cX.a(am, d.m(13), 120, 7, 17);
        }
        d.aR();
        d.bf();
        am.setClip(0, 0, 240, 320);
        cX.a(am, d.m(230), 32, af + 12, 36);
        am.setColor(0xFF8000);
        am.fillRect(17, af + 15, 12, 12);
        am.setColor(0);
        am.drawRect(16, af - 1 + 15, 13, 13);
        cX.a(am, d.m(232), 32, af + 15 + 12, 36);
        am.setColor(41215);
        am.fillRect(17, af + 30, 12, 12);
        am.setColor(0);
        am.drawRect(16, af - 1 + 30, 13, 13);
        cX.a(am, d.m(231), 32, af + 30 + 12, 36);
        am.setColor(0xFF00FF);
        am.fillRect(128, af, 12, 12);
        am.setColor(0);
        am.drawRect(127, af - 1, 13, 13);
        cX.a(am, d.m(234), 143, af + 12, 36);
        am.setColor(0xFFFF00);
        am.fillRect(128, af + 15, 12, 12);
        am.setColor(0);
        am.drawRect(127, af + 15 - 1, 13, 13);
        cX.a(am, d.m(233), 143, af + 15 + 12, 36);
    }

    static final void a(int n, int n2, int n3, int n4, int n5) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n; j < n + n3; ++j) {
                d.U[i * 240 + j] = n5;
            }
        }
    }

    static final void v(int n) {
        if (ah == 1) {
            if (T == 7 && (cB || cE)) {
                return;
            }
            try {
                Display.getDisplay((MIDlet)mygame.a).vibrate(n);
                return;
            }
            catch (Exception exception) {
                d.b("vib error");
            }
        }
    }

    static final void b(String string) {
        gE = string;
    }

    d() {
        super(false);
        an = new byte[15];
        ao = new byte[15];
        for (int i = 0; i < cR.length; ++i) {
            d.cR[i] = -1;
        }
        d.cR[7] = 0;
        d.cR[5] = 8;
        d.cR[3] = 4;
        d.cR[9] = 12;
        d.cR[4] = 2;
        d.cR[2] = 6;
        d.cR[8] = 10;
        d.cR[10] = 14;
        d.t(0);
        W = -1;
        X = -1;
        a.a = new int[2500];
        Display.getDisplay((MIDlet)mygame.a).setCurrent((Displayable)this);
        new Thread(this).start();
    }

    public final void m() {
        if (aq) {
            aq = false;
            Display.getDisplay((MIDlet)mygame.a).setCurrent((Displayable)this);
        }
        this.repaint();
    }

    public final void n() {
        aq = true;
    }

    public final void o() {
        T = -1;
        Display.getDisplay((MIDlet)mygame.a).setCurrent(null);
    }

    public final void hideNotify() {
        d.r();
        ar = true;
        if (T == 3 || T != 14 && Y == 6) {
            Z = 1;
        }
        if (!ed || el > 0 || bD <= 80 || eI >= 0) {
            if (ed && eI == 0 && el > 0 && el < 4000) {
                bQ = true;
                bR = true;
            } else if (!(T != 7 || ec || bO || cG)) {
                bQ = true;
                if (!(cF || cB || cE || eI != 0 || (ew != "" || eC != "") && eI == 0 && bD > 1)) {
                    bR = true;
                }
            } else if (T == 9) {
                bQ = true;
            } else if (T == 8) {
                dc = 983040;
            } else if (T == 10) {
                dc = 65280;
            } else if (T == 5 || T == 14) {
                dc = 1;
            }
        }
        if (bQ) {
            dc = 255;
        }
        d.j();
        d.h();
        aj = true;
        ai = false;
    }

    public final void showNotify() {
        ar = false;
        aj = true;
        ai = false;
    }

    public final void run() {
        try {
            this.setCommandListener(null);
            this.setFullScreenMode(true);
            this.gG = true;
            while (T >= 0) {
                if (System.currentTimeMillis() - ay > 2000L) {
                    Display.getDisplay((MIDlet)mygame.a).flashBacklight(0);
                    Display.getDisplay((MIDlet)mygame.a).flashBacklight(100);
                    ay = System.currentTimeMillis();
                }
                Thread.yield();
                if (ar) continue;
                at = System.currentTimeMillis();
                this.p();
                if (T != 2) {
                    long l;
                    do {
                        l = System.currentTimeMillis() - at;
                        Thread.yield();
                    } while (l >= 0L && l < 100L);
                }
                if (!ai) continue;
                if (ak && !d.s(R)) {
                    al = true;
                } else if (ak && d.s(R)) {
                    Q = -1;
                } else {
                    ak = false;
                }
                if (aj || al) {
                    if (Q != -1 && !bR && T != 9 && T != 10 && T != 11 && T != 12) {
                        d.r(Q);
                        R = Q;
                        ak = true;
                    }
                    aj = false;
                    al = false;
                }
                d.g();
            }
        }
        catch (Exception exception) {
            T = -1;
        }
        mygame.a.destroyApp(true);
    }

    final void p() {
        this.a(this.getGraphics());
        this.flushGraphics();
    }

    public final void paint(Graphics graphics) {
    }

    final void a(Graphics graphics) {
        this.q();
        ai = true;
        if (as) {
            return;
        }
        as = true;
        if (!this.gG) {
            as = false;
            return;
        }
        if (ar) {
            as = false;
            return;
        }
        ++au;
        try {
            am = graphics;
            d.ac();
        }
        catch (Exception exception) {
            T = -1;
        }
        if (gE != null && gE.length() > 0) {
            graphics.setClip(0, 0, this.getWidth(), this.getHeight());
            graphics.setColor(0, 0, 0);
            graphics.fillRect(0, gF, this.getWidth(), graphics.getFont().getHeight());
            graphics.setColor(255, 255, 255);
            graphics.drawString(gE, 1, gF, 20);
        }
        as = false;
    }

    public static final void b(int n, int n2, int n3) {
        am.setClip(0, 0, 240, 320);
        cX.b(1);
        cX.c(1);
        cX.b(am, n3, 2, 319, 36);
        cX.b(am, n2, 120, 318, 33);
        cX.b(am, n, 238, 318, 40);
    }

    protected final void keyPressed(int n) {
        byte by = this.w(n);
        if (ao[by] > 0) {
            return;
        }
        if (ao[by] < 0) {
            d.ao[by] = 0;
        }
        if (ao[by] < 126) {
            byte by2 = by;
            ao[by2] = (byte)(ao[by2] + 1);
        }
    }

    protected final void keyRepeated(int n) {
    }

    protected final void keyReleased(int n) {
        byte by = this.w(n);
        if (ao[by] > 0) {
            byte by2 = by;
            ao[by2] = (byte)(ao[by2] * -1);
        }
    }

    final byte w(int n) {
        try {
            int n2 = this.getGameAction(n);
            if (n2 == 1) {
                return 3;
            }
            if (n2 == 2) {
                return 5;
            }
            if (n2 == 5) {
                return 7;
            }
            if (n2 == 6) {
                return 9;
            }
            if (n2 == 8) {
                return 6;
            }
        }
        catch (Exception exception) {}
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 5;
        }
        if (n == 5) {
            return 7;
        }
        if (n == 6) {
            return 9;
        }
        if (n == 35) {
            return 12;
        }
        if (n == 42) {
            return 11;
        }
        if (n == 48) {
            return 1;
        }
        if (n == 49) {
            return 2;
        }
        if (n == 50) {
            return 3;
        }
        if (n == 51) {
            return 4;
        }
        if (n == 52) {
            return 5;
        }
        if (n == 53) {
            return 6;
        }
        if (n == 54) {
            return 7;
        }
        if (n == 55) {
            return 8;
        }
        if (n == 56) {
            return 9;
        }
        if (n == 57) {
            return 10;
        }
        if (n == -7) {
            return 13;
        }
        if (n == -6) {
            return 14;
        }
        return 0;
    }

    final void q() {
        ap = -1;
        for (int i = 0; i < 15; ++i) {
            d.an[i] = ao[i];
            if (ao[i] == 0) continue;
            if (ao[i] < 0) {
                d.ao[i] = 0;
                continue;
            }
            if (ao[i] >= 126) continue;
            if (ao[i] == 1) {
                ap = i;
            }
            int n = i;
            ao[n] = (byte)(ao[n] + 1);
            if (i < 13) continue;
            int n2 = i;
            ao[n2] = (byte)(ao[n2] * -1);
        }
    }

    static final void r() {
        for (int i = 0; i < 15; ++i) {
            d.an[i] = 0;
            d.ao[i] = 0;
        }
    }

    private static void ak() {
        switch (Y) {
            case 0: {
                dc = 1;
                if (X == -1) {
                    Z = ac ? 1 : 0;
                } else {
                    Z = X;
                    X = -1;
                }
                Y = 1;
                gB = 4;
                gC = 7;
                ab = d.m(11);
                d.aA();
                break;
            }
            case 1: {
                if (an[6] >= 0 && an[14] >= 0) break;
                d.r(18);
                int n = Z;
                switch (n) {
                    case 0: {
                        if (ac) {
                            X = -2;
                            ab = d.m(17);
                            Y = (byte)6;
                            dc = 1;
                            Z = 1;
                            gB = 12;
                            gC = 2;
                            return;
                        }
                        Y = (byte)5;
                        d.bD();
                        return;
                    }
                    case 1: {
                        if (!ac) break;
                        Y = (byte)5;
                        return;
                    }
                    case 3: {
                        Y = (byte)2;
                        dc = 1;
                        ab = d.m(7);
                        gB = 18;
                        gC = 3;
                        Z = 0;
                        break;
                    }
                    case 2: {
                        d.h();
                        System.gc();
                        d.t(15);
                        return;
                    }
                    case 5: {
                        d.t(13);
                        return;
                    }
                    case 4: {
                        d.t(12);
                        return;
                    }
                    case 6: {
                        X = -1;
                        ab = d.m(16);
                        Y = (byte)6;
                        Z = 1;
                        dc = 1;
                        gB = 12;
                        gC = 2;
                        return;
                    }
                }
                break;
            }
            case 2: {
                if (an[6] < 0 || an[14] < 0) {
                    switch (Z) {
                        case 0: {
                            d.k();
                            break;
                        }
                        case 1: {
                            d.r(18);
                            ah = (byte)(1 - ah);
                            d.v(200);
                            break;
                        }
                        case 2: {
                            d.r(18);
                            cH = (byte)(1 - cH);
                        }
                    }
                }
                if (an[13] >= 0) break;
                System.gc();
                X = 3;
                Y = 0;
                return;
            }
            case 4: {
                break;
            }
            case 5: {
                if (Z != 0 && Z != 1) break;
                bs = 0;
                cg = (byte)-1;
                cj = (byte)-1;
                cW = null;
                gz = null;
                V = null;
                gy = null;
                gz = null;
                U = null;
                gA = null;
                d.h();
                d.q(0);
                d.q(18);
                System.gc();
                d.t(6);
                d.a("/c");
                if (cX == null) {
                    byte[] byArray = d.b(0);
                    cX = new a();
                    cX.a(byArray, 0);
                    System.gc();
                }
                cX.c(1);
                cX.d(-4);
                d.a();
                return;
            }
            case 6: {
                if (an[6] < 0 || an[14] < 0) {
                    d.r(18);
                    if (Z == 0) {
                        if (X == -1) {
                            d.t(-1);
                            return;
                        }
                        ed = false;
                        d.bD();
                        Y = (byte)5;
                        Z = 0;
                        dc = 1;
                        return;
                    }
                    X = X == -1 ? 6 : 0;
                    Y = 0;
                    return;
                }
                if (an[13] >= 0) break;
                X = X == -1 ? 6 : 0;
                Y = 0;
                return;
            }
            default: {
                Y = 1;
                ab = d.m(11);
                dc = 1;
            }
        }
        d.am();
        if (an[3] < 0) {
            if (--Z < 0) {
                Z = gC - 1;
            }
            if (aT && Y == 1 && Z == 2) {
                --Z;
            }
            if (Y == 1 && Z == 1 && !ac) {
                --Z;
            }
            dc = 4;
            return;
        }
        if (an[9] < 0) {
            ++Z;
            if (Y == 1 && (Z %= gC) == 1 && !ac) {
                ++Z;
            }
            if (aT && Y == 1 && Z == 2) {
                ++Z;
            }
            dc = 4;
        }
    }

    private static void al() {
        am.drawImage(gA, 120, 0, 17);
    }

    private static void am() {
        int n;
        int n2 = Z;
        if (aT && Y == 1 && n2 > 2) {
            --n2;
        }
        if (dc == 1) {
            am.setClip(0, 0, 240, 320);
        } else if (dc == 2) {
            n = 34 + n2 * 3 - 2;
            am.setClip(n, 146 + n2 * 22 - 1, 189, 19);
        } else if (dc == 4) {
            am.setClip(0, 146, 240, 22 * gC);
        }
        am.setColor(0);
        am.fillRect(0, 0, 240, 320);
        d.al();
        if (ab != "") {
            cW.b(0);
            cW.a(am, ab, 237, 18, 24);
        }
        for (n = 0; n < gC; ++n) {
            n2 = n;
            if (aT && Y == 1) {
                if (n2 == 2) continue;
                if (n2 > 2) {
                    --n2;
                }
            }
            if (n == Z) {
                int n3;
                int n4 = 34 + n2 * 3 - 2;
                int n5 = 146 + n2 * 22;
                am.setColor(255, 155, 0);
                am.fillRect(n4, n5, 2, 6);
                am.fillRect(n4 + 1, n5, 1, 12);
                n4 += 2;
                for (n3 = 0; n3 <= 180; n3 += 5) {
                    am.setColor(255, 155 - 85 * n3 / 185, 70 * n3 / 185);
                    am.fillRect(n4 + n3, n5, 5, 18);
                }
                am.fillRect(n4 + n3, n5, 185 - n3, 18);
                am.fillRect(n4 += 185, n5 + 6, 1, 12);
                am.fillRect(n4 + 1, n5 + 12, 1, 6);
                cW.b((au & 8L) != 0L ? 0 : 1);
            } else if (!aT && Y == 1 && n == 2) {
                cW.b(1);
            } else {
                cW.b(0);
            }
            if (!ac && Y == 1 && n == 1) {
                cW.b(2);
            }
            if (Y == 2) {
                String string = "";
                if (n == 0) {
                    string = d.m(21 + L);
                } else if (n == 1) {
                    string = d.m(13 - ah);
                } else if (n == 2) {
                    string = d.m(26 - cH);
                }
                cW.a(am, d.m(gB + n) + string, 34 + n2 * 3, 149 + n2 * 22, 20);
                continue;
            }
            cW.b(am, gB + n, 34 + n2 * 3, 149 + n2 * 22, 20);
        }
        if (Y != 1) {
            cW.b(0);
            cW.b(am, 27, 237, 320, 40);
        }
        cW.b(0);
        cW.b(am, 28, 3, 320, 36);
        if (!aT && Y == 1) {
            am.setClip(0, 192, 38, 16);
            d.al();
            if (aX && (au & 8L) != 0L) {
                gy.a(am, 4, 38, 193, 0, 0, 0);
            }
        }
        dc = 2;
    }

    private static void an() {
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 0, 240, 320);
        switch (Y) {
            case 0: {
                Z = 0;
                Y = 1;
                ab = d.m(11);
                return;
            }
            case 1: {
                String string = mygame.a.getAppProperty("MIDlet-Version");
                if (T == 13) {
                    int n = 62 + Z * 10;
                    int n2 = Math.min(n + 10, 145);
                    cX.b(1);
                    for (int i = n; i < n2; ++i) {
                        cX.b(1);
                        if (i == 64) {
                            cX.a(am, d.m(64) + " " + string, 120, (i - n + 2) * 22, 17);
                            continue;
                        }
                        cX.b(am, i, 120, (i - n + 2) * 22, 17);
                    }
                    cW.b(0);
                    if (aa) {
                        cW.b(am, 29, 1, 319, 36);
                    } else {
                        cW.b(am, 27, 239, 319, 40);
                    }
                } else if (W == 7) {
                    int n = cX.c();
                    cX.c(4);
                    int n3 = 19 + Z * 2;
                    cX.b(3);
                    cX.b(am, n3, 120, 40, 3);
                    cX.b(1);
                    cX.b(am, n3 + 1, 120, 180, 3);
                    cX.c(n);
                    cX.b(1);
                    cX.b(am, 36, 239, 320, 40);
                } else {
                    int n = 145 + Z * 2;
                    cW.b(1);
                    cW.b(am, n, 120, 40, 3);
                    cW.b(0);
                    cW.b(am, n + 1, 120, 180, 3);
                    cW.b(0);
                    cW.b(am, 27, 239, 319, 40);
                }
                if (an[3] < 0) {
                    if (--Z < 0) {
                        Z = 0;
                    }
                } else if (an[9] < 0) {
                    if (T == 13 && Z + 1 < 9 || T == 12 && Z + 1 < 4) {
                        ++Z;
                    } else {
                        if (T == 13) {
                            Z = 8;
                        }
                        if (T == 12) {
                            Z = 3;
                        }
                    }
                } else if (aa && an[14] < 0 || !aa && an[13] < 0) {
                    Y = (byte)5;
                }
                if (Z != 0) {
                    d.a(120, 20 - az % 6 / 2, false, -13, 0xFFFFFF, 0xFF0000);
                }
                if (T == 13 && Z < 8 || T == 12 && Z < 3) {
                    d.a(120, 300 + az % 6 / 2, false, 13, 0xFFFFFF, 0xFF0000);
                }
                ++az;
                return;
            }
            case 5: {
                if (W == 7) {
                    dc |= 0xFF;
                    bQ = true;
                    d.u(9);
                    Z = 4;
                    Y = 1;
                    ab = d.m(11);
                    return;
                }
                if (aa) {
                    d.h();
                    System.gc();
                    if (aT) {
                        aa = false;
                        d.t(5);
                        return;
                    }
                    d.t(15);
                    return;
                }
                X = T == 13 ? 5 : 4;
                d.t(5);
            }
        }
    }

    public static final void a(boolean bl) {
        String string;
        int n;
        if (aJ == null) {
            aJ = new String[13];
        }
        for (n = 0; n < 13; ++n) {
            d.aJ[n] = mygame.a.getAppProperty(d.m(35 + n));
            if (aJ[n] != null && aJ[n].trim().length() != 0) continue;
            d.aJ[n] = null;
        }
        if (!bl) {
            aK = new byte[8];
            aM = new byte[4];
            aO = new byte[4];
        }
        aL = 0;
        aN = 0;
        aP = 0;
        for (n = 0; n <= 2; ++n) {
            string = aJ[n] == null ? null : aJ[n].trim().toUpperCase();
            if (string == null || string.compareTo(aW) != 0) {
                if (!bl) {
                    d.aK[d.aL] = (byte)n;
                }
                aL = (byte)(aL + 1);
            }
            if (string == null || string.compareTo(aV) != 0) continue;
            d.aJ[n] = null;
        }
        for (n = 0; n < 4; ++n) {
            if (aJ[5 + n] == null) continue;
            string = aJ[5 + n].trim().toUpperCase();
            if (string.compareTo(aW) == 0 || string.compareTo(aV) == 0) {
                d.aJ[5 + n] = null;
            }
            if (string.compareTo(aW) == 0) continue;
            if (!bl) {
                d.aM[d.aN] = (byte)n;
            }
            aN = (byte)(aN + 1);
        }
        if (aN > 0) {
            if (!bl) {
                d.aK[d.aL] = 3;
            }
            aL = (byte)(aL + 1);
        }
        for (n = 0; n < 4; ++n) {
            if (aJ[9 + n] == null) continue;
            string = aJ[9 + n].trim().toUpperCase();
            if (string.compareTo(aW) == 0 || string.compareTo(aV) == 0) {
                d.aJ[9 + n] = null;
            }
            if (string.compareTo(aW) == 0) continue;
            if (!bl) {
                d.aO[d.aP] = (byte)n;
            }
            aP = (byte)(aP + 1);
        }
        if (aP > 0) {
            if (!bl) {
                d.aK[d.aL] = 4;
            }
            aL = (byte)(aL + 1);
        }
        if (aJ[3] != null && (string = aJ[3].trim().toUpperCase()).compareTo(aW) != 0 && string.compareTo(aV) != 0) {
            if (!bl) {
                d.aK[d.aL] = 5;
            }
            aL = (byte)(aL + 1);
        }
        if (aU) {
            if (!bl) {
                d.aK[d.aL] = 7;
            }
            aL = (byte)(aL + 1);
        } else {
            string = aJ[4] != null ? aJ[4].trim().toUpperCase() : null;
            if (string == null || string.compareTo(aW) != 0) {
                if (!bl) {
                    d.aK[d.aL] = 6;
                }
                aL = (byte)(aL + 1);
            }
            if (string == null || string.compareTo(aV) == 0) {
                d.aJ[4] = null;
            }
        }
        if (aL == 0) {
            aT = true;
            return;
        }
        aT = false;
    }

    public static final void s() {
        d.a(true);
        aJ = null;
        aK = null;
        aM = null;
        aO = null;
    }

    public static final void t() {
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 0, 240, 320);
        if (aa) {
            cW.b(0);
            cW.b(am, 153, 120, 106, 3);
            cW.b(am, 154, 120, 160, 3);
            cW.a(am, 0, 120, 213, 3, 240, true);
        } else {
            cW.b(0);
            cW.a(am, " ", 120, 160, 3, 240, true);
            cW.b(am, 0, 120, 162, 3);
        }
        if (Y == 1) {
            aX = false;
            d.h(true);
        } else if (Y == 2) {
            d.a("/c");
        } else if (Y == 3) {
            if (cX == null) {
                byte[] byArray = d.b(0);
                cX = new a();
                cX.a(byArray, 0);
                System.gc();
            }
            cX.c(1);
            cX.d(-4);
            cX.b(1);
            d.a();
        } else if (Y == 4) {
            d.a("/d");
            byte[] byArray = d.b(2);
            gy = new a();
            gy.a(byArray, 0);
            d.a();
            gy.a(0, 0, -1, -1);
            gy.a();
        } else if (Y == 5) {
            d.a("/q");
            aA = d.c(0);
            if (aU) {
                aB = d.c(13);
                aC = d.c(14);
            }
            aG = new byte[4][];
            aD = new Image[4];
        } else if (Y >= 6 && Y <= 9) {
            d.aG[d.Y - 6] = d.b(Y - 6 + 1);
        } else if (Y == 10) {
            aH = new byte[4][];
            aE = new Image[4];
            for (int i = 0; i < 4; ++i) {
                d.aH[i] = d.b(5 + i);
            }
        } else if (Y == 11) {
            aI = new byte[4][];
            aF = new Image[4];
            for (int i = 0; i < 4; ++i) {
                d.aI[i] = d.b(9 + i);
            }
            d.a();
        } else if (Y == 12) {
            d.a(false);
            aQ = 0;
            System.gc();
            d.t(14);
            Y = aK[aQ];
            aa = false;
        }
        if (T == 15) {
            Y = (byte)(Y + 1);
        }
    }

    public static final void b(boolean bl) {
        am.setClip(0, 0, 240, 320);
        if (bl) {
            gy.a(am, 6, 2, 320 - d.gy.f[6] - 2, 0);
        }
        gy.a(am, 5, 240 - d.gy.e[5] - 2, 320 - d.gy.f[5] - 2, 0);
    }

    public static final void d(int n, int n2) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i = 0; i < 34; ++i) {
            int n3 = i < 17 ? 17 - i : i - 17;
            n3 = (n3 << 8) / 17;
            int n4 = d.a(n, n2, n3);
            am.setColor(n4);
            d.b(0, i * 9, 240, 9);
        }
        am.setColor(n);
        d.b(0, 306, 240, 14);
    }

    public static final void a(boolean bl, boolean bl2) {
        int n = (int)(au >> 1 & 3L);
        boolean bl3 = false;
        boolean bl4 = false;
        if (Y == 7) {
            gy.a(am, 0, 4 - n, 192, 0, 0, 0);
            gy.a(am, 1, 235 + n, 192, 0, 0, 0);
            return;
        }
        gy.a(am, 0, 4 - n, 145, 0, 0, 0);
        gy.a(am, 1, 235 + n, 145, 0, 0, 0);
    }

    public static final void a(int n, int n2, int n3, int n4) {
        if ((au & 0xFL) < 7L) {
            return;
        }
        String string = d.m(n);
        cX.a(string, 240, 0, 50);
        int n5 = a.B + 10;
        int n6 = a.C + 10;
        if ((n4 & 1) != 0) {
            n2 -= n5 >> 1;
        } else if ((n4 & 8) != 0) {
            n2 -= n5;
        }
        if ((n4 & 2) != 0) {
            n3 -= n6 >> 1;
        } else if ((n4 & 0x20) != 0) {
            n3 -= n6;
        }
        am.setColor(0xFF0000);
        d.b(n2, n3, n5, n6);
        cX.a(am, string, n2 + (n5 >> 1), n3 + (n6 >> 1), 3);
    }

    public static final void a(int n, boolean bl) {
        d.d(0, 136);
        am.drawImage(aD[n], 120, 20, 17);
        cX.a(am, 48 + n, 120, 281, 3, 240 - d.gy.e[6] - d.gy.e[5], false);
        d.b(bl);
    }

    public static final void c(boolean bl) {
        d.d(0, 9044224);
        am.drawImage(aD[3], 120, 20, 17);
        cX.a(am, 31, 120, 160, 3, 200, false);
        d.b(bl);
    }

    public static final void d(boolean bl) {
        d.d(0, 136);
        am.drawImage(aA, 120, 20, 17);
        cW.b(3);
        cW.b(am, 34, 120, aA.getHeight() + 40 - 15, 17);
        cW.b(0);
        cX.b(1);
        cX.a(am, 32, 120, 145, 3, 196, false);
        d.b(bl);
    }

    public static final void e(boolean bl) {
        d.d(0, 0);
        am.drawImage(aB, 120, 8, 17);
        am.drawImage(aC, 180, 240, 3);
        cX.b(1);
        cX.a(am, 61, 120, 100, 3, 200, false);
        d.b(bl);
    }

    public static final void u() {
        int n;
        d.d(0, 136);
        am.drawImage(aA, 120, 20, 17);
        int n2 = 20 + aA.getHeight() + cW.c();
        cW.b(3);
        cW.b(am, Y == 3 ? 51 : 56, 120, n2, 17);
        int n3 = d.cW.f[0] + cW.c();
        n2 += n3;
        int n4 = Y == 3 ? aN : aP;
        byte[] byArray = Y == 3 ? aM : aO;
        n2 += (320 - n2) / 2 - 64;
        aS = n2;
        cW.b(0);
        cX.b(1);
        Image[] imageArray = Y == 3 ? aE : aF;
        n2 -= 40;
        n2 += 14;
        int n5 = Y == 3 ? 52 : 57;
        for (n = 0; n < n4; ++n) {
            am.drawImage(imageArray[byArray[n]], 36, n2, 6);
            cX.a(am, n5 + byArray[n], 53, n2 + 1, 6, 151, false);
            n2 += 29;
            n2 += 4;
        }
        n = 0;
        if (Y == 3) {
            if (aJ[5 + aM[aR]] != null) {
                n = 1;
            }
        } else if (Y == 4 && aJ[9 + aO[aR]] != null) {
            n = 1;
        }
        d.b(n != 0);
        am.setColor(0xFF0000);
        n2 = aS + 33 * aR;
        am.drawRect(33, n2 -= 40, 174, 29);
        am.drawRect(32, n2 - 1, 176, 31);
    }

    static final void c(String string) {
        try {
            mygame.a.platformRequest(string);
            d.t(-1);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static final void a(Image[] imageArray, byte[][] byArray, int n) {
        for (int i = 0; i < imageArray.length; ++i) {
            if (i == n || n == -2) {
                if (imageArray[i] != null) continue;
                imageArray[i] = Image.createImage((byte[])byArray[i], (int)0, (int)byArray[i].length);
                System.gc();
                continue;
            }
            if (imageArray[i] == null) continue;
            imageArray[i] = null;
            System.gc();
        }
    }

    static final void v() {
        boolean bl;
        boolean bl2 = an[5] < 0 || an[5] < 0;
        boolean bl3 = an[7] < 0 || an[7] < 0;
        boolean bl4 = an[3] < 0 || an[3] < 0;
        boolean bl5 = bl = an[9] < 0 || an[9] < 0;
        if (Y >= 0 && Y <= 2) {
            d.a(aD, aG, (int)Y);
        } else if (Y == 5) {
            d.a(aD, aG, 3);
        } else {
            d.a(aD, aG, -1);
        }
        if (Y == 3) {
            d.a(aE, aH, -2);
        } else {
            d.a(aE, aH, -1);
        }
        if (Y == 4) {
            d.a(aF, aI, -2);
        } else {
            d.a(aF, aI, -1);
        }
        if (Y == 3 || Y == 4) {
            d.u();
        } else if (Y == 5) {
            d.c(aJ[3] != null);
            if (aJ[3] != null) {
                d.a(33, 120, 310, 33);
            }
        } else if (Y == 6) {
            d.d(aJ[4] != null);
            if (aJ[4] != null) {
                d.a(33, 120, 310, 33);
            }
        } else if (Y == 7) {
            d.e(aJ[4] != null);
            if (aJ[4] != null) {
                d.a(33, 120, 192, 33);
            }
        } else {
            d.a((int)Y, aJ[Y] != null);
            if (aJ[Y] != null) {
                d.a(30, 120, 145, 3);
            }
        }
        if (aL > 1) {
            d.a(bl2, bl3);
        }
        if (bl2) {
            if (--aQ < 0) {
                aQ = aL - 1;
            }
            Y = aK[aQ];
            aR = 0;
        }
        if (bl3) {
            if (++aQ >= aL) {
                aQ = 0;
            }
            Y = aK[aQ];
            aR = 0;
        }
        if (Y == 3 || Y == 4) {
            if (bl) {
                byte by;
                byte by2 = by = Y == 3 ? aN : aP;
                if (++aR >= by) {
                    aR = by - 1;
                }
            }
            if (bl4 && --aR < 0) {
                aR = 0;
            }
        }
        if (an[14] < 0 || an[6] < 0) {
            String string = null;
            if (Y >= 0 && Y <= 2) {
                string = aJ[Y];
            } else if (Y == 5) {
                string = aJ[3];
            } else if (Y == 6) {
                string = aJ[4];
            } else if (Y == 7) {
                string = aJ[4];
            } else if (Y == 3) {
                string = aJ[5 + aM[aR]];
            } else if (Y == 4) {
                string = aJ[9 + aO[aR]];
            }
            if (string != null) {
                d.c(string);
            }
        }
        if (an[13] < 0) {
            gy = null;
            aD = null;
            aG = null;
            aJ = null;
            aA = null;
            if (aU) {
                aB = null;
                aC = null;
            }
            aF = null;
            aE = null;
            aI = null;
            aH = null;
            aK = null;
            aM = null;
            aO = null;
            System.gc();
            X = 2;
            d.t(5);
            d.h();
        }
    }

    public static final void b(int n, int n2, int n3, int n4) {
        am.fillRect(n, n2, n3, n4);
    }

    private static void ao() {
        if (Z == 0) {
            fF.setColor(0);
            fF.setClip(0, 0, 240, 320);
            fF.fillRect(0, 0, 240, 320);
            bw = 0;
            if (cX != null) {
                cX.b(1);
                cX.b(fF, 0, 237, 299, 40);
            }
            bv = ed ? 2 : (cj == -1 ? 0 : 1);
            if (ed) {
                bs = 0;
            } else if (cg != -1) {
                dd = false;
            }
            boolean bl = bO = !ed && cg == -1;
            if (X == 2 || ed || cg != -1) {
                d.as();
                d.h();
                Z = 0;
            } else {
                Z = 31;
            }
        }
        int n = X == 2 ? Z * 240 / 36 : (ed || cg != -1 ? Z * 240 / 98 : (Z - 31) * 240 / 67);
        d.x(n);
        if (Z == 0) {
            d.V();
            d.bl();
            cd = null;
            ce = null;
            cp = null;
            cq = null;
            cr = null;
            fY = null;
        } else if (Z == 1) {
            int n2;
            d.bx();
            for (n2 = 0; n2 < 64; ++n2) {
                d.ha[n2] = null;
            }
            for (n2 = 0; n2 < 5; ++n2) {
                d.ff[n2] = null;
            }
            hk = null;
            fl = null;
            dr = null;
            dp = null;
            fy = null;
            d.X();
            d.W();
            b.A();
            d.aT();
        } else if (Z >= 2 && Z < 30) {
            Y = (byte)(Z - 2);
            if (cg == -1 || bq[Y]) {
                d.bB[d.Y] = null;
            }
        } else if (Z == 30) {
            gN = null;
            gO = null;
            cU = null;
            cV = null;
            bk = null;
            bl = null;
            aY = null;
            aZ = null;
            ba = null;
            bb = null;
            bc = null;
            bd = null;
            be = null;
            bf = null;
            bg = null;
            bh = null;
            bi = null;
            bj = null;
            dL = null;
            dM = null;
            dN = null;
            dO = null;
            b.p = null;
            b.q = null;
            System.gc();
            bm = null;
            d.h();
            for (int i = 1; i < 24; ++i) {
                d.q(i);
            }
            if (X == 2) {
                System.gc();
                Z = 0;
                cg = (byte)-1;
                d.t(X);
                X = -1;
                return;
            }
        } else if (Z == 31) {
            if (cf == 0) {
                d.l(0);
            } else {
                d.l(1);
            }
            d.a("/p");
            byte[] byArray = d.b(0);
            d.bB[26] = new a();
            bB[26].a(byArray, 0);
            byArray = d.b(1);
            d.bB[27] = new a();
            bB[27].a(byArray, 0);
            bx = d.h(2)[bv];
            d.a();
            d.ap();
            if (cX != null) {
                cX.b(1);
                cX.b(fF, 0, 237, 299, 40);
            }
            bx = null;
            d.bB[26] = null;
            d.bB[27] = null;
            System.gc();
            fG = -1;
            fH = -1;
            d.bw();
            d.bt();
            b.I = 0;
            b.H = false;
            bC = new int[240];
        } else if (Z == 32) {
            d.a("/e");
            bm = d.d(10);
            d.a();
        } else if (Z == 33) {
            if (cf == 0) {
                d.a("/g");
            } else {
                d.a("/r");
            }
            d.N(bm[cf * 11 + 2]);
            d.a();
        } else if (Z == 34) {
            if (cf == 0) {
                d.a("/h");
            } else {
                d.a("/s");
            }
            d.P(bm[cf * 11 + 0]);
        } else if (Z == 35) {
            d.O(bm[cf * 11 + 1]);
            d.a();
        } else if (Z == 36) {
            d.a("/e");
            dr = d.d(15 + cf);
            dp = d.e(17);
            d.a();
            gH = 0;
            d.ar();
        } else if (Z >= 37 && Z < 65) {
            Y = (byte)(Z + gH - 37);
            boolean bl = false;
            if (Y == 0) {
                bl = true;
            }
            if (bo[Y] == -1) {
                Y = (byte)(Y + 1);
                ++gH;
                bl = true;
            }
            if (bl) {
                d.a();
                d.a(bn[gH]);
            }
            if (bq[Y - gH]) {
                byte[] byArray = d.b(bo[Y]);
                d.bB[d.Y - d.gH] = new a();
                d.bB[d.Y - d.gH].I = by[Y - gH];
                bB[Y - gH].a(byArray, 0);
                int n3 = Y - gH;
                if (n3 != 10 && n3 != 11 && n3 != 12 && n3 != 9 && n3 != 8 && n3 != 3 && n3 != 4 && n3 != 5 && n3 != 6 && n3 != 7 && n3 != 18 && n3 != 16 && n3 != 14 && n3 != 21 && n3 != 19 && n3 != 23 && n3 != 2 && n3 != 25) {
                    bB[n3].a(0, 0, -1, -1);
                    if (by[n3]) {
                        bB[n3].a(1, 0, -1, -1);
                    }
                    if (n3 != 20) {
                        bB[n3].a();
                    }
                }
            }
        } else if (Z >= 65 && Z < 93) {
            Y = (byte)(Z - 65);
        } else if (Z == 93) {
            for (int i = 1; i < 24; ++i) {
                if (cf == 0 && i == 2 || cf == 1 && i == 1) continue;
                d.p(i);
            }
            d.a();
        } else if (Z == 94) {
            fG = -1;
            fH = -1;
            d.a("/c");
            byte[] byArray = d.b(2);
            cV = new a();
            cV.a(byArray, 0);
            cX.b(1);
            gN = new c(bB[0], 0, 0);
            gO = new c(bB[14], 0, 0);
            cU = new c(bB[1], 0, 0);
            cU.a(1);
        } else if (Z == 95) {
            d.a("/e");
            eJ = bm[cf * 11 + 4];
            if (eJ >= 0) {
                dL = d.g(3 + eJ);
                dM = d.g(5 + eJ);
                dN = d.g(7 + eJ);
            }
            dO = d.g(9);
            bk = d.f(11);
            bl = d.f(12);
            b.p = d.g(13);
            b.q = d.g(14);
            d.a();
            d.U();
            d.U(bm[cf * 11 + 3]);
            cs.a((byte)1, -1, -1, null, -1, (byte)-1, 0);
        } else if (Z == 96) {
            if (aY != null) {
                d.aq();
            }
        } else if (Z == 97) {
            b.z();
        } else if (Z == 98) {
            d.i(!ed && cg == -1);
            d.bB[26] = null;
            d.bB[27] = null;
            if (dq[0] == 0) {
                d.F();
            }
            if (dD[0] == 0) {
                d.K();
            }
            d.av();
            bK = 0;
            d.r();
            d.t(7);
            dc = 255;
            bP = true;
            gj = System.currentTimeMillis();
            bZ = false;
            if (X != 2) {
                bN = System.currentTimeMillis();
            }
            if (!ed) {
                bz = true;
            }
            d.h();
        }
        ++Z;
        System.gc();
    }

    private static void ap() {
        int n = bv;
        boolean bl = false;
        int[] nArray = bx;
        fF.setClip(0, 0, 240, 320);
        int n2 = 0;
        while (n2 < nArray.length) {
            int n3;
            int n4;
            int n5;
            if (nArray[n2] == 5) {
                bw = nArray[n2 + 1];
                n2 += 2;
                continue;
            }
            if (nArray[n2] == 0) {
                fF.setColor(nArray[n2 + 1]);
                fF.fillRect(nArray[n2 + 2], nArray[n2 + 3], nArray[n2 + 4], nArray[n2 + 5]);
                n2 += 6;
                continue;
            }
            if (nArray[n2] == 4) {
                n5 = nArray[n2 + 1];
                n4 = nArray[n2 + 2];
                n3 = nArray[n2 + 4];
                for (int i = 0; i < n3; ++i) {
                    int n6 = 0;
                    for (int j = 0; j < 3; ++j) {
                        int n7 = ((n5 & 255 << 8 * j) * (n3 - i) + (n4 & 255 << 8 * j) * i) / n3 >> 8 * j;
                        if (n7 > 255) {
                            n7 = 255;
                        }
                        n6 += (n7 & 0xFF) << 8 * j;
                    }
                    fF.setColor(n6);
                    fF.drawLine(0, nArray[n2 + 3] + i, 240, nArray[n2 + 3] + i);
                }
                n2 += 5;
                continue;
            }
            if (nArray[n2] == 1) {
                cX.b(nArray[n2 + 2]);
                cX.a(fF, nArray[n2 + 1], nArray[n2 + 3], nArray[n2 + 4], nArray[n2 + 6], nArray[n2 + 5], false);
                n2 += 7;
                continue;
            }
            if (nArray[n2] == 2) {
                n5 = nArray[n2 + 1];
                n4 = nArray[n2 + 2];
                if (n5 < 0) {
                    n5 = bt[bs][cj * 3];
                    n4 += bt[bs][cj * 3 + 1] * 16;
                }
                if (bB[n5] != null) {
                    if (n5 == 26) {
                        bB[n5].b(n);
                    }
                    if (nArray[n2 + 1] < 0 && cl > 0) {
                        bB[n5].b(cl);
                    }
                    bB[n5].a(fF, n4, 0, nArray[n2 + 3], nArray[n2 + 4], 0, 0, 0);
                    if (cj == 0 && nArray[n2 + 1] < 0) {
                        bB[n5].b(0);
                        if (bB[23] != null) {
                            bB[23].a(fF, n4 + 16, 0, nArray[n2 + 3], nArray[n2 + 4], 0, 0, 0);
                        }
                    }
                }
                n2 += 5;
                continue;
            }
            if (nArray[n2] == 3) {
                for (n4 = 0; n4 < 2; ++n4) {
                    n5 = n4 == 0 ? 1 : 0;
                    for (n3 = 0; n3 < 240; n3 += 8) {
                        fF.setColor(n5 != 0 ? 0xFFFFFF : 0);
                        fF.fillRect(n3, nArray[n2 + 1] + n4 * 8, 8, 8);
                        n5 = n5 == 0 ? 1 : 0;
                    }
                }
                n2 += 2;
                continue;
            }
            ++n2;
        }
        if (cX != null) {
            cX.b(1);
            cX.b(fF, 0, 237, 299, 40);
        }
    }

    public static final void x(int n) {
        am.setClip(0, 0, 240, 320);
        am.drawImage(ho, 0, 0, 20);
        am.setColor(0);
        am.fillRect(0, 300, 240, 6);
        am.setColor(0xFF0000);
        am.fillRect(0, 300, n, 6);
        if (T == 6 && Z >= 31) {
            am.setColor(bw);
        } else {
            am.setColor(0);
        }
        am.fillRect(0, 306, 240, 14);
    }

    private static void U(int n) {
        byte[] byArray;
        short[][][] sArrayArray = new short[12][][];
        int[] nArray = new int[]{-1, -1, 3, 5, 5, 4, 3, 6, 6, 5, 4, 3};
        short[] sArray = new short[11];
        short[] sArray2 = null;
        try {
            if (cf == 0) {
                d.a("/f");
            } else {
                d.a("/u");
            }
            byArray = d.b(n);
            d.a();
        }
        catch (Exception exception) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        while (n2 < byArray.length) {
            short s;
            int n4 = byArray[n2++];
            for (int i = 0; i < n4; i += s) {
                short s2 = (short)(byArray[n2++] & 0xFF);
                s = (short)(byArray[n2++] & 0xFF);
                int n5 = byArray[n2++] & 0xFF;
                if (s2 == 0) {
                    if (aY == null) {
                        aY = new int[fB][];
                    }
                } else if (s2 == 1) {
                    if (aZ == null) {
                        aZ = new int[fC][];
                    }
                    d.aZ[n3] = new int[s * 5];
                } else {
                    if (sArrayArray[s2] == null) {
                        sArrayArray[s2] = new short[fC][];
                    }
                    sArrayArray[s2][n3] = new short[s * nArray[s2]];
                    sArray2 = sArrayArray[s2][n3];
                }
                block12: for (short s3 = 0; s3 < s; s3 = (short)(s3 + 1)) {
                    int n6;
                    for (n6 = 0; n6 < n5; n6 = (short)(n6 + 1)) {
                        sArray[n6] = (short)(byArray[n2++] & 0xFF | (byArray[n2++] & 0xFF) << 8);
                    }
                    if (s2 == 0) {
                        for (int j = 0; j < fB; ++j) {
                            if ((fy[j] & 0x1F) != n3) continue;
                            if (aY[j] == null) {
                                d.aY[j] = new int[s * 7];
                            }
                            if (aY[j][s3 * 7] != 0) continue;
                            d.aY[j][s3 * 7 + 0] = sArray[0] + d.Q(j);
                            d.aY[j][s3 * 7 + 1] = sArray[1] + d.R(j);
                            d.aY[j][s3 * 7 + 3] = (sArray[3] + 128 & 0xFF) << 24 | (sArray[2] + 128 & 0xFF) << 16 | (sArray[5] + 128 & 0xFF) << 8 | sArray[4] + 128 & 0xFF;
                            d.aY[j][s3 * 7 + 4] = (sArray[6] + 128 & 0xFF) << 24 | (sArray[7] + 128 & 0xFF) << 16 | (sArray[8] + 128 & 0xFF) << 8 | sArray[9] + 128 & 0xFF;
                            d.aY[j][s3 * 7 + 2] = sArray[10] & 0xFF;
                            d.aY[j][s3 * 7 + 5] = -1;
                            d.aY[j][s3 * 7 + 6] = -1;
                        }
                        continue;
                    }
                    if (s2 == 1) {
                        d.aZ[n3][s3 * 5 + 0] = sArray[0] + d.Q(sArray[5]);
                        d.aZ[n3][s3 * 5 + 1] = sArray[1] + d.R(sArray[5]);
                        d.aZ[n3][s3 * 5 + 2] = sArray[2] & 0xFF | sArray[3] << 8 | sArray[4] << 16;
                        d.aZ[n3][s3 * 5 + 3] = 0;
                        d.aZ[n3][s3 * 5 + 4] = sArray[6] & 0xFFFF | sArray[7] << 16;
                        continue;
                    }
                    sArray2[s3 * nArray[s2]] = sArray[0];
                    sArray2[s3 * nArray[s2] + 1] = sArray[1];
                    switch (s2) {
                        case 2: 
                        case 3: 
                        case 5: 
                        case 9: 
                        case 11: {
                            for (n6 = 2; n6 < n5; n6 = (int)((short)(n6 + 1))) {
                                sArray2[s3 * nArray[s2] + n6] = sArray[n6];
                            }
                            continue block12;
                        }
                        case 4: {
                            sArray2[s3 * 5 + 2] = sArray[2];
                            sArray2[s3 * 5 + 3] = sArray[3];
                            sArray2[s3 * 5 + 4] = sArray[4];
                            continue block12;
                        }
                        case 6: {
                            sArray2[s3 * 3 + 2] = (short)(sArray[2] & 0xFF | sArray[3] << 8);
                            continue block12;
                        }
                        case 7: {
                            sArray2[s3 * 6 + 2] = sArray[2];
                            sArray2[s3 * 6 + 3] = -1;
                            continue block12;
                        }
                        case 8: {
                            sArray2[s3 * 6 + 2] = sArray[2];
                            sArray2[s3 * 6 + 3] = (short)(sArray[3] | sArray[4] << 8);
                            sArray2[s3 * 6 + 4] = (short)(sArray[5] & 0xFF | sArray[6] << 8);
                            sArray2[s3 * 6 + 5] = (short)(sArray[7] | sArray[8] << 8);
                            continue block12;
                        }
                        case 10: {
                            sArray2[s3 * 4 + 2] = (short)(sArray[2] | sArray[3] << 8);
                            sArray2[s3 * 4 + 3] = sArray[4];
                        }
                    }
                }
            }
            ++n3;
        }
        ba = sArrayArray[2];
        bb = sArrayArray[3];
        bc = sArrayArray[4];
        bd = sArrayArray[5];
        be = sArrayArray[6];
        bf = sArrayArray[7];
        bg = sArrayArray[8];
        bh = sArrayArray[9];
        bi = sArrayArray[10];
        bj = sArrayArray[11];
        System.gc();
    }

    private static void aq() {
        int n;
        int n2;
        boolean bl = false;
        for (n2 = 0; n2 < aY.length; ++n2) {
            if (aY[n2] == null) continue;
            for (n = 0; n < aY[n2].length; n += 7) {
                short s = d.g(n2, n, 0);
                short s2 = d.g(n2, n, 1);
                d.aY[n2][n + 5] = (s & 0xFFFF) << 16 | s2 & 0xFFFF;
                s = d.g(n2, n, 2);
                s2 = d.g(n2, n, 3);
                d.aY[n2][n + 6] = (s & 0xFFFF) << 16 | s2 & 0xFFFF;
            }
        }
        for (n2 = 0; n2 < aY.length; ++n2) {
            if (aY[n2] == null) continue;
            for (n = 0; n < aY[n2].length; n += 7) {
                d.z(n2, n);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static short g(int n, int n2, int n3) {
        if ((aY[n][n2 + 2] & 1 << n3 * 2) == 0) {
            return -1;
        }
        int n4 = aY[n][n2 + 0];
        int n5 = aY[n][n2 + 1];
        int n6 = 0xFFFFFFF;
        int n7 = -1;
        byte by = (byte)n;
        block6: for (int i = 0; i < aY[n].length; i += 7) {
            if (i == n2) continue;
            switch (n3) {
                case 0: {
                    if (aY[n][i + 1] == n5 && aY[n][i + 0] >= n4) break;
                    continue block6;
                }
                case 1: {
                    if (aY[n][i + 0] == n4 && aY[n][i + 1] <= n5) break;
                    continue block6;
                }
                case 2: {
                    if (aY[n][i + 1] == n5 && aY[n][i + 0] <= n4) break;
                    continue block6;
                }
                case 3: {
                    if (aY[n][i + 0] != n4 || aY[n][i + 1] < n5) continue block6;
                }
            }
            int n8 = (aY[n][i + 0] - n4) * (aY[n][i + 0] - n4);
            if ((n8 += (aY[n][i + 1] - n5) * (aY[n][i + 1] - n5)) >= n6) continue;
            n6 = n8;
            n7 = (byte)(i / 7);
        }
        if (n7 == -1) {
            return -1;
        }
        return (short)(n7 & 0xFF | (by & 0xFF) << 8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void z(int n, int n2) {
        if (aY[n] == null) {
            return;
        }
        int[] nArray = new int[]{1, -fz, -1, fz};
        int n3 = 0;
        while (true) {
            block27: {
                if (n3 >= 4) {
                    return;
                }
                if ((aY[n][n2 + 2] & 1 << n3 * 2) == 0) break block27;
                switch (n3) {
                    case 0: {
                        if ((short)(aY[n][n2 + 5] >> 16) < 0) break;
                        break block27;
                    }
                    case 1: {
                        if ((short)aY[n][n2 + 5] < 0) break;
                        break block27;
                    }
                    case 2: {
                        if ((short)(aY[n][n2 + 6] >> 16) < 0) break;
                        break block27;
                    }
                    case 3: {
                        if ((short)aY[n][n2 + 6] >= 0) break block27;
                    }
                }
                int n4 = n + nArray[n3];
                if (n4 < 0 || n4 >= fB || aY[n4] == null) {
                    int[] nArray2 = aY[n];
                    int n5 = n2 + 2;
                    nArray2[n5] = nArray2[n5] & ~(3 << n3 * 2);
                } else if (n3 == 0 && n % fz == fz - 1 || n3 == 2 && n % fz == 0) {
                    int[] nArray3 = aY[n];
                    int n6 = n2 + 2;
                    nArray3[n6] = nArray3[n6] & ~(3 << n3 * 2);
                } else {
                    int n7 = aY[n][n2 + 0];
                    int n8 = aY[n][n2 + 1];
                    short s = (short)(n2 / 7 & 0xFF | (n & 0xFF) << 8);
                    boolean bl = false;
                    block19: for (int i = 0; !bl && i < aY[n4].length; i += 7) {
                        switch (n3) {
                            case 0: {
                                if (aY[n4][i + 1] == n8 && aY[n4][i + 0] >= n7) break;
                                continue block19;
                            }
                            case 1: {
                                if (aY[n4][i + 0] == n7 && aY[n4][i + 1] <= n8) break;
                                continue block19;
                            }
                            case 2: {
                                if (aY[n4][i + 1] == n8 && aY[n4][i + 0] <= n7) break;
                                continue block19;
                            }
                            case 3: {
                                if (aY[n4][i + 0] != n7 || aY[n4][i + 1] < n8) continue block19;
                            }
                        }
                        if ((aY[n4][i + 2] & 2 << (n3 ^ 2) * 2) == 0) continue;
                        boolean bl2 = false;
                        short s2 = (short)(i / 7 & 0xFF | (n4 & 0xFF) << 8);
                        switch (n3) {
                            case 0: {
                                d.aY[n][n2 + 5] = s2 << 16 | aY[n][n2 + 5] & 0xFFFF;
                                d.aY[n4][i + 6] = s << 16 | aY[n4][i + 6] & 0xFFFF;
                                break;
                            }
                            case 1: {
                                d.aY[n][n2 + 5] = aY[n][n2 + 5] & 0xFFFF0000 | s2;
                                int[] nArray4 = aY[n4];
                                int n9 = i + 6;
                                nArray4[n9] = nArray4[n9] & (aY[n4][i + 6] & 0xFFFF0000 | s);
                                break;
                            }
                            case 2: {
                                d.aY[n][n2 + 6] = s2 << 16 | aY[n][n2 + 6] & 0xFFFF;
                                d.aY[n4][i + 5] = s << 16 | aY[n4][i + 5] & 0xFFFF;
                                break;
                            }
                            case 3: {
                                d.aY[n][n2 + 6] = aY[n][n2 + 6] & 0xFFFF0000 | s2;
                                d.aY[n4][i + 5] = aY[n4][i + 5] & 0xFFFF0000 | s;
                                break;
                            }
                        }
                        bl = true;
                    }
                    if (!bl) {
                        int[] nArray5 = aY[n];
                        int n10 = n2 + 2;
                        nArray5[n10] = nArray5[n10] & ~(3 << n3 * 2);
                    }
                }
            }
            ++n3;
        }
    }

    private static void ar() {
        bs = ed ? 0 : 0;
        fk = bt[bs].length / 3;
        fl = bt[bs];
        int n = 0;
        if (ed) {
            block0: for (int i = 0; i < bo.length; ++i) {
                if (bo[i] == -1) {
                    ++n;
                    continue;
                }
                int n2 = i - n;
                if (bn[n] == "/k") {
                    d.bq[n2] = false;
                    for (int j = 0; j < fk * 3; j += 3) {
                        if (fl[j] != n2) continue;
                        d.bq[n2] = bB[n2] == null;
                        continue block0;
                    }
                    continue;
                }
                d.bq[n2] = br[cf][n2] == 1 && bB[n2] == null;
            }
        } else {
            block2: for (int i = 0; i < bo.length; ++i) {
                if (bo[i] == -1) {
                    ++n;
                    continue;
                }
                int n3 = i - n;
                if (bn[n] == "/k") {
                    d.bq[n3] = false;
                    for (int j = 0; j < fk * 3; j += 3) {
                        if (fl[j] != n3) continue;
                        d.bq[n3] = bB[n3] == null;
                        continue block2;
                    }
                    continue;
                }
                d.bq[n3] = bp[cf][n3] == 1 && bB[n3] == null;
            }
        }
    }

    private static void as() {
        int n;
        boolean bl = false;
        if (ed && cg == -1) {
            ed = false;
            for (n = 0; n < ek.length; ++n) {
                d.ek[n] = null;
            }
        }
        for (n = 0; n < bq.length; ++n) {
            d.bq[n] = X == 2 ? bB[n] != null : (n != 8 && n != 9 && n != 10 && n != 11 && n != 12 && n != 23 ? bB[n] != null : false);
        }
    }

    private static void at() {
        int n;
        int n2;
        int n3;
        int n4;
        boolean bl;
        int n5;
        bT = true;
        if (bO) {
            if (at < bN) {
                bN = at;
            }
            if (at - bN < 5000L) {
                am.setClip(0, 0, 240, 320);
                am.setColor(0);
                am.fillRect(0, 0, 240, 320);
                boolean bl2 = false;
                cX.b(1);
                cX.b(am, 229, 120, 160, 3);
                return;
            }
            if (bN > 0L) {
                bO = false;
                bN = 0L;
            }
        }
        if (bz) {
            bz = false;
            if (cf == 0) {
                d.r(1);
            } else {
                d.r(2);
            }
        }
        if (aa && eI == 0) {
            if (bL == 0) {
                --bL;
                bN = System.currentTimeMillis();
            } else if (bL == -1) {
                if (at < bN) {
                    bN = at;
                }
                if (at - bN < 10000L) {
                    am.setClip(0, 0, 240, 320);
                    am.setColor(0);
                    am.fillRect(0, 0, 240, 320);
                    bB[14].a(am, 5, 94, 20, 0, 0, 0);
                    bB[14].a(am, 5, 120, 20, 0, 0, 0);
                    bB[14].a(am, 5, 146, 20, 0, 0, 0);
                    cX.b(am, 235, 120, 160, 3);
                    bB[25].a(am, 6, 88, 303, 0);
                    bB[2].a(am, 0, 0, 95, 302, 0, 0, 0);
                    int n6 = (fl.length / 3 - 1) * 3;
                    short s = fl[n6];
                    short s2 = fl[n6 + 1];
                    bB[s].a(am, s2 * 16, 0, 145, 292, 0, 0, 0);
                    return;
                }
                if (bN > 0L) {
                    aa = true;
                    d.t(6);
                    X = 2;
                    bN = 0L;
                }
                return;
            }
        }
        d.ay();
        if (!bQ) {
            ++bD;
            ++bF;
            ++bE;
            d.aB();
        }
        if ((d.y(0) || d.aL()) && !bQ) {
            return;
        }
        if (bP) {
            d.r();
        }
        d.P();
        short s = d.cd.j[0];
        byte by = d.cd.i[3];
        int n7 = by == -1 ? 0 : cm[by];
        d.aw();
        bS = null;
        if (!ee) {
            if (!bQ) {
                d.bA();
            }
            bI = -fU + 0;
            bJ = -fV + 18;
        } else {
            dc |= 0xFF;
            d.a(true, 0);
            fd = null;
            if (!bQ) {
                d.R();
            }
            am.setColor(0);
            am.fillRect(0, 12, 240, 282);
            bI = -(fU + eK);
            bJ = -(fV + eL);
            d.Z();
            bS = am;
            am = fF;
        }
        if (!bQ) {
            d.bq();
            b.y();
            d.bb();
            if (ee) {
                d.S();
            } else if (!cF) {
                d.aD();
                cd.w();
                cd.a(ff[0], true, false);
            }
            if (T != 7) {
                return;
            }
            d.bo();
        }
        if (!ee) {
            if (!bQ) {
                am.translate(bU, bV);
            }
            am.setClip(0, 18, 240, 276);
            d.b(am);
            am.setClip(0, 18, 240, 276);
            d.bp();
            d.be();
        }
        for (n5 = 0; n5 < 4; ++n5) {
            bl = false;
            for (n4 = 0; n4 < n5; ++n4) {
                if (cN[n4] != cN[n5]) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            n3 = d.Q(cN[n5]);
            n2 = d.R(cN[n5]);
            d.f(cL[n5], cN[n5], n3, n2);
        }
        d.X(0);
        d.X(1);
        if ((d.cd.e & 0x100) != 0) {
            cd.g();
        }
        if (cD && !ec && dR == 8 && (gY[0] & 3) != 2 && d.cd.i[0] != 3 && aw < 10000L && bM < 20) {
            for (n5 = 0; n5 < 9; ++n5) {
                if (n5 == 4) continue;
                n = an[2 + n5] > 0 ? 0xFF0000 : 65280;
                n3 = n5 % 3 - 1;
                n2 = n5 / 3 - 1;
                d.a(n3 * 13, n2 * 13, (cd.m() >> 8) + bI, (cd.n() >> 8) + bJ, n, 22, 12, 11, n5 + 1, false);
            }
            ++bM;
        }
        if (!bQ) {
            d.bu();
            d.bv();
        }
        b.B();
        d.X(2);
        for (n5 = 0; n5 < 4; ++n5) {
            bl = false;
            for (n4 = 0; n4 < n5; ++n4) {
                if (cN[n4] != cN[n5]) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            n3 = d.Q(cN[n5]);
            n2 = d.R(cN[n5]);
            d.h(cL[n5], n3, n2);
        }
        if (!ee) {
            if (cp != null && (d.cd.e & 8) != 0) {
                ++bG;
                if (d.cd.i[3] == 5) {
                    cp.a(24, bG);
                } else if (bH) {
                    bG = Math.min(8, bG);
                    cp.a(0xFFFFFF, 8, bG);
                    bH = false;
                } else {
                    cp.a(-1, 8, bG);
                }
            } else {
                bG = 0;
            }
            if (!(cq == null || er != null && cq == er || er == null && (d.cq.e & 0x800) != 0)) {
                cq.h();
            }
        } else if (bS != null) {
            d.a(false, 0);
            am = bS;
            am.drawRegion(ho, 0, 0, eM, eN, 0, eK / 3 + 0, eL / 3 + 12, 20);
            am.drawImage(fc, eK / 3 + 0, eL / 3 + 12, 20);
            d.a(true, 0xAABBFF);
            d.m(eK / 3 + 0, eL / 3 + 12);
        }
        if ((gY[1] & 3) == 2 && !ee) {
            d.aa();
            d.d(am);
        } else {
            bZ = false;
            gi = 0;
        }
        d.ax();
        d.aP();
        if (!ee && !ec && T == 7) {
            d.H();
            d.G();
            d.J();
            if (dP < 0) {
                aw += 100L;
            }
            ax += 100L;
            if (bL > 0) {
                --bL;
                am.setClip(0, 0, 240, 320);
                am.setColor(0);
                if (aa && eI == 0) {
                    n = bL + 1;
                    am.fillRect(0, 0, 240, 36);
                    am.fillRect(0, 281, 240, 39);
                } else {
                    n = 10 - bL;
                }
                for (int i = 0; i < 320; i += n) {
                    am.drawLine(0, i, 240, i);
                }
                dc = 255;
            }
        }
        if (bP) {
            d.az();
        }
        if (!ee && !bQ) {
            am.translate(-bU, -bV);
        }
        if (cA && s != d.cd.j[0] && d.cd.j[0] <= 20 || !cA && s != d.cd.j[0] && d.cd.j[0] <= 5) {
            d.r(16);
        }
        if (by > 1 && by == d.cd.i[3] && n7 > cm[by] && (cm[by] >> 16 & 0xFFFF) == 0) {
            d.r(15);
        }
        if (!(bQ || an[14] >= 0 || !bT || ec || eI != 0 || ew != "" || cB || cE)) {
            ag = true;
            d.t(9);
            return;
        }
    }

    static final void w() {
        d.r(19);
        bK = 14;
        d.v(200);
    }

    private static void au() {
        if (bK <= 0 || cB || cE) {
            d.av();
            return;
        }
        int n = 0;
        int n2 = 0;
        n = bK / 2 % 7;
        n2 = bK / 2 % 7;
        if ((bK & 1) == 1) {
            n *= -1;
        }
        if ((bK & 2) == 2) {
            n2 *= -1;
        }
        bU = n;
        bV = n2;
    }

    private static void av() {
        bU = 0;
        bV = 0;
    }

    private static void aw() {
        if (!bQ && bK >= 0) {
            --bK;
            am.setClip(0, 0, 240, 320);
            am.setColor(0);
            am.fillRect(0, 0, 240, 320);
            d.au();
            dc = 255;
        }
        if (!ec && dP >= 0 && !ed && (em >= 0 || eI == 0 && el > 0)) {
            if (ee) {
                am.setClip(0, 12, 240, 282);
            } else {
                am.setClip(0, 30, 240, 264);
            }
        }
        if (ee && ew != "" && eI == 0) {
            if (cS > 101 || dP == 4) {
                am.setClip(0, 18, 240, 271 + cT - a.C - 4 + 1);
                return;
            }
            am.setClip(0, 18, 240, 271 + cT - a.C - 4 - 40);
            return;
        }
        am.setClip(0, 18, 240, 276);
    }

    private static void ax() {
        if (!cB && !cE) {
            for (int i = 0; i < bW * 3; i += 3) {
                bB[25].a(am, bX[i + 0], bX[i + 1], bX[i + 2], 0, 0, 0);
            }
        }
        bW = 0;
    }

    public static final void c(int n, int n2, int n3) {
        if (bW < 12) {
            d.bX[d.bW * 3 + 0] = n;
            d.bX[d.bW * 3 + 1] = n2;
            d.bX[d.bW * 3 + 2] = n3;
            ++bW;
        }
    }

    private static void ay() {
        int n = (int)(ax / 120000L) & 1;
        if (d.y(5)) {
            n = 1;
        }
        if (n == 0) {
            if (bY) {
                fG = -1;
                fH = -1;
            }
            a.H = false;
            bY = false;
            ca = -1;
            return;
        }
        if (!bY) {
            fG = -1;
            fH = -1;
        }
        a.H = true;
        bY = true;
        int n2 = (int)(ax / 1000L % 120L);
        ca = n2 / 15;
        if (ca >= 4) {
            ca = 8 - ca - 1;
        }
    }

    private static void az() {
        if (ed) {
            bP = false;
            return;
        }
        int n = 255 - bD * 20;
        if (n > 0) {
            int n2;
            for (n2 = 0; n2 < 240; ++n2) {
                d.bC[n2] = n << 24;
            }
            am.setClip(0, 0, 240, 320);
            for (n2 = 0; n2 < 320; n2 += 2) {
                am.drawRGB(bC, 0, 120, 0, n2, 120, 2, true);
                am.drawRGB(bC, 0, 120, 120, n2, 120, 2, true);
            }
            dc = 255;
            return;
        }
        bP = false;
    }

    private static void aA() {
        gJ = new boolean[11];
        for (int i = 0; i < 11; ++i) {
            d.gJ[i] = false;
        }
        gI = 0;
    }

    private static void aB() {
        if (gJ[0]) {
            am.setColor(0);
            am.fillRect(0, 80, 240, 160);
            am.setColor(0xFFFFFF);
            am.drawString("Mission unlocking", 120, 80, 17);
            am.drawString("Unlock #" + (gI + cf * 30), 120, 150, 17);
            am.drawString(d.m(236 + gI), 120, 170, 17);
            if (an[5] < 0) {
                if (--gI < 0) {
                    gI = 29;
                    return;
                }
            } else {
                if (an[7] < 0) {
                    ++gI;
                    gI %= 30;
                    return;
                }
                if (an[6] < 0) {
                    for (int i = 0; i < 60; ++i) {
                        int n = i < gI + cf * 30 ? 2 : (i == gI + cf * 30 ? 1 : 0);
                        int n2 = i / 4;
                        gY[n2] = (byte)(gY[n2] & (byte)(~(3 << i % 4 * 2)));
                        int n3 = i / 4;
                        gY[n3] = (byte)(gY[n3] | (byte)(n << i % 4 * 2));
                    }
                    d.gJ[0] = false;
                    gI = 0;
                    d.h(true);
                    return;
                }
                if (an[1] < 0) {
                    d.gJ[0] = false;
                    gI = 0;
                }
            }
            return;
        }
        block10: for (int i = 0; i < 15; ++i) {
            if (an[i] >= 0) continue;
            if (gI < cb.length) {
                if (i == cb[gI]) {
                    ++gI;
                    continue;
                }
                gI = 0;
                continue;
            }
            for (int j = 0; j < 11; ++j) {
                if (i == cc[j]) {
                    switch (j) {
                        case 0: {
                            d.gJ[j] = true;
                            gI = 0;
                            for (int k = cf * 30; k < 60; ++k) {
                                int n = (gY[k / 4] & 0xFF) >> k % 4 * 2 & 3;
                                if ((n & 1) != 1) continue;
                                gI = k - cf * 30;
                                return;
                            }
                            return;
                        }
                        case 1: 
                        case 2: 
                        case 3: 
                        case 9: {
                            boolean bl = d.gJ[j] = !gJ[j];
                            if (j != 3) break;
                            gK = 0;
                            cw = 0;
                            break;
                        }
                        case 4: {
                            for (int k = 1; k < 6; ++k) {
                                int n = k;
                                cm[n] = cm[n] + 262144;
                                int n4 = k;
                                cm[n4] = cm[n4] & 0xFFFF0000;
                                int n5 = k;
                                cm[n5] = cm[n5] + m[k];
                            }
                            cm[1] = cm[1] & 0xFFFF;
                            if (gi == 1) {
                                gj = System.currentTimeMillis();
                                gi = 0;
                                bZ = false;
                                break;
                            }
                            gj = System.currentTimeMillis();
                            gi = 1;
                            d.ab();
                            bZ = true;
                            break;
                        }
                        case 5: {
                            d.z(10000);
                            d.gJ[j] = !gJ[j];
                            break;
                        }
                        case 6: {
                            b b2 = d.M(3);
                            b2.a((byte)5, (d.cd.a >> 8) + d.a(-10, 11), (d.cd.b >> 8) + d.a(10, 20), bB[fl[fl.length - 3]], fl[fl.length - 2], (byte)1, 3, 3300, 500, 40, -1);
                            b2.i[1] = (byte)(d.a(0, 4) * 4);
                            b2.e |= 0x100000;
                            b2.i[14] = (byte)((fl.length - 3) / 3);
                            b2.e();
                            break;
                        }
                        case 7: {
                            if (dP < 0) break;
                            d.bk();
                            break;
                        }
                        case 8: {
                            if (dP < 0) break;
                            d.N();
                        }
                    }
                    gI = 0;
                    continue block10;
                }
                dc = 255;
            }
        }
    }

    public static final boolean y(int n) {
        return gJ[n];
    }

    private static void i(boolean bl) {
        cA = true;
        cB = false;
        cC = false;
        cD = true;
        cE = false;
        bE = 0;
        ce = null;
        ec = false;
        if (bl) {
            cw = 0;
            gK = 0;
            gL = 0;
        }
        if (dP >= 0 && !ed) {
            d.N();
        }
        bD = 0;
        cu = -1;
        byte by = ci;
        int n = fy[by] & 0x1F;
        int n2 = ba[n][ch * 3 + 0];
        int n3 = ba[n][ch * 3 + 1];
        short s = ba[n][ch * 3 + 2];
        n2 += d.Q(by);
        n3 += d.R(by);
        boolean bl2 = false;
        if (ch != bm[cf * 11 + 6] || ci != bm[cf * 11 + 5]) {
            ch = bm[cf * 11 + 6];
            ci = bm[cf * 11 + 5];
            bl2 = true;
        }
        if (ed) {
            int n4;
            int n5;
            d.bi();
            b b2 = ff[3];
            int n6 = -1;
            b b3 = null;
            while (b2 != null) {
                if ((b2.e & 0x800) != 0 && b2.g > n6) {
                    b3 = b2;
                    n6 = b2.g;
                }
                b2 = b2.o;
            }
            cd = d.M(3);
            s = b3.i[1];
            int n7 = Math.min(b3.j[4], b3.j[5]);
            int n8 = Math.max(b3.j[4], b3.j[5]);
            n8 = n8 * 8 / 4;
            int n9 = b.B[s * 2] > 0 ? 1 : (n5 = b.B[s * 2] == 0 ? 0 : -1);
            int n10 = b.B[s * 2 + 1] > 0 ? 1 : (b.B[s * 2 + 1] == 0 ? 0 : -1);
            n2 = b3.a + n5 * n8 >> 8;
            n3 = b3.b + n10 * n8 >> 8;
            if ((n6 + 1 & 1) != 0) {
                n2 += n10 * (n7 * 3) / 2 >> 8;
                n3 += n5 * (n7 * 3) / 2 >> 8;
            }
            cd.a((byte)3, n2, n3, bB[11], 1, (byte)1, 3, -1, -1, 40, -1);
            cd.i(s);
            for (n4 = 0; n4 < fl.length / 3; ++n4) {
                if (fl[n4 * 3] != 11 || fl[n4 * 3 + 1] != 1) continue;
                d.cd.i[14] = (byte)n4;
                break;
            }
            cA = false;
            for (n4 = 0; n4 < 4; ++n4) {
                d.ej[n4] = 0;
            }
            ei = (byte)3;
            d.ek[d.ei] = cd;
            b.r = 5;
        } else {
            if (cd == null) {
                cd = new b();
            } else {
                cd.a();
            }
            cd.a((byte)4, n2, n3, bB[2], 0, (byte)1, 2, 1792, Short.MAX_VALUE, 100, -1);
            cd.i(s);
            d.cd.j[0] = cn;
            d.cd.e &= 0xFFFFFFE7;
            d.cd.i[3] = 1;
            d.cm[1] = m[1];
            d.B();
            for (int i = 0; i < 3; ++i) {
                if (ev[i] <= 0) continue;
                d.L(ev[i]);
            }
            if (cj >= 0) {
                ce = cd;
                d.b(d.ce.i[10], d.ce.i[9]);
                cd = d.M(3);
                cd.a((byte)3, n2, n3, bB[fl[cj * 3]], fl[cj * 3 + 1], (byte)1, 3, -1, -1, 40, -1);
                cd.i(s);
                d.cd.i[14] = cj;
                d.cd.j[0] = ck;
                cd.d(0);
                d.cd.i[18] = cl;
                if (cj == 0) {
                    d.cd.e |= 0x20;
                }
                cA = false;
                d.a(cd, 1);
            }
            cj = (byte)-1;
        }
        d.P();
        if (bl2) {
            d.h(true);
        }
        fY = cd;
        d.C(d.cd.a - 30720, d.cd.b - 35328);
        for (int i = 0; i < 4; ++i) {
            d.cN[i] = -1;
            d.cM[i] = -1;
        }
        d.aC();
        d.C(d.cd.a - 30720, d.cd.b - 35328);
        fi = 4;
        fj = 3;
        hg = i[0];
        if (ed) {
            fi = 0;
            fj = 0;
            hg = 0;
        } else {
            d.br();
            d.bs();
        }
        dc = 255;
        if (bl) {
            if (eI == 0) {
                dP = -1;
                em = -1;
                ew = "";
                ex = "";
                eB = "";
                eC = "";
                ey = 0;
            }
            d.aT();
        }
    }

    public static final void z(int n) {
        cx += n;
        for (cy = 0; cy < x.length && cx > x[cy] * 10000; cy = (byte)(cy + 1)) {
        }
        cy = (byte)(cy - 1);
        if (cx > 999999999) {
            cx = 999999999;
        } else if (cx < 0) {
            d.E();
        }
        if (cx < 0) {
            cx = 0;
        }
    }

    private static void aC() {
        cI = d.q(d.cd.a, d.cd.b);
        cO = (d.cd.a >> 8) / fw * fw;
        cP = (d.cd.b >> 8) / fx * fx;
        for (int i = 0; i < 4; ++i) {
            d.cL[i] = d.q(fU + cK[i * 2] << 8, fV + cK[i * 2 + 1] << 8);
            d.cM[i] = cN[i];
            d.cN[i] = d.p(fU + cK[i * 2] << 8, fV + cK[i * 2 + 1] << 8);
            if (cM[i] == cN[i]) continue;
            boolean bl = false;
            for (int j = 0; !bl && j < 4; ++j) {
                if (cM[j] != cN[i] && (j == i || cN[j] != cN[i])) continue;
                bl = true;
            }
            if (bl) continue;
            d.B(cL[i], cN[i]);
        }
    }

    private static void aD() {
        int n;
        d.cd.a = Math.max(1, d.cd.a);
        d.cd.a = Math.min(d.cd.a, fD - 1 << 8);
        d.cd.b = Math.max(1, d.cd.b);
        d.cd.b = Math.min(d.cd.b, fE - 1 << 8);
        d.aC();
        if (d.A()) {
            return;
        }
        if (cw > 0) {
            if (gL < 0 && 100 >= -gL) {
                dc |= 0x10;
            }
            if (!bA) {
                gL += 100;
                while (gL >= 400) {
                    d.B(1);
                    gL -= 400;
                }
            }
        }
        if (cB || cE) {
            cp = null;
            cq = null;
            cd.f(0);
            d.bz();
            if (bD > 80 || bD > 1 && an[6] < 0) {
                if (cB) {
                    ch = bm[cf * 11 + 10];
                    ci = bm[cf * 11 + 9];
                } else if (cE) {
                    ch = bm[cf * 11 + 8];
                    ci = bm[cf * 11 + 7];
                }
                cn = (short)100;
                d.O();
                d.P();
                d.i(true);
                d.r(8);
                return;
            }
        } else if (cA) {
            d.aE();
            d.cd.b = Math.max(0, d.cd.b - d.cd.j[3]) + d.cd.j[3];
        } else {
            d.aG();
            cu = -1;
        }
        if (cp == null || d.cd.c != 0 || d.cd.d != 0) {
            d.bz();
        }
        if ((au & 0x1FL) == 0L && cJ != (n = d.r(d.cd.a, d.cd.b))) {
            d.a(d.m(108 + n), 0, false);
            cJ = n;
        }
        cr = null;
        if (!cB && d.cd.j[0] <= 0 && cA) {
            cd.a(7, null);
        }
    }

    private static void aE() {
        if (cD) {
            byte by = d.cd.i[3];
            if (cC && d.cd.l > o[by]) {
                d.B();
                cC = false;
                dc |= 4;
                d.cd.l = 0;
            }
            if ((d.cd.e & 8) != 0 && by == 5) {
                d.aF();
                return;
            }
            ct = d.aH();
            if (ct != -1) {
                cF = true;
                bD = 0;
            } else if (cu != -1) {
                d.a(d.m(55), 0, true);
                cQ = true;
            } else if (cu == -1 && cQ) {
                cQ = false;
                d.a("", 0, true);
            } else if (cr != null) {
                d.a(d.m(56), 0, true);
                cQ = true;
            } else if (cr == null && cQ) {
                cQ = false;
                d.a("", 0, true);
            } else if (dP == -1 && (dP = d.ba()) != -1) {
                ex = "";
                d.bh();
                d.r(7);
                d.bi();
            }
            cq = d.n(3, 7776);
            if (cr != null && cq != null && cr.b(cd) < 2 * cq.b(cd)) {
                cq = null;
            }
            if (cq != null) {
                cd.i(cq.m(), cq.n());
            }
            if (an[12] < 0 && !cC && d.C(1)) {
                return;
            }
            if (an[11] < 0 && !cC && d.C(5)) {
                return;
            }
            if ((d.cd.e & 8) != 0) {
                d.cd.e &= 0xFFFFFFE7;
                d.cd.e |= 8;
                cp = d.a(cd, 0, 18150);
                if (an[6] != 0) {
                    cd.a(4, cp);
                    if (cp != null) {
                        bE = -30;
                    }
                    if (d.cd.i[3] == 1 || d.cd.i[3] == 2) {
                        d.r(22);
                    } else {
                        d.r(23);
                    }
                }
            } else if (an[6] != 0) {
                d.cd.e &= 0xFFFFFFE7;
                d.cd.e |= 8;
                cd.e();
                bE = -30;
                d.b(d.cd.a, d.cd.b, 0, 18432, cd);
                if (d.cd.i[3] == 5) {
                    d.a(d.m(87), 0, true);
                    d.x();
                    d.an[6] = 0;
                    return;
                }
            }
            if ((cp != null || (d.cd.e & 8) != 0) && bE > 30) {
                d.bz();
                d.cd.e &= 0xFFFFFFE7;
                cp = null;
                cd.e();
            }
            if (cp != null && (d.cp.e & 0x20) == 32 && d.cp.i[0] != 5) {
                d.A(10);
            }
            if (an[1] < 0) {
                if (cu >= 0) {
                    gT = -1;
                    cG = true;
                    bD = 0;
                    dc = 983295;
                    return;
                }
                if (cq != null) {
                    cD = false;
                    cd.a(cq);
                    cp = null;
                } else if (cr != null) {
                    cu = 1;
                    gT = -1;
                    d.t(8);
                    dc = 983295;
                    return;
                }
            }
            cu = -1;
            int n = d.z();
            if (n >= 0) {
                if (n != d.cd.i[1]) {
                    gM = at;
                }
                if (cp != null && !d.a(cd, cp, n)) {
                    cp = null;
                }
                d.cd.e &= 0xFFFFFFE7;
                cd.i(n);
                cd.g(61439);
            } else if (cd.r() != 0) {
                d.bz();
                cd.f(0);
                cd.e();
                if (bE < 0) {
                    d.cd.e &= 0xFFFFFFE7;
                    d.cd.e |= 8;
                }
            } else {
                cd.e();
            }
            if (cp != null && d.cd.c == 0 && d.cd.d == 0) {
                d.e(cp);
            }
            cd.c();
            d.a(d.cd.i[10], d.cd.i[9]);
            return;
        }
        if ((d.cd.e & 0x400) != 0) {
            cd.c();
            d.a(d.cd.i[10], d.cd.i[9]);
            d.bz();
            return;
        }
        if (cq == null && cd.v()) {
            cD = true;
            d.cd.e = 2;
            cd.e();
            return;
        }
        if (cq != null && (an[1] < 0 || an[2] < 0 || an[3] < 0 || an[4] < 0 || an[5] < 0 || an[6] < 0 || an[7] < 0 || an[8] < 0 || an[9] < 0 || an[10] < 0)) {
            cD = true;
            cq.a((byte)0, (b)null);
            d.cd.e = 2;
            cd.e();
            return;
        }
        cd.c();
        d.a(d.cd.i[10], d.cd.i[9]);
        if (cq != null) {
            cd.a(1, cq);
            if (!cA) {
                if (b.r == 2 || b.r == 5 || b.r == 8) {
                    d.r(4);
                    return;
                }
                d.r(3);
            }
        }
    }

    private static void aF() {
        int n = d.z();
        if (n >= 0) {
            int n2 = n * 2;
            int n3 = b.A[n2] * 2048 * 100 / a >> 8;
            int n4 = b.A[n2 + 1] * 2048 * 100 / a >> 8;
            d.cs.a += n3;
            d.cs.b += n4;
            if (Math.abs(d.cs.a - d.cd.a) > 48896) {
                d.cs.a -= n3;
            }
            if (Math.abs(d.cs.b - d.cd.b) > 48896) {
                d.cs.b -= n4;
            }
            if (d.cs.a < 6144) {
                d.cs.a = 6144;
            }
            if (d.cs.a > fD - 24 << 8) {
                d.cs.a = fD - 24 << 8;
            }
            if (d.cs.b < 6144) {
                d.cs.b = 6144;
            }
            if (d.cs.b > fE - 24 << 8) {
                d.cs.b = fE - 24 << 8;
            }
        }
        d.cd.e &= 0xFFFFFFE7;
        d.cd.e |= 8;
        if (an[6] > 0) {
            cd.a(4, cp);
            cp = cs;
            bE = -30;
        } else {
            if (an[1] < 0) {
                d.cd.e &= 0xFFFFFFE7;
                d.e(cd);
                return;
            }
            if (an[12] < 0) {
                if (!cC) {
                    d.C(1);
                    cp = null;
                    return;
                }
            } else if (an[11] < 0 && !cC) {
                d.C(5);
                cp = null;
                return;
            }
        }
        cd.f(0);
        cd.o();
        cd.e(-1);
        cd.c();
        d.e(cs);
    }

    public static final void x() {
        d.cs.a = d.cd.a;
        d.cs.b = d.cd.b;
        d.cs.a += b.A[d.cd.i[1] * 2] * 92;
        d.cs.b += b.A[d.cd.i[1] * 2 + 1] * 92;
        cp = cs;
        cd.a(cs);
    }

    private static void aG() {
        if (cD) {
            if (dR == 40 && (d.cd.e & 0x800) != 0 && cd.c(dS, dT, dS + (dU << 8), dT + (dV << 8)) && d.bd()) {
                d.cd.e |= 4;
                d.bi();
            }
            if (dR == 32 && (d.cd.e & 0x800) != 0 && d.bd()) {
                er = null;
                d.bi();
            }
            cq = null;
            if (cC && d.cd.l > o[3]) {
                d.B();
                cC = false;
                dc |= 4;
                d.cd.l = 0;
            }
            if ((ct = d.aH()) != -1) {
                cF = true;
                bD = 0;
                b.x = (byte)-1;
                bF = 0;
            }
            if (!ed && an[1] < 0) {
                cd.a(2, null);
                if (M == 3 || M == 4) {
                    d.h();
                }
            }
            if (b.x >= 0 && bF >= 5) {
                if (d.cd.i[1] != b.x) {
                    cd.d(false);
                } else {
                    b.x = (byte)-1;
                    d.cd.i[17] = 0;
                }
            } else if (cH == 1) {
                b.t = false;
                b.w = false;
                b.v = false;
                b.u = false;
                if (an[3] != 0) {
                    b.t = true;
                    cd.b(1);
                } else if (an[9] != 0) {
                    b.w = true;
                    cd.b(-1);
                } else if (an[12] != 0) {
                    b.v = true;
                    cd.b(-1);
                    if (d.cd.h <= 0) {
                        d.cd.i[17] = 0;
                        d.cd.h = 0;
                    }
                }
                if (an[7] > 0 && an[5] == 0) {
                    if (ap == 7 && d.cd.h > 0 && Math.abs(d.cd.c) + Math.abs(d.cd.d) >= 512) {
                        b.u = true;
                        d.cd.i[1] = (byte)(d.cd.i[1] + 15);
                        d.cd.i[1] = (byte)(d.cd.i[1] & 0xF);
                        d.cd.k = 256 - d.cd.i[1] * 16 << 8;
                        d.cd.s = 1;
                    } else {
                        cd.c(1);
                    }
                } else if (an[5] > 0 && an[7] == 0) {
                    if (ap == 5 && d.cd.h > 0 && Math.abs(d.cd.c) + Math.abs(d.cd.d) >= 512) {
                        b.u = true;
                        d.cd.i[1] = (byte)(d.cd.i[1] + 1);
                        d.cd.i[1] = (byte)(d.cd.i[1] & 0xF);
                        d.cd.k = 256 - d.cd.i[1] * 16 << 8;
                        d.cd.s = 1;
                    } else {
                        cd.c(-1);
                    }
                } else if (an[5] < 0 || an[7] < 0) {
                    cd.c(0);
                }
            } else {
                int n = d.z();
                if (n >= 0) {
                    int n2 = n - d.cd.i[1];
                    if (Math.abs(n2) >= 7 && Math.abs(n2) <= 9) {
                        b.w = true;
                        cd.b(-1);
                        cd.c(0);
                        if (d.cd.h < 0 && b.x != n) {
                            cd.b(-1);
                            bF = 0;
                            b.x = (byte)n;
                        }
                    } else {
                        if (Math.abs(n2) <= (d.cd.i[1] & 1) || d.cd.i[17] <= 2) {
                            b.t = true;
                            cd.b(1);
                        }
                        if (Math.abs(n2) == 0) {
                            cd.c(0);
                        } else {
                            cd.c(Math.abs(n2) > 8 ? (n2 >= 0 ? 1 : -1) : -(n2 >= 0 ? 1 : -1));
                        }
                    }
                } else if (an[12] != 0) {
                    b.v = true;
                    cd.b(-1);
                    if (d.cd.h <= 0) {
                        d.cd.i[17] = 0;
                        d.cd.h = 0;
                    }
                } else {
                    b.t = false;
                    b.v = false;
                    b.w = false;
                    b.u = false;
                    d.bz();
                    cd.c(0);
                }
            }
            if (!ed && an[6] != 0 && (d.cd.e & 0x400) == 0) {
                cp = d.a(cd, 0, 18150);
                cd.a(4, cp);
                d.cd.e |= 8;
                bE = 0;
                if (cm[3] > 0) {
                    d.r(23);
                    return;
                }
            } else {
                if ((d.cd.e & 8) != 0) {
                    if (bE < 30) {
                        cp = d.a(cd, 0, 18150);
                        return;
                    }
                    d.cd.e &= 0xFFFFFFF7;
                    d.cd.i[5] = 0;
                    return;
                }
                cp = null;
                d.cd.i[5] = 0;
            }
        }
    }

    static final void A(int n) {
        if (d.y(3)) {
            return;
        }
        if (!cA && (d.cd.e & 0x8000) != 0 || ee) {
            return;
        }
        if (!bA) {
            return;
        }
        if (gL > 0) {
            gL = 0;
        }
        if (cw == 5) {
            return;
        }
        int n2 = cw++;
        if (n >= 9) {
            if (n == 12) {
                gL = -2000;
                cw = Math.min(cw, 4);
                dc |= 0x10;
                gK = f[cw];
                hg = i[cw];
            } else if (cw == 0) {
                cw = 1;
                gL = -2000;
                dc |= 0x10;
                gK = 140;
                d.a(d.m(54) + cw, 0, true);
                hg = i[cw];
            }
        } else if ((gK += e[n * 5 + cw]) >= f[cw]) {
            gL = -2000;
            dc |= 0x10;
            d.a(d.m(54) + ++cw, 0, true);
            hg = i[cw];
        }
        if (cw > n2) {
            d.r(10 + cw - 1);
        }
    }

    static final void B(int n) {
        gK -= n;
        int n2 = cw;
        while (cw >= 1 && gK < f[cw - 1]) {
            --cw;
        }
        if (cw <= 0) {
            gK = 0;
            cw = 0;
        }
        if (n2 != cw) {
            dc |= 0x10;
            if (cw != 0) {
                d.a(d.m(54) + cw, 0, true);
            }
        }
        hg = i[cw];
    }

    static final void y() {
        dc |= 0x10;
        if (--cw <= 0) {
            gK = 0;
            cw = 0;
        } else {
            gK = f[cw];
            d.a(d.m(54) + cw, 0, true);
        }
        hg = i[cw];
    }

    static final void e(int n, int n2) {
        String string = d.m(43 + n);
        d.r(18);
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                int n3 = 1 + (n - 0);
                int n4 = cm[n3];
                int n5 = n2;
                if (n4 == 0) {
                    n4 = n5 - 1 << 16 | m[n3];
                    if (n3 == d.cd.i[3]) {
                        cC = true;
                    }
                } else {
                    int n6 = n4 >> 16;
                    n4 &= 0xFFFF;
                    n4 += Math.min(n6 += n5, 4095) << 16;
                }
                d.cm[n3] = n4;
                if (cA && d.cd.i[3] < n3 && n3 <= 5) {
                    d.cd.i[3] = (byte)n3;
                }
                dc |= 4;
                break;
            }
            case 6: {
                d.z(n2);
                d.a(d.o(n2) + " " + d.m(49), 0, true);
                return;
            }
            case 7: {
                int n7 = d.a(0, 7);
                int n8 = d.a(1, 16);
                int n9 = n7 * 2 + 1;
                dt[n9] = (short)(dt[n9] + n8);
                break;
            }
            case 8: {
                d.y();
                break;
            }
            case 9: {
                d.cd.j[0] = (short)(d.cd.j[0] + 30);
                if (d.cd.j[0] > d.cd.j[1]) {
                    d.cd.j[0] = d.cd.j[1];
                }
                cn = d.cd.j[0];
                dc |= 2;
            }
        }
        d.a(string, 0, false);
    }

    private static int aH() {
        if (ed) {
            return -1;
        }
        if (aZ == null) {
            return -1;
        }
        int[] nArray = aZ[cI];
        if (nArray == null) {
            return -1;
        }
        for (int i = 0; i < nArray.length; i += 5) {
            if (!cd.c(nArray[i + 0] << 8, nArray[i + 1] << 8, nArray[i + 0] + (nArray[i + 4] & 0xFFFF) << 8, nArray[i + 1] + (nArray[i + 4] >>> 16) << 8)) continue;
            return i / 5;
        }
        return -1;
    }

    private static void aI() {
        d.f(132, 189);
        cX.b(1);
        if (ct != -1) {
            cX.b(am, 63 + cf, 120, 137, 17);
        } else {
            cX.b(am, 65, 120, 137, 17);
        }
        cX.b(am, 94 - Z * 2, 120, 167, 3);
        cX.b(am, 93 + Z * 2, 120, 181, 3);
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 0, 240, 36);
        am.fillRect(0, 281, 240, 39);
        d.b(36, -1, 40);
        if (an[9] < 0 || an[3] < 0) {
            Z ^= 1;
            d.an[9] = 0;
            d.an[3] = 0;
            return;
        }
        if (an[6] < 0 || an[14] < 0) {
            d.an[6] = 0;
            cF = false;
            if (Z == 0) {
                d.P();
                if (ct != -1) {
                    cd.a(8, null);
                    bY = false;
                    a.H = false;
                    return;
                }
                ed = true;
                cg = cf;
                d.t(6);
                return;
            }
            d.aJ();
            return;
        }
        if (an[13] < 0) {
            d.an[13] = 0;
            cF = false;
            d.aJ();
        }
    }

    private static void aJ() {
        if (ct != -1) {
            int n = cI;
            int n2 = ba[n][0];
            int n3 = ba[n][1];
            short s = ba[n][2];
            d.cd.a = (n2 += cO) << 8;
            d.cd.b = (n3 += cP) << 8;
            cd.f(0);
            d.cd.i[17] = 0;
            cd.i(s);
        } else {
            d.N();
            dP = -1;
            eI = 0;
            el = 0;
            d.cd.a += 18432;
        }
        d.C(d.cd.a - 30720, d.cd.b - 35328);
        dc |= 0xFF;
        d.g(cd);
    }

    private static byte aK() {
        int n = Math.min(25, cx / 100000);
        int n2 = 0;
        for (int i = 0; i < 60; ++i) {
            int n3 = (gY[i / 4] & 0xFF) >> i % 4 * 2 & 3;
            if (n3 != 2) continue;
            ++n2;
        }
        n2 *= 75;
        return (byte)(n + (n2 /= 60));
    }

    public static final int z() {
        for (int i = 0; i < an.length; ++i) {
            if (cR[i] < 0 || an[i] == 0) continue;
            d.cd.e &= 0xFFFFFBFF;
            return cR[i];
        }
        return -1;
    }

    public static final boolean A() {
        if (dP >= 0) {
            if (eI == 0 && d.bc()) {
                if (dR == 8) {
                    d.a(d.m(98), 1, true);
                }
                d.bi();
            }
            if (ec) {
                return true;
            }
        }
        return false;
    }

    public static final void B() {
        for (int i = 2; i < 6; ++i) {
            int n = cm[i];
            if ((n & 0xFFFF) != 0 || (n & 0xFFFF0000) == 0) continue;
            n -= 65536;
            n &= 0xFFFF0000;
            d.cm[i] = n += m[i];
        }
    }

    public static final boolean C(int n) {
        byte by = d.cd.i[3];
        do {
            d.cd.i[3] = (byte)(d.cd.i[3] + n);
            d.cd.i[3] = (byte)(d.cd.i[3] % 6);
        } while (cm[d.cd.i[3]] <= 0 && by != d.cd.i[3]);
        dc |= 4;
        if (d.cd.i[3] == by) {
            d.cd.i[3] = 1;
        }
        if (d.cd.i[3] == 5) {
            d.x();
            return true;
        }
        return false;
    }

    private static boolean aL() {
        if (ed && eI == 0 && el > 0) {
            if (el < 4000) {
                int n = (d.cd.a >> 8) + bI;
                int n2 = (d.cd.b >> 8) + bJ;
                cd.b(n, n2);
                bB[24].a(am, el / 1000, 120, 160, 0, 0, 0);
                el -= 100;
                if (an[14] < 0) {
                    ag = true;
                    d.t(9);
                }
                return true;
            }
            el -= 100;
        }
        am.setClip(0, 0, 240, 320);
        if (ew != "" && eI == 0) {
            if (ee) {
                cT = 0;
                if (cS < 20) {
                    cT = 60 - 3 * cS;
                } else if (cS > 100) {
                    if (d.b(false, true)) {
                        cT = (cS - 100) * 3;
                    } else {
                        cS = 20;
                    }
                }
                if (cS > 120) {
                    ew = "";
                    ey = 0;
                    cS = 0;
                }
                am.setClip(0, 0, 240, 294);
                if (cS < 20 || cS > 100 || dP == 4) {
                    cX.a(am, ew, 2, 289 + cT, 36, 236, ey, ey + 4, true);
                }
                if (cS == 0) {
                    d.bi();
                }
                ++cS;
                return false;
            }
            if (bD > 1) {
                if (an[6] < 0) {
                    d.an[6] = 0;
                    if (bD > 8) {
                        if (d.b(false, false)) {
                            return true;
                        }
                    } else {
                        bD = 8;
                    }
                }
                if (an[13] < 0) {
                    if (bD > 8) {
                        while (!d.b(true, false)) {
                        }
                        return true;
                    }
                    bD = 8;
                }
                am.setClip(0, 0, 240, 320);
                am.setColor(0);
                am.fillRect(0, 0, 240, 36);
                am.fillRect(0, 281, 240, 39);
                if (dP >= 0) {
                    cX.b(am, 236 + dP, 2, 3, 20);
                }
                d.b(38, 37, -1);
                am.setClip(0, 18, 240, 276);
                if (bD < 8) {
                    int n = bD < 4 ? 2 : 40 * (bD - 4) / 4;
                    am.setColor(0);
                    am.fillRect(0, 160 - n - 1, 240, 2 * n + 3);
                    am.setColor(0xFF00E0);
                    am.drawLine(0, 160 - n, 240, 160 - n);
                    am.setColor(11796732);
                    am.drawLine(0, 160 + n, 240, 160 + n);
                } else {
                    am.setColor(0);
                    am.fillRect(0, 119, 240, 83);
                    am.setColor(0xFF00E0);
                    am.drawLine(0, 120, 240, 120);
                    am.setColor(11796732);
                    am.drawLine(0, 200, 240, 200);
                    cX.a(am, ew, 2, 162, 6, 236, ey, ey + 4, false);
                    if (cS >= 0) {
                        am.setClip(0, 0, 240, 320);
                        am.setColor(255);
                        am.fillRect(1, 71, 50, 59);
                        bB[3 + cS].a(am, 0, 2, 128, 0, 0, 0);
                    }
                }
                return true;
            }
        }
        if (eC != "" && bD > 1) {
            if (an[3] < 0 || an[9] < 0) {
                boolean bl = eG = !eG;
            }
            if (an[14] < 0) {
                eC = "";
                eD = "";
                eE = "";
                if (bD > 8) {
                    if (!eG) {
                        d.bi();
                        return true;
                    }
                    dP = eF;
                    dQ = 0;
                    d.bi();
                    cH = 0;
                } else {
                    bD = 8;
                }
            }
            am.setClip(0, 0, 240, 320);
            am.setColor(0);
            am.fillRect(0, 0, 240, 36);
            am.fillRect(0, 281, 240, 39);
            cX.b(am, 236 + dP, 2, 3, 20);
            d.b(-1, -1, 40);
            am.setClip(0, 18, 240, 276);
            if (bD < 8) {
                int n = bD < 4 ? 2 : 40 * (bD - 4) / 4;
                am.setColor(0);
                am.fillRect(0, 160 - n - 1, 240, 2 * n + 3);
                am.setColor(0xFF00E0);
                am.drawLine(0, 160 - n, 240, 160 - n);
                am.setColor(11796732);
                am.drawLine(0, 160 + n, 240, 160 + n);
            } else {
                am.setColor(0);
                am.fillRect(0, 119, 240, 83);
                am.setColor(0xFF00E0);
                am.drawLine(0, 120, 240, 120);
                am.setColor(11796732);
                am.drawLine(0, 200, 240, 200);
                cX.b(1);
                cX.a(am, eC, 2, 134, 20, 236, false);
                if (eG) {
                    cX.b(0);
                } else {
                    cX.b(1);
                }
                cX.a(am, eD, 2, 176, 36, 236, false);
                if (!eG) {
                    cX.b(0);
                } else {
                    cX.b(1);
                }
                cX.a(am, eE, 2, 192, 36, 236, false);
                cX.b(1);
                if (cS >= 0) {
                    am.setClip(0, 0, 240, 320);
                    am.setColor(255);
                    am.fillRect(1, 71, 50, 59);
                    bB[3 + cS].a(am, 0, 2, 128, 0, 0, 0);
                }
            }
            return true;
        }
        if (eI != 0) {
            if (el != 5000) {
                el -= 100;
                if (an[13] < 0) {
                    if (eI > 0 && bD < 50) {
                        bD = 50;
                    } else {
                        el = -1;
                        bD = 81;
                    }
                    d.an[14] = 0;
                }
            }
            return false;
        }
        if (cF) {
            d.aI();
            return bD > 1;
        }
        if (cG) {
            return d.aZ() || bD > 1;
        }
        return false;
    }

    private static void aM() {
        int n;
        if (bD < 0) {
            bD = 0;
        }
        int n2 = Math.max(0, 240 - 240 * bD * 3 / 80);
        int n3 = Math.max(0, 276 - 276 * bD * 3 / 80);
        int n4 = 0 + (240 - n2) / 2;
        int n5 = 18 + (276 - n3) / 2;
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 18, 240, n5 - 18);
        am.fillRect(0, n5, n4 - 0, n3);
        am.fillRect(n4 + n2, n5, 240 - n4 - n2, n3);
        am.fillRect(0, n5 + n3, 240, 276 - n5 - n3);
        am.fillRect(0, 0, 240, 18);
        am.fillRect(294, 0, 240, 26);
        boolean bl = false;
        for (n = 0; n < 240; n += 3) {
            am.setColor(150 * n / 240, 150 * n / 240, 150 * n / 240);
            am.fillRect(n, 100, 3, 43);
        }
        am.setColor(200, 200, 200);
        am.drawLine(0, 100, 240, 100);
        am.setColor(0, 0, 0);
        am.drawLine(0, 143, 240, 143);
        if (cd != null) {
            bB[19].a(am, 0, (d.cd.a >> 8) + bI, (d.cd.b >> 8) + bJ + 2, 0, 0, 0);
            cd.g();
        }
        cX.b(am, 58, 120, 122, 3);
        n = bD * bB[14].a(11) * 2 / 80 - 2;
        if (n >= 0) {
            n = Math.min(n, bB[14].a(11) - 1);
            bB[14].a(am, 11, n, 60, 106, 0, 0, 0);
        }
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 0, 240, 36);
        am.fillRect(0, 275, 240, 45);
        d.b(-1, 37, -1);
    }

    private static void aN() {
        int n;
        boolean bl = false;
        for (n = 0; n < 240; n += 3) {
            am.setColor(255 - (109 + 146 * n / 240), 10 + 30 * n / 240, 10 + 30 * n / 240);
            am.fillRect(n, 100, 3, 43);
        }
        am.setColor(255, 100, 100);
        am.drawLine(0, 100, 240, 100);
        am.setColor(35, 0, 0);
        am.drawLine(0, 143, 240, 143);
        n = ((int)au >> 2) * 3 % bB[23].a(4);
        int n2 = 7;
        if (dP != -1 && eI <= 0) {
            n2 = 0;
        }
        bB[23].a(am, 4, n, 45, 134 - n2, 0, 0, 0);
        bB[23].a(am, 4, n, 195, 134 - n2, 0, 0, 0);
        cX.b(am, 59, 120, 129 - n2, 3);
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 0, 240, 36);
        am.fillRect(0, 281, 240, 39);
        d.b(-1, 37, -1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void aO() {
        block21: {
            if (eI > 0) {
                boolean bl = false;
                if (bD > 15) {
                    cX.b(1);
                    cX.b(am, 88, 120, 90, 3);
                }
                if (bD > 40) {
                    cV.b(0);
                    cV.a(am, "+" + d.n(eI), 120, 115, 3);
                } else {
                    cV.a("+" + eI, 240, 0, 1);
                }
                if (bD > 30) {
                    bB[14].a(am, 5, (240 - a.B - 26) / 2, 122, 0, 0, 0);
                    bB[14].a(am, 5, (240 + a.B + 26) / 2, 122, 0, 0, 0);
                }
            } else {
                cX.b(am, 89, 120, 98, 3);
            }
            if (el == 5000) {
                ac = false;
            } else if (!ac) {
                if (eI > 0) {
                    d.r(5);
                } else {
                    d.r(6);
                }
                d.h(true);
                d.aT();
                ac = true;
            }
            if (el < 3000) {
                d.f(229, 248);
                cX.b(am, 90, 120, 240, 3);
            }
            if (el <= 0 && bD > 80) {
                dc = 255;
                if (ed) {
                    if (eI > 0) {
                        cg = (byte)-1;
                        d.t(6);
                        eI = 0;
                        dP = -1;
                        ew = "";
                        eB = "";
                        ey = 0;
                        break block21;
                    } else {
                        cD = false;
                        d.cd.h = 0;
                        d.f(132, 189);
                        am.setClip(0, 0, 240, 320);
                        am.setColor(0);
                        am.fillRect(0, 281, 240, 39);
                        d.b(-1, 40, -1);
                        cX.b(am, 91, 120, 137, 17);
                        cX.b(am, 94 - Z * 2, 120, 167, 3);
                        cX.b(am, 93 + Z * 2, 120, 181, 3);
                        if (an[9] < 0 || an[3] < 0) {
                            Z ^= 1;
                            return;
                        }
                        if (an[6] < 0) {
                            eI = 0;
                            if (Z == 0) {
                                dQ = 0;
                                es = 0;
                                while (true) {
                                    if (dL[dP][dQ + 1] == 80) {
                                        d.V();
                                        eg = 0;
                                        eh = (byte)-1;
                                        d.bm();
                                        d.i(false);
                                        bQ = true;
                                        return;
                                    }
                                    dQ += dL[dP][dQ] + 1;
                                }
                            }
                            dP = -1;
                            cg = (byte)-1;
                            d.t(6);
                        }
                        return;
                    }
                }
                eI = 0;
                dP = -1;
                ew = "";
                eB = "";
                ey = 0;
            }
        }
        d.C();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b(boolean bl, boolean bl2) {
        boolean bl3 = false;
        if (!bl) {
            cX.a(ew, 236, -1, -1);
            for (int i = ey + 4; i < 50; ++i) {
                if (a.E[i] <= 0) continue;
                bl3 = true;
                break;
            }
        }
        if (bl || !bl3) {
            if (bl2) return true;
            ex = ew;
            ew = "";
            ey = 0;
            if (ec) {
                if (!d.bC()) return false;
                ec = false;
                bT = false;
                dc = 255;
                d.bi();
                if (bl && dP >= 0 && dQ + 1 < dL[dP].length && dR == 112) return false;
                return true;
            }
            dc = 255;
            d.bi();
            if (bl && dP >= 0 && dQ + 1 < dL[dP].length && dR == 96) return false;
            return true;
        }
        ey += 4;
        return false;
    }

    private static void aP() {
        int n;
        int n2;
        if (ec) {
            d.C();
            return;
        }
        if (cB) {
            d.aM();
            return;
        }
        if (cE) {
            d.aN();
            return;
        }
        if (eI != 0) {
            d.aO();
            el -= 100;
            if (aa && eI == 0) {
                bL = 10;
            }
            return;
        }
        am.setClip(0, 0, 240, 320);
        ++db;
        if (da > 0) {
            if (db > 30) {
                d.aS();
                db = 0;
            } else if (cZ[0] == 1) {
                dc |= 1;
            }
        }
        if (!ee) {
            int n3 = n2 = cw > 0 && gL < 0 && au % 2L == 0L ? 1 : 0;
            if ((dc & 0x10) == 16 || n2 != 0) {
                am.setClip(0, 0, 96, 18);
                d.j(true);
                n = 0;
                d.a(12, 8, cw, n2 != 0);
            }
            if ((dc & 1) == 1) {
                if (eI == 0) {
                    if (da > 0) {
                        if (cZ[0] == 0) {
                            am.setClip(96, 0, 144, 18);
                            d.j(true);
                            cX.b(1);
                            cX.a(am, cY[0], 168, 3, 17);
                        } else {
                            am.setClip(0, 0, 240, 320);
                            cX.b(1);
                            cX.a(am, cY[0], 120, 80, 17);
                        }
                    }
                    if (da <= 0 || cZ[0] == 1) {
                        am.setClip(96, 0, 144, 18);
                        d.j(true);
                        cX.a(am, d.o(cx), 238, 3, 24);
                    }
                }
                if (cB || cE || ed && eI < 0) {
                    am.setClip(96, 0, 144, 18);
                    d.j(true);
                    cX.a(am, d.o(cx), 238, 1, 24);
                }
            }
            if (eB != "") {
                am.setClip(0, 18, 240, 276);
                n = d.i(ez, eA);
                int n4 = d.j(ez, eA);
                int n5 = d.k(ez, eA) << 8;
                int n6 = d.l(ez, eA) << 8;
                int n7 = (n + n5 / 2 >> 8) + bI;
                int n8 = (n4 + n6 / 2 >> 8) + bJ;
                if (de) {
                    n8 -= 30;
                }
                cX.a(am, eB, n7, n8, 33, 240, 0, 50, false, true);
                bB[1].a(am, 10, (int)(au >> 1 & 1L), n7, n8, 0, 0, 0);
            }
        }
        if (ed) {
            if ((dc & 4) == 4) {
                am.setClip(128, 294, 112, 26);
                d.j(false);
                d.c(212, 302, ei + 1, 10, 4);
            }
        } else {
            if ((dc & 0xFF) == 255) {
                am.setClip(0, 294, 240, 26);
                d.j(false);
            } else if ((dc & 4) != 0) {
                am.setClip(133, 294, 107, 26);
                d.j(false);
            }
            if ((dc & 4) != 0) {
                if (ee) {
                    am.setClip(0, 294, 240, 26);
                    bB[1].a(am, 3, 0, 143, 315, 0, 0, 0);
                    d.c(212, 302, eW, 9, eY * eX);
                } else {
                    am.setClip(133, 294, 107, 26);
                    if (d.cd.i[0] != 3 || cm[3] != 0) {
                        n2 = d.cd.i[0] == 3 ? 3 : d.cd.i[3];
                        if (n2 == 1) {
                            d.b(180, 317, 212, 303, n2);
                        } else {
                            d.b(171, 317, 215, 303, n2);
                        }
                    }
                }
            }
        }
        if ((dc & 0x102) != 0) {
            am.setClip(58, 294, 73, 26);
            d.j(false);
            if (cA) {
                d.e(86, 307, 115, 302);
            } else {
                d.aQ();
            }
        }
        if (!ee) {
            d.aR();
        }
        if (!(ed || dP < 0 || !ep || em < 0 && (eI != 0 || el <= 0) || ee && ew != "")) {
            n2 = 0;
            if (ee) {
                n2 = 18;
            }
            am.setClip(0, 18 - n2, 240, 12);
            am.setColor(0);
            am.fillRect(0, 18 - n2, 240, 12);
            if (en != null) {
                cX.a(am, en, 62, 24 - n2, 6);
            }
            am.setColor(0xFFFFFF);
            am.fillRect(4, 20 - n2, 56, 8);
            am.setColor(0xFF0000);
            n = em < 0 ? 54 * el / eo : (em * 5 < eo && au % (long)(30 * em / eo + 1) == 0L ? 0 : 54 * em / eo);
            am.fillRect(5, 21 - n2, n, 6);
            if (em >= 0 && em * 5 < eo || em == 0) {
                am.setClip(0, 0, 240, 320);
                am.setColor(0xFF0000);
                am.drawRect(0, 0, 239, 319);
                dc |= 0x200;
            }
        }
        am.setClip(0, 0, 240, 320);
        d.bf();
        if (cq != null && (d.cd.e & 0x200) != 0 && !cD) {
            d.f(cq);
        }
        if (!cA && (d.cd.e & 4) != 0) {
            d.f(cd);
        }
        if (bT && !ec && eI == 0 && ew == "" && !cB && !cE) {
            am.setClip(0, 0, 240, 320);
            d.a(10, 316, false, 13, 0xFFFFFF, 0xFF00FF);
        }
        if ((dc & 0x100) != 0) {
            dc &= 0xFFFFFEFF;
            dc |= 2;
        } else {
            dc &= 0xFFFFFC00;
        }
        if (cA && d.cd.j[0] < 20 && (au & 1L) == 0L) {
            dc |= 0x100;
        }
        if ((cq == null || (d.cd.e & 0x200) == 0 || cD) && (cA || (d.cd.e & 4) == 0) && dj < 18) {
            dj = 320;
            dc |= 0x31;
        }
        am.setClip(0, 18, 240, 276);
    }

    private static void b(int n, int n2, int n3, int n4, int n5) {
        if (n5 < 1) {
            return;
        }
        gN.a(n5 - 1);
        d.gN.a = n;
        d.gN.b = n2;
        gN.a(am);
        int n6 = cm[n5];
        if (n5 == 1) {
            cX.a(am, "~", n3, n4 - 2, 17);
            return;
        }
        if (n5 > 1) {
            d.c(n3, n4 - 1, n6 & 0xFFFF, 9, n6 >> 16);
        }
    }

    private static void e(int n, int n2, int n3, int n4) {
        if ((dc & 0x100) == 0 || T == 8) {
            gO.a(9);
            d.gO.a = n;
            d.gO.b = n2;
            gO.a(am);
        }
        d.c(n3, n4, -1, -1, cn);
    }

    private static void a(int n, int n2, int n3, boolean bl) {
        d.a(n, n2, n3, bl, 5);
    }

    private static void a(int n, int n2, int n3, boolean bl, int n4) {
        gO.a(8);
        d.gO.b = n2;
        gN.a(7);
        d.gN.b = n2;
        boolean bl2 = true;
        for (int i = 0; i < n4; ++i) {
            if (i == n3 || i == cw - 1 && bl && au / 2L % 2L == 0L) {
                bl2 = false;
            }
            if (bl2) {
                d.gO.a = n;
                gO.a(am);
            } else {
                d.gN.a = n;
                gN.a(am);
            }
            n += 18;
        }
    }

    private static void aQ() {
        am.setColor(0xFFFFFF);
        am.drawLine(98, 305, 98, 311);
        int n = Math.abs(d.cd.h);
        short s = b.p[b.r][6];
        for (int i = 0; i < 5; ++i) {
            int n2 = s * i / 5;
            int n3 = s * (i + 1) / 5;
            am.setColor(0xFFFFFF);
            am.drawRect(99 + i * 6, 305 - i - 1, 6, 6 + i + 1);
            if (n3 <= n) {
                if (i > 2) {
                    am.setColor(255, (5 - i - 1) * 2 * 255 / 5, 0);
                } else {
                    am.setColor(255 - (2 - i) * 255 / 5, 255, 0);
                }
                am.fillRect(99 + i * 6, 305 - i, 6, 6 + i);
                continue;
            }
            if (n2 < n && n3 > n) {
                if (i > 2) {
                    am.setColor(255, (5 - i - 1) * 2 * 255 / 5, 0);
                } else {
                    am.setColor(255 - (2 - i) * 255 / 5, 255, 0);
                }
                int n4 = 6 * (n - n2) / (n3 - n2);
                am.fillRect(99 + i * 6, 305 - i, n4, 6 + i);
                am.setColor(0);
                am.fillRect(99 + i * 6 + n4, 305 - i, 6 - n4, 6 + i);
                continue;
            }
            am.setColor(0);
            am.fillRect(99 + i * 6, 305 - i, 6, 6 + i);
        }
        n = d.cd.h / 27;
        n *= n;
        d.c(82, 302, -1, -1, n /= a);
    }

    private static void j(boolean bl) {
        int[] nArray;
        short[] sArray;
        if (bl) {
            sArray = df;
            nArray = dg;
        } else {
            sArray = dh;
            nArray = di;
        }
        for (int i = 0; i < sArray.length; i += 4) {
            if (i / 4 < nArray.length) {
                am.setColor(nArray[i / 4]);
            }
            am.fillRect((int)sArray[i], (int)sArray[i + 1], (int)sArray[i + 2], (int)sArray[i + 3]);
        }
        if (bl) {
            gN.a(5);
            d.gN.a = 120;
            d.gN.b = 0;
            gN.a(am);
            am.setColor(8559870);
            am.drawLine(0, 17, 240, 17);
            return;
        }
        gN.a(6);
        d.gN.a = 120;
        d.gN.b = 320;
        gN.a(am);
        am.setColor(16614905);
        am.drawLine(0, 294, 240, 294);
        am.setColor(7154035);
        am.drawLine(0, 319, 240, 319);
    }

    static final void c(int n, int n2, int n3, int n4) {
        int n5 = n4 - ++n2;
        for (int i = n; i < n3; i += 3) {
            am.setColor(15 + i, 41 + 80 * i / 240, 115 + 30 * i / 240);
            am.fillRect(i, n2, 3, n5);
        }
        am.setColor(237, 155, 178);
        am.drawLine(n, --n2 + 1, n3, n2 + 1);
        am.setColor(54, 20, 57);
        am.drawLine(n, n4, n3, n4);
    }

    static final void f(int n, int n2) {
        d.c(0, n, 240, n2);
    }

    private static void c(int n, int n2, int n3, int n4, int n5) {
        if (n3 != -1) {
            if (n5 != -1) {
                cX.a(am, n3 + d.m(n4) + n5, n, n2 - 1, 17);
                return;
            }
            cX.a(am, n3 + d.m(n4), n, n2 - 1, 17);
            return;
        }
        if (n5 != -1) {
            cX.a(am, d.m(n4) + n5, n, n2 - 1, 17);
            return;
        }
        cX.b(am, n4, n, n2 - 1, 17);
    }

    private static void aR() {
        int n;
        int n2;
        int n3;
        int n4;
        if (T == 7 || bQ) {
            am.setClip(0, 294, 60, 26);
            d.j(false);
            am.setClip(0, 0, 240, 320);
            am.setColor(11665597);
            am.fillArc(19, 280, 40, 40, 0, 360);
            am.setColor(723209);
            am.fillArc(20, 281, 38, 38, 0, 360);
            am.setColor(7154035);
            am.drawLine(39, 282, 39, 318);
            am.drawLine(21, 300, 57, 300);
        }
        if (bg != null) {
            for (int i = 0; i < fy.length; ++i) {
                n4 = fy[i] & 0x1F;
                if (bg[n4] == null) continue;
                short[] sArray = bg[n4];
                for (n3 = 0; n3 < sArray.length; n3 += 6) {
                    if (sArray[n3 + 3] < 0 || gZ[sArray[n3 + 3] & 0xF] == 0 || sArray[n3 + 3] >> 8 != i) continue;
                    n2 = sArray[n3 + 0] + d.Q(i);
                    n = sArray[n3 + 1] + d.R(i);
                    am.setColor(0xFF8000);
                    am.setClip(0, 0, 240, 320);
                    d.a(n2 - cO, n - cP, false);
                }
            }
        }
        if (dd && aZ != null) {
            for (n4 = 0; n4 < aZ.length; ++n4) {
                if (aZ[n4] == null) continue;
                int[] nArray = aZ[n4];
                for (int i = 0; i < nArray.length; i += 5) {
                    n3 = (int)((au & 0xFL) * 255L / 15L);
                    am.setColor(n3, 255 - n3, 255 - n3);
                    am.setClip(0, 0, 240, 320);
                    n2 = nArray[i + 0] + d.Q(i) + (nArray[i + 4] & 0xFFFF) / 2;
                    n = nArray[i + 1] + d.R(i) + (nArray[i + 4] >>> 16) / 2;
                    d.a(n2 - cO, n - cP, true);
                    d.a(n2 << 8, n << 8, false, false, false, false);
                }
            }
        }
    }

    private static void a(int n, int n2, boolean bl) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (ec) {
            return;
        }
        if (T == 10) {
            n6 = n + cO;
            n5 = n2 + cP;
            int n7 = n6 / 24 >> 8;
            int n8 = n6 - (n7 * 24 << 8);
            int n9 = n5 / 24 >> 8;
            int n10 = n5 - (n9 * 24 << 8);
            n6 = ad + n7 * fR + (n8 * fR / 24 >> 8) - 2;
            n5 = ae + n9 * fS + (n10 * fS / 24 >> 8) - 2;
            n4 = 5;
            n3 = 5;
        } else {
            n6 = n + cO - (d.cd.a >> 8);
            n5 = n2 + cP - (d.cd.b >> 8);
            int n11 = (n6 = n6 * 17 / fw) * n6 + (n5 = n5 * 17 / fx) * n5;
            if (n11 >= 324) {
                if (bl) {
                    n6 = n6 * 19 / d.k(n11);
                    n5 = n5 * 19 / d.k(n11);
                } else {
                    return;
                }
            }
            n6 += 10;
            n5 += 10;
            n6 += 28;
            n5 += 289;
            n4 = 3;
            n3 = 3;
        }
        am.fillRect(n6, n5, n4, n3);
    }

    private static void a(int n, int n2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (T == 10) {
            return;
        }
        int n3 = 18;
        int n4 = 276;
        int n5 = 70656;
        boolean bl5 = false;
        if (em >= 0 || el > 0 && eI == 0) {
            n3 = 30;
            n4 = 264;
            n5 = 67584;
        }
        int n6 = fW + 30720;
        int n7 = fX + n5 / 2;
        int n8 = n - n6;
        int n9 = n2 - n7;
        if (Math.abs(n8) < 30720 && Math.abs(n9) < n5 / 2) {
            am.setClip(0, n3, 240, n4);
            boolean bl6 = false;
            int n10 = 16 * d.j(eq * 4 & 0xFF) / 3;
            int n11 = (n >> 8) + bI;
            int n12 = (n2 - n10 >> 8) + bJ - 32;
            if (bl) {
                if ((dR != 8 || (dX & 2) == 0 || (dX & 4) != 0) && dR != 88) {
                    for (int i = 0; i < 16; ++i) {
                        am.setColor(0x990099);
                        am.drawLine(n11 - (16 - i) / 3, n12 + i, n11, n12 + i);
                        am.setColor(0xCC00DD);
                        am.drawLine(n11 + 1, n12 + i, n11 + 1 + (16 - i) / 3, n12 + i);
                        am.setColor(0xDD00CC);
                        am.drawLine(n11 - (16 - i) / 3, n12 - i, n11, n12 - i);
                        am.setColor(0xFF66FF);
                        am.drawLine(n11 + 1, n12 - i, n11 + 1 + (16 - i) / 3, n12 - i);
                    }
                }
            } else if (!bl2) {
                n12 -= 12;
                for (int i = 0; i < 24; ++i) {
                    am.drawLine(n11 - (24 - i) / 3, n12 + i, n11 + (24 - i) / 3, n12 + i);
                }
            }
            return;
        }
        if (ee || bl3) {
            return;
        }
        if (Math.abs(n8 / 276) < Math.abs(n9 / 240)) {
            int n13;
            int n14;
            long l = 120L + 110L * (long)n8 * 240L / (long)Math.abs(n9 * 276);
            int n15 = (int)l;
            if (n9 > 0) {
                n14 = n3 + n4 - 10 - 1;
                n13 = 1;
            } else {
                n14 = n3 + 10;
                n13 = -1;
            }
            for (int i = 0; i < 10; ++i) {
                am.drawLine(n15 - (10 - i), n14 + i * n13, n15 + (10 - i), n14 + i * n13);
            }
            am.setColor(0xFFFFFF);
            am.drawLine(n15 - 10, n14, n15, n14 + 10 * n13);
            am.drawLine(n15 + 10, n14, n15, n14 + 10 * n13);
            am.drawLine(n15 - 10, n14, n15 + 10, n14);
            if (bl4) {
                cX.b(1);
                if ((cq == null || (d.cd.e & 0x200) == 0 || cD) && (cA || (d.cd.e & 4) == 0)) {
                    if (n13 == 1) {
                        cX.b(am, 42, n15, n14 - 1, 33);
                        return;
                    }
                    cX.b(am, 42, n15, n14 + 1, 17);
                    return;
                }
            }
        } else {
            int n16;
            int n17;
            long l = (long)(n4 / 2 + n3) + (long)((n4 - 20) / 2) * (long)n9 * (long)n4 / (long)Math.abs(n8 * 240);
            int n18 = (int)l;
            if (n8 > 0) {
                n17 = 229;
                n16 = 1;
            } else {
                n17 = 10;
                n16 = -1;
            }
            for (int i = 0; i < 10; ++i) {
                am.drawLine(n17 + i * n16, n18 - (10 - i), n17 + i * n16, n18 + (10 - i));
            }
            am.setColor(0xFFFFFF);
            am.drawLine(n17, n18 - 10, n17 + 10 * n16, n18);
            am.drawLine(n17, n18 + 10, n17 + 10 * n16, n18);
            am.drawLine(n17, n18 - 10, n17, n18 + 10);
            if (bl4) {
                cX.b(1);
                if ((cq == null || (d.cd.e & 0x200) == 0 || cD) && (cA || (d.cd.e & 4) == 0)) {
                    if (n16 == 1) {
                        cX.b(am, 42, n17 - 1, n18, 10);
                        return;
                    }
                    cX.b(am, 42, n17 + 1, n18, 6);
                }
            }
        }
    }

    private static void f(b b2) {
        int n;
        int n2;
        int n3 = (b2.a >> 8) + bI;
        int n4 = Math.max((b2.b - b2.j[9] >> 8) + bJ, 16);
        int n5 = co;
        if (b2.i[0] == 3) {
            boolean bl = false;
            n2 = 59;
            n = 255;
        } else {
            boolean bl = false;
            if (b2.i[0] == 5) {
                n5 *= 2;
                n2 = 62;
            } else {
                n2 = 61;
            }
            n = 16746029;
        }
        n5 = n5 * 24 / 500;
        if (n5 > 72) {
            n5 = 72;
        }
        am.setColor(0xFFFFFF);
        am.fillRect(n3 - 36 - 1, n4 - 3, 74, 6);
        am.setColor(n);
        am.fillRect(n3 - 36, n4 - 2, n5, 4);
        dj = n4 - 11;
        cX.b(am, n2, n3, n4 - 4, 33);
    }

    static final void a(String string, int n, boolean bl) {
        if (bl) {
            db = 0;
            d.cY[0] = string;
            d.cZ[0] = n;
            if (da == 0) {
                da = 1;
            }
            dc |= 1;
            return;
        }
        ++da;
        while (da > 5) {
            d.aS();
        }
        d.cY[d.da - 1] = string;
        d.cZ[d.da - 1] = n;
        if (da == 1) {
            db = 0;
            dc |= 1;
        }
    }

    private static void aS() {
        if (da > 0) {
            --da;
            for (int i = 1; i < 5; ++i) {
                d.cY[i - 1] = cY[i];
                d.cZ[i - 1] = cZ[i];
            }
            dc |= 1;
        }
    }

    private static void aT() {
        while (da > 0) {
            d.aS();
        }
    }

    public static final void a(int n, int n2, boolean bl, int n3, int n4, int n5) {
        am.setColor(n5);
        int n6 = n3 / 2 + (n3 >= 0 ? 1 : -1);
        if (bl) {
            am.drawLine(n -= n6, n2 - n3 / 2, n, n2 + n3 / 2);
            am.drawLine(n, n2 - n3 / 2 - (n3 >= 0 ? 1 : -1), n + n6, n2);
            am.drawLine(n, n2 + n3 / 2 + (n3 >= 0 ? 1 : -1), n + n6, n2);
            n += n3 >= 0 ? 1 : -1;
        } else {
            am.drawLine(n - n3 / 2, n2 -= n6, n + n3 / 2, n2);
            am.drawLine(n - n3 / 2 - (n3 >= 0 ? 1 : -1), n2, n, n2 + n6);
            am.drawLine(n + n3 / 2 + (n3 >= 0 ? 1 : -1), n2, n, n2 + n6);
            n2 += n3 >= 0 ? 1 : -1;
        }
        am.setColor(n4);
        n6 -= (n3 -= 2 * (n3 >= 0 ? 1 : -1)) >= 0 ? 1 : -1;
        for (int i = 0; i != n3; i += n3 >= 0 ? 1 : -1) {
            int n7;
            if (bl) {
                n7 = n2 + i - n3 / 2;
                am.drawLine(n, n7, n + n3 - n6 - Math.abs(i - n3 / 2) * (n3 >= 0 ? 1 : -1), n7);
                continue;
            }
            n7 = n + i - n3 / 2;
            am.drawLine(n7, n2, n7, n2 + n3 - n6 - Math.abs(i - n3 / 2) * (n3 >= 0 ? 1 : -1));
        }
    }

    public static final void C() {
        am.setClip(0, 0, 240, 320);
        am.setColor(0);
        am.fillRect(0, 0, 240, 36);
        am.fillRect(0, 281, 240, 39);
        if (!ed || eI != -1) {
            d.b(38, -1, -1);
        }
        am.setClip(0, 18, 240, 276);
    }

    private static void aU() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = cu * 8;
        int n6 = dk[n5 + 1];
        if (gT == -1) {
            do = false;
            gT = 6;
            switch (cu) {
                case 0: {
                    dm = ds[d.r(d.cd.a, d.cd.b) - cf * 7];
                    dn = dt;
                    break;
                }
                case 1: {
                    dm = E;
                    dn = dt;
                    break;
                }
                case 2: {
                    n4 = 0;
                    for (n3 = 0; n3 < 7; ++n3) {
                        if (dq[n3 * 10 + 5] < 0) continue;
                        ++n4;
                    }
                    gT = 5;
                    d.f(false);
                    gU = n4;
                    break;
                }
                case 3: {
                    n4 = 0;
                    for (n3 = 0; n3 < 7; ++n3) {
                        if (dD[n3 * dA + du] < 0) continue;
                        ++n4;
                    }
                    gU = d.M() ? n4 + 1 : n4;
                    gT = 5;
                    d.g(false);
                }
            }
            if (gU == 0 && cu >= 2) {
                dc = 255;
                d.f(232, 248);
                cX.b(am, 90, 120, 240, 3);
                do = true;
                return;
            }
            gQ = 0;
            gR = 0;
            gS = 1;
            gP = dk[n5 + 0];
            gW = "";
            gX = at;
            gV = cv;
            dc = 983040;
        } else if (do) {
            d.h(true);
            d.t(7);
            d.h();
            return;
        }
        if (gT <= 5) {
            if (dC) {
                n4 = 0;
                for (n3 = 0; n3 < 7; ++n3) {
                    if (dD[n3 * dA + du] > 0 || w[n3 * 3 + 2] > cy) continue;
                    ++n4;
                }
                n6 = n4;
            } else {
                n6 = gU;
            }
        }
        if (gW != "") {
            d.L();
            if (an[6] < 0 || at - gX >= 2500L) {
                gW = "";
                dc |= 0xF0000;
            }
            return;
        }
        if (gT == 7) {
            if (an[5] < 0) {
                gR = 0;
            } else if (an[7] < 0) {
                gR = 1;
            } else if (an[6] < 0 || an[14] < 0) {
                if (gP == 2) {
                    gT = 9;
                    gQ = 0;
                } else {
                    ++gT;
                    gS = 0;
                    dc |= 0x20000;
                }
            }
        } else if (gT == 2) {
            n5 = gV * dA;
            if (an[5] < 0) {
                gS = Math.max(gS - 1, dD[n5 + dv]);
            } else if (an[7] < 0) {
                gS = Math.min(gS + 1, 4);
                n2 = 0;
            } else if (an[6] < 0 || an[14] < 0) {
                n2 = d.K(n5);
                if (dD[n5 + dv] == gS) {
                    gT = -1;
                } else if (n2 > cx) {
                    d.V(169);
                } else {
                    gT = 3;
                }
            }
        } else if (gT < 5) {
            n5 = gV * dA;
            if (an[5] < 0) {
                gR = 0;
            } else if (an[7] < 0) {
                gR = 1;
            } else if (an[6] < 0 || an[14] < 0) {
                if (gT == 4) {
                    if (gR == 0 && dC) {
                        d.dD[n5 + d.du] = (short)(aw / 1000L & 0xFFL);
                        d.z(-(dD[n5 + dv] * w[gV * 3 + 1]));
                        dC = false;
                        gQ = 0;
                    }
                    gT = -1;
                } else if (gT == 0) {
                    if (gR == 0) {
                        if (dD[n5 + dv] == 4) {
                            d.V(170);
                        } else {
                            gS = dD[n5 + dv] + 1;
                            n2 = d.K(n5);
                            if (n2 > cx) {
                                d.V(169);
                            } else {
                                gS = dD[n5 + dv];
                                gT = 2;
                            }
                        }
                    } else {
                        gT = 1;
                    }
                } else if (gT == 1) {
                    if (gR == 0) {
                        d.dD[n5 + d.du] = -1;
                        d.z(dD[n5 + dx]);
                        d.dD[n5 + d.dx] = 0;
                        d.dD[n5 + d.dz] = 0;
                        d.dD[n5 + d.dy] = 0;
                    }
                    gT = -1;
                } else if (gT == 3) {
                    if (gR == 0) {
                        n2 = d.K(n5);
                        d.dD[n5 + d.dv] = (short)gS;
                        d.z(-n2);
                    }
                    gT = -1;
                }
                dc |= 0xF0000;
            }
        } else if (gT <= 6) {
            if (an[9] < 0) {
                gX = 0L;
                ++gQ;
                gQ %= n6;
                dc |= 0xF0000;
            } else if (an[3] < 0) {
                gX = 0L;
                gQ += n6 - 1;
                gQ %= n6;
                dc |= 0xF0000;
            } else if (an[6] < 0 || an[14] < 0) {
                if (gP == 3) {
                    n5 = gV * dA;
                    if (gV == -1) {
                        gQ = 0;
                        dC = true;
                    } else if (dC) {
                        if (cx >= dD[n5 + dv] * w[gV * 3 + 1]) {
                            gT = 4;
                        }
                    } else {
                        gT = 0;
                        gR = dD[n5 + dv] == 4 ? 1 : 0;
                    }
                } else if (gP == 0 || gP >= 2) {
                    gR = 0;
                    if (gP == 2 && ++gT == 7 && gQ == 4) {
                        gT = 10;
                    } else if (gP >= 2 && gT == 7) {
                        gT = 9;
                        gR = 0;
                    } else if ((gP == 2 || gP == 3) && gT == 6) {
                        gQ = 0;
                    }
                } else if (gP == 1) {
                    gR = 0;
                    n2 = dm[gQ * 2] * gS * 100;
                    if (gQ == 0 && cn == 100) {
                        d.V(167);
                    } else if (gQ == 1 && cw == 0) {
                        d.V(166);
                    } else if (n2 > cx) {
                        d.V(164);
                    } else if (gQ == 5 && et >= 3) {
                        d.V(171);
                    } else {
                        gT = 11;
                    }
                }
                dc |= 0xF0000;
            }
        } else if (gT == 11) {
            if (an[5] > 0 || an[9] > 0) {
                gR = 0;
            } else if (an[7] > 0 || an[3] > 0) {
                gR = 1;
            } else if (an[6] < 0 || an[14] < 0) {
                if (gR == 0) {
                    d.aV();
                }
                gT = 6;
                dc |= 0xF0000;
                return;
            }
        } else if (gT == 8) {
            if (an[5] > 0 || an[9] > 0) {
                if (gS < 40) {
                    --gS;
                } else if (gS < 200) {
                    if ((gS -= 10) % 10 != 0) {
                        gS += 10 - gS % 10;
                    }
                } else if ((gS -= 100) % 100 != 0) {
                    gS += 100 - gS % 100;
                }
                dc |= 0x20000;
            } else if (an[7] > 0 || an[3] > 0) {
                n2 = gR == 0 ? dn[gQ * 2 + 1] : dm[gQ * 2 + 1];
                n = gS;
                gS = gS < 30 ? ++gS : (gS < 100 ? (gS += 10) : (gS += 100));
                if (n2 + gS > Short.MAX_VALUE) {
                    gS = Short.MAX_VALUE - n2;
                    if (n2 + n == Short.MAX_VALUE) {
                        d.V(gR == 0 ? 165 : 168);
                    }
                }
                if (gR == 0 && cx < dm[gQ * 2] * gS) {
                    gS = n;
                }
                dc |= 0x20000;
            } else if (an[6] < 0 || an[14] < 0) {
                if (cu == 1) {
                    gR = 0;
                    gT = 11;
                } else {
                    d.aV();
                }
                dc |= 0xF0000;
                return;
            }
            gS = Math.max(0, gS);
            n2 = gR == 0 ? dm[gQ * 2 + 1] : dn[gQ * 2 + 1];
            gS = Math.min(gS, n2);
        } else if (gT == 9) {
            if (an[5] > 0 || an[9] > 0) {
                gS -= A[gQ * 2 + 1];
                dc |= 0x20000;
            } else if (an[7] > 0 || an[3] > 0) {
                gS += A[gQ * 2 + 1];
                dc |= 0x20000;
            } else if (an[6] < 0 || an[14] < 0) {
                d.aV();
                dc |= 0xF0000;
                return;
            }
            if (gQ == 0) {
                n2 = dq[gV * 10 + 1];
                n = A[0] * C[n2 - 1] / C[0] / A[1] * A[1];
                gS = Math.min(n, gS);
                gS = Math.max(A[gQ * 2 + 1], gS);
            } else {
                gS = Math.min(A[gQ * 2], gS);
                gS = Math.max(A[gQ * 2 + 1], gS);
            }
        } else if (gT == 10) {
            n5 = gV * 10;
            if (an[5] < 0) {
                gR = 0;
                dc |= 0x20000;
            } else if (an[7] < 0) {
                gR = 1;
                dc |= 0x20000;
            } else if (an[6] < 0 || an[14] < 0) {
                if (gR == 0) {
                    d.z(d.H(n5));
                    d.D(n5);
                    gT = -1;
                } else {
                    gT = 6;
                    gQ = 0;
                }
                dc |= 0xF0000;
            }
        }
        if (gT >= 7 && gP == 0 && dn[gQ * 2 + 1] == 0 && gR == 1) {
            gR = 0;
        }
        d.aY();
        if (an[13] < 0) {
            dc |= 0xF0000;
            if (gT < 5) {
                gT = -1;
                return;
            }
            if (gT == 5 && dC) {
                gT = -1;
                dC = false;
                return;
            }
            if (gT == 9) {
                gT = 6;
                return;
            }
            if (gP > 1 && gU > 1 && gT == 6) {
                gT = 5;
                if (gP == 2 || gP == 3) {
                    n2 = 0;
                    n = 10;
                    short[] sArray = dq;
                    int n7 = 5;
                    if (cu == 3) {
                        n = dA;
                        sArray = dD;
                        n7 = du;
                    }
                    n4 = 0;
                    for (n3 = 0; n3 < 7; ++n3) {
                        if (sArray[n3 * n + n7] < 0 ^ dC || w[n3 * 3 + 2] > cy && dC) continue;
                        if (n3 == gV) {
                            gQ = n4;
                            return;
                        }
                        ++n4;
                    }
                }
            } else {
                if (gT > 6) {
                    gT = 6;
                    return;
                }
                dc = 255;
                d.f(232, 248);
                cX.b(am, 90, 120, 240, 3);
                do = true;
            }
        }
    }

    private static void aV() {
        int n = 1;
        int n2 = gQ * 2;
        if (gP == 0 && gR == 1) {
            n = -1;
        }
        gT = 6;
        if (gP == 0) {
            if (n > 0 && gS > 0) {
                d.dn[n2] = (short)((gS * dm[n2] + dn[n2 + 1] * dn[n2]) / (gS + dn[n2 + 1]));
            }
            int n3 = n2 + 1;
            dn[n3] = (short)(dn[n3] + n * gS);
            int n4 = n2 + 1;
            dm[n4] = (short)(dm[n4] - n * gS);
            if (dn[n2 + 1] == 0) {
                d.dn[n2] = 0;
            }
            d.z(-(n * (dm[n2] * gS)));
            return;
        }
        if (gP == 1) {
            int n5 = n * (dm[n2] * gS) * 100;
            if (cu == 1) {
                byte by = 0;
                switch (gQ) {
                    case 0: {
                        cn = (short)(cn + 30);
                        if (cn > 100) {
                            cn = (short)100;
                        }
                        d.cd.j[0] = cn;
                        break;
                    }
                    case 1: {
                        cw = 0;
                        gK = 0;
                        break;
                    }
                    case 2: {
                        by = 2;
                        break;
                    }
                    case 3: {
                        by = 3;
                        break;
                    }
                    case 4: {
                        by = 5;
                        break;
                    }
                    case 5: {
                        d.L(35);
                    }
                }
                if (gQ > 1 && gQ < 5) {
                    int n6 = cm[by];
                    n6 += 262144;
                    n6 &= 0xFFFF0000;
                    d.cm[by] = n6 += m[by];
                    if (cA && d.cd.i[3] < by && by <= 5) {
                        d.cd.i[3] = by;
                    }
                }
            }
            d.z(-n5);
            return;
        }
        if (gQ == 1) {
            short s = dq[gV * 10 + 0];
            d.dq[d.gV * 10 + 1] = (short)gS;
            int n7 = A[0] * C[dq[gV * 10 + 1] - 1] / C[0] / A[1] * A[1];
            if (s > n7) {
                d.dq[d.gV * 10 + 0] = (short)n7;
                return;
            }
            if (s < A[1]) {
                d.dq[d.gV * 10 + 0] = A[1];
                return;
            }
            d.dq[d.gV * 10 + 0] = s;
            return;
        }
        d.dq[d.gV * 10 + d.gQ] = (short)gS;
    }

    static final boolean D() {
        int n = (int)((aw + 100L) / 1000L & 0xFFL);
        int n2 = (int)(aw / 1000L & 0xFFL);
        return n < n2 || ax == 0L;
    }

    static final void E() {
        boolean bl = false;
        for (int i = 0; i < 7; ++i) {
            if (dq[i * 10 + 5] < 0) continue;
            int n = 100 * dq[i * 10 + 0] * dp[i * 5 + 2] / 2;
            d.z(n * 90 / 100);
            d.dq[d.gV * 10 + 5] = -1;
            d.dq[d.gV * 10 + 6] = 0;
            d.dq[d.gV * 10 + 7] = 0;
            bl = true;
            if (cx > 0) break;
        }
        if (dB) {
            d.K();
            d.z(25000);
            dB = false;
            bl = true;
        }
        if (bl) {
            ew = d.m(194);
            cS = -1;
            ey = 0;
        }
    }

    static final void F() {
        for (int i = 0; i < 7; ++i) {
            int n = i * 10;
            d.D(n);
        }
    }

    static final void D(int n) {
        int n2 = n / 10;
        int n3 = dp[n2 * 5 + 2] + d.a(-3, 4) / 3;
        n3 = Math.min(n3, 5);
        n3 = Math.max(1, n3);
        d.dq[n + 1] = (short)n3;
        d.dq[n + 0] = (short)(A[0] / 2 + d.a(0, A[0] / 10) - A[0] / 20);
        d.dq[n + 0] = (short)(dq[n + 0] * C[n3 - 1] / C[0] / A[1] * A[1]);
        d.dq[n + 2] = (short)Math.max(dq[n + 0] / dp[n2 * 5 + 1] + d.a(0, 9) - 4, 1);
        d.dq[n + 3] = 1;
        d.dq[n + 4] = 0;
        d.dq[n + 5] = -1;
        d.dq[n + 6] = 0;
        d.dq[n + 7] = 0;
        d.dq[n + 9] = 0;
    }

    static final int E(int n) {
        int n2 = n / 10 * 5;
        int n3 = dp[n2 + 2] - 1;
        int n4 = B[n3] - (n3 + 1) * 3;
        int n5 = dq[n + 0] * C[n3] / C[0];
        int n6 = n5 * n4;
        int n7 = dq[n + 3] - 1;
        n6 -= n5 / dp[n2 + 1] * D[n3];
        n6 -= A[0] * 2;
        if ((n6 -= 200 * n7 * n7) == 0) {
            n6 = 1;
        }
        return n6;
    }

    static final int F(int n) {
        int n2 = dq[n + 1] - 1;
        short s = B[n2];
        int n3 = dq[n + 0] * C[n2] / C[0];
        short s2 = dq[n + 2];
        int n4 = n / 10 * 5;
        int n5 = Math.abs(n2 - (dp[n4 + 2] - 1)) * 15;
        n3 = Math.min(n3, s2 * dp[n4 + 1]);
        if ((n3 *= 100 - (n5 /= dq[n + 3])) <= 0) {
            return 0;
        }
        return n3 * s / 100;
    }

    static final int G(int n) {
        int n2 = dq[n + 1] - 1;
        int n3 = dq[n + 0] * C[n2] / C[0];
        short s = dq[n + 2];
        int n4 = dq[n + 3] - 1;
        return s * D[n2] + n3 * (n2 + 1) * 3 + (A[0] * 2 + 200 * n4 * n4);
    }

    static final void G() {
        if (d.D()) {
            d.f(true);
        }
    }

    static final void f(boolean bl) {
        int n = (int)(aw / 1000L & 0xFFL);
        int n2 = 0;
        for (int i = 0; i < 7; ++i) {
            int n3;
            int n4 = i * 10;
            if (dq[n4 + 5] < 0 || n == dq[n4 + 5] && !bl) continue;
            if (bl) {
                n3 = 255 - dq[n4 + 5];
                d.dq[n4 + 5] = 0;
                int n5 = d.E(n4);
                int n6 = d.F(n4) - d.G(n4);
                d.dq[n4 + 8] = n6 > n5 ? (short)Math.min(100 * Math.abs(n6 - n5) / Math.abs(n5), 50) : (short)Math.max(-(100 * Math.abs(n6 - n5) / Math.abs(n5)), -50);
            } else {
                n3 = n - dq[n4 + 5];
                d.dq[n4 + 5] = (short)n;
            }
            int n7 = n4 + 6;
            dq[n7] = (short)(dq[n7] + d.F(n4) * n3 / 255);
            int n8 = n4 + 7;
            dq[n8] = (short)(dq[n8] + d.G(n4) * n3 / 255);
            int n9 = n4 + 9;
            dq[n9] = (short)(dq[n9] + (short)(d.F(n4) * n3 / 255 - d.G(n4) * n3 / 255));
            if (!bl) continue;
            n2 += dq[n4 + 9];
            d.dq[n4 + 9] = 0;
            dc |= 1;
        }
        d.z(n2);
    }

    static final int H(int n) {
        short s = dq[n + 8];
        int n2 = dp[n / 10 * 5 + 0] * 100;
        n2 = s > 0 ? (n2 += n2 / 10000 * s * s) : (n2 += n2 * s / 110);
        if (n2 < 1000) {
            n2 = 1000;
        }
        return n2;
    }

    static final void H() {
        if (d.D()) {
            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 7; ++j) {
                    int n = d.a(0, 200) - 100;
                    d.ds[i][j * 2 + 1] = (byte)d.h(j * 8 + i, n);
                    d.ds[i][j * 2] = (byte)d.g(j * 8 + i, n);
                }
            }
        }
    }

    static final int g(int n, int n2) {
        int n3 = Math.max(0, dr[n * 4] + dr[n * 4 + 1] * n2 / 100);
        return n3;
    }

    static final int h(int n, int n2) {
        n2 = n2 < 0 ? -100 - n2 : 100 - n2;
        int n3 = Math.max(dr[n * 4 + 2] + dr[n * 4 + 3] * n2 / 100, 0);
        return n3;
    }

    static final int I() {
        int n;
        int n2 = d.a(0, 100);
        for (n = 0; n < z.length && n2 >= z[n]; ++n) {
        }
        return n * 20;
    }

    static final int I(int n) {
        return v[dD[n + dw]] * dD[n + dv];
    }

    static final int J(int n) {
        return w[n / dA * 3 + 1] * (dD[n + dv] + 1);
    }

    static final int K(int n) {
        int n2 = 0;
        if (gS > dD[n + dv]) {
            for (int i = dD[n + dv] + 1; i <= gS; ++i) {
                n2 += y[i];
            }
        }
        return n2;
    }

    static final void J() {
        if (d.D()) {
            d.g(true);
        }
    }

    static final void g(boolean bl) {
        int n = (int)(aw / 1000L & 0xFFL);
        for (int i = 0; i < 7; ++i) {
            int n2;
            int n3 = i * dA;
            if (dD[n3 + du] < 0 || n == dD[n3 + du] && !bl) continue;
            if (bl) {
                n2 = 255 - dD[n3 + du];
                d.dD[n3 + d.du] = 0;
            } else {
                n2 = n - dD[n3 + du];
                d.dD[n3 + d.du] = (short)n;
            }
            int n4 = n3 + dx;
            dD[n4] = (short)(dD[n4] + (d.I(n3) - d.J(n3)) * n2 / 255);
            if (!bl) continue;
            d.z(dD[n3 + dx]);
            d.dD[n3 + d.dy] = dD[n3 + dx];
            int n5 = n3 + dz;
            dD[n5] = (short)(dD[n5] + dD[n3 + dx]);
            d.dD[n3 + d.dx] = 0;
            int n6 = n3 + dw;
            dD[n6] = (short)(dD[n6] + 1);
            if (dD[n3 + dw] % 20 != 0) continue;
            d.dD[n3 + d.dw] = (short)d.I();
        }
    }

    static final void K() {
        for (int i = 0; i < 7; ++i) {
            int n = i * dA;
            d.dD[n + d.du] = -1;
            d.dD[n + d.dv] = w[i * 3];
            d.dD[n + d.dw] = (short)d.I();
            d.dD[n + d.dx] = 0;
            d.dD[n + d.dy] = 0;
            d.dD[n + d.dz] = 0;
        }
    }

    private static void aW() {
        if (gR == 0) {
            cX.b(2);
        } else {
            cX.b(1);
        }
        cX.b(am, 94 - gR * 2, 52, 59, 3);
        if (gR == 0) {
            cX.b(1);
        } else {
            cX.b(2);
        }
        cX.b(am, 93 + gR * 2, 148, 59, 3);
        cX.b(1);
    }

    private static int aX() {
        if ((au & 0xFL) > 7L) {
            return 4286975 + (128 - (int)(128L * (au & 7L)) / 7 << 16) + (96 - (int)(96L * (au & 7L)) / 7 << 8);
        }
        return 4286975 + ((int)(128L * (au & 7L)) / 7 << 16) + ((int)(96L * (au & 7L)) / 7 << 8);
    }

    private static void aY() {
        cX.b(0);
        if (dc == 0 && (gT == 4 || gT == 1 || gT == 3 || gT == 11 || gT == 10 || gT == 2 || gT == 8)) {
            dc |= 0x20000;
        }
        am.setClip(0, 0, 240, 320);
        if ((dc & 0xF0000) == 983040) {
            am.setColor(0xFFFFFF);
            am.fillRect(0, 0, 240, 320);
            am.setColor(0xEFF3FF);
            am.fillRect(0, 286, 240, 34);
        }
        if ((dc & 0x20000) != 0) {
            am.setColor(0xFFFFFF);
            am.fillRect(4, 22, 192, 44);
            am.setColor(0xDEDBDE);
            am.drawRect(4, 22, 192, 44);
        }
        if ((dc & 0x80000) != 0) {
            cX.b(0);
            cX.b(am, 104, 10, 290, 20);
            cX.a(am, d.o(cx), 230, 290, 24);
        }
        int n = cu;
        if (gP > 1 && !dC ^ gT <= 5) {
            n += 2;
        }
        if ((dc & 0x10000) != 0) {
            am.setColor(187);
            am.fillRect(5, 6, 191, 15);
            am.setColor(0xDEDBDE);
            am.drawRect(4, 5, 192, 16);
            if (n <= 3 || n == 5) {
                cX.b(am, 172 + cu, 100, 14, 3);
            }
        }
        int n2 = cu * 8;
        int n3 = dk[n2 + 1];
        if (gT <= 5) {
            n3 = 7;
        }
        dE = cu == 3 ? 23 : 26;
        boolean bl = false;
        int n4 = 73 + dE + n3 * dE;
        if ((dc & 0x40000) != 0) {
            am.setColor(0xDEDBDE);
            am.drawLine((int)dl[n][0], 73 + dE, (int)dl[n][dl[n].length - 1], 73 + dE);
            am.setColor(0x777777);
            am.drawRect((int)dl[n][0], 73, dl[n][dl[n].length - 1] - dl[n][0], n4 - 73);
            if (dk[n2 + 6] >= 0) {
                if (dk[n2 + 6] == 1) {
                    am.setColor(0xEFF3FF);
                    am.fillRect(204, 19, 25, 39);
                    am.setColor(3242445);
                    am.drawRect(203, 18, 26, 40);
                    bB[dk[n2 + 6]].a(am, (int)dk[n2 + 7], 0, 216, 47, 0, 0, 0);
                } else {
                    bB[dk[n2 + 6]].a(am, 0, 203, 66, 0, 0, 0);
                }
            }
        }
        if (gT <= 5) {
            int n5;
            if ((dc & 0x20000) != 0) {
                am.setClip(4, 22, 192, 44);
                cX.b(1);
                if (gT == 4) {
                    cX.a(am, 218, 8, 26, 20, 188, false);
                    d.aW();
                } else if (gT == 1) {
                    n5 = dD[gV * dA + dx];
                    cX.a(am, d.m(220) + d.o(n5) + "?", 100, 26, 17, 188, false);
                    d.aW();
                } else if (gT == 3) {
                    n5 = d.K(gV * dA);
                    cX.a(am, d.m(221) + d.o(n5) + "?", 100, 26, 17, 188, false);
                    d.aW();
                } else if (gT == 2) {
                    d.a(71, 57, gS, false, 4);
                    cX.b(am, 9, 61, 59, 10);
                    cX.b(am, 11, 138, 59, 6);
                    n5 = d.K(gV * dA);
                    cX.a(am, d.m(103) + " " + d.o(n5), 100, 26, 17, 188, false);
                } else if (dC) {
                    cX.a(am, 215, 8, 26, 20, 188, false);
                } else {
                    cX.a(am, (int)dk[n2 + 2], 8, 26, 20, 188, false);
                }
                cX.b(0);
            }
            am.setClip(0, 0, 240, 320);
            if (gT == 0) {
                d.a(216, 217, gR, gT == 7, true, true);
            }
            if ((dc & 0x40000) != 0) {
                int n6;
                int n7;
                int n8 = (dl[n].length - 1) / 2;
                boolean bl2 = false;
                int n9 = 10;
                short[] sArray = dq;
                int n10 = 5;
                if (cu == 3) {
                    n9 = dA;
                    sArray = dD;
                    n10 = du;
                }
                int n11 = 0;
                for (n7 = 0; n7 < 7; ++n7) {
                    if (sArray[n7 * n9 + n10] < 0 ^ dC || w[n7 * 3 + 2] > cy && dC) continue;
                    if (n11 != gQ) {
                        cX.b(0);
                    } else {
                        am.setColor(4295133);
                        am.fillRect(dl[n][0] + 1, 73 + (n11 + 1) * dE, dl[n][n8 * 2] - dl[n][0] - 1, dE);
                        gV = n7;
                        cX.b(1);
                    }
                    if (cu == 3) {
                        n6 = (dl[n][0] + dl[n][2]) / 2;
                        cX.b(am, 222 + n7, n6, 80 + (n11 + 1) * dE - 1, 17);
                        n6 = (dl[n][2] + dl[n][4]) / 2;
                        d.a(n6 - 16 - 12, 80 + (n11 + 1) * dE + 4, (int)dD[n7 * dA + dv], false, 4);
                        n6 = (dl[n][4] + dl[n][6]) / 2;
                        n5 = dC ? w[n7 * 3 + 1] * (dD[n7 * dA + dv] + 1) : (dD[n7 * dA + dw] % 20 != 0 ? dD[n7 * dA + dy] : dD[n7 * dA + dx]);
                        cX.a(am, d.o(n5), n6, 80 + (n11 + 1) * dE - 1, 17);
                    } else {
                        int n12 = n7 * 10;
                        n6 = (dl[n][0] + dl[n][2]) / 2;
                        cX.b(am, 185 + n7, n6, 80 + (n11 + 1) * dE, 17);
                        n6 = (dl[n][2] + dl[n][4]) / 2;
                        n5 = dq[n12 + 6] - dq[n12 + 7];
                        cX.a(am, d.o(n5), n6, 80 + (n11 + 1) * dE, 17);
                        n6 = dl[n][6] - 2;
                        n5 = dq[n12 + 9];
                        cX.a(am, d.o(n5), n6, 80 + (n11 + 1) * dE, 24);
                    }
                    ++n11;
                }
                if (d.M() && cu == 3 && !dC) {
                    if (n11 != gQ) {
                        cX.b(0);
                    } else {
                        am.setColor(4295133);
                        am.fillRect(dl[n][0] + 1, 73 + (n11 + 1) * dE, dl[n][n8 * 2] - dl[n][0] - 1, dE);
                        gV = -1;
                        cX.b(1);
                    }
                    n6 = (dl[n][0] + dl[n][2]) / 2;
                    cX.b(am, 214, n6, 80 + (n11 + 1) * dE - 1, 17);
                }
                if ((dc & 0x20000) != 0 && gV == -1) {
                    am.setClip(4, 22, 192, 44);
                    am.setColor(0xFFFFFF);
                    am.fillRect(4, 22, 192, 44);
                    am.setColor(0xDEDBDE);
                    am.drawRect(4, 22, 192, 44);
                    cX.b(1);
                    cX.a(am, 183, 6, 25, 20, 188, false);
                    am.setClip(0, 0, 240, 320);
                }
                cX.b(0);
                am.setColor(0xDEDBDE);
                for (n7 = 0; n7 < n8; ++n7) {
                    if (n7 != n8 - 1) {
                        am.drawLine((int)dl[n][2 * n7 + 2], 74, (int)dl[n][2 * n7 + 2], n4 - 1);
                    }
                    n6 = (dl[n][2 * n7] + dl[n][2 * n7 + 2]) / 2;
                    cX.b(am, dl[n][2 * n7 + 1], n6 + 1, 80, 17);
                }
            }
        } else {
            int n13;
            int n14;
            int n15;
            am.setClip(0, 0, 240, 320);
            if ((dc & 0x10000) != 0 && gP == 2) {
                cX.b(am, 185 + gV, 100, 14, 3);
            }
            if ((dc & 0x20000) != 0) {
                cX.b(1);
                am.setClip(4, 22, 192, 44);
                if (gT == 6 && at - gX < 2500L && gW == "") {
                    cX.a(am, (int)dk[n2 + 3], 8, 26, 20, 188, false);
                } else if (gT == 8) {
                    cX.a(am, 125, 8, 26, 20, 188, false);
                } else if (gT == 9) {
                    cX.a(am, 184, 8, 26, 20, 188, false);
                } else if (gT == 11) {
                    n15 = dm[gQ * 2] * gS * 100;
                    cX.a(am, d.m(143) + d.o(n15) + "?", 100, 26, 17, 188, false);
                    d.aW();
                } else if (dk[n2 + 5] >= 0 && gT != 10) {
                    cX.a(am, dk[n2 + 5] + gQ, 8, 26, 20, 188, false);
                }
                if (gT == 8 || gT == 9) {
                    n15 = gS;
                    n14 = -1;
                    if (gT == 9 && gQ == 3) {
                        n15 = 0;
                        n14 = 206 + gS - 1;
                    }
                    if (gT == 9 && gQ == 1) {
                        d.a(62, 57, n15, false);
                        cX.b(am, 9, 52, 59, 10);
                        cX.b(am, 11, 147, 59, 6);
                    } else {
                        am.setColor(d.aX());
                        am.fillRect(60, 53, 81, 12);
                        cX.b(am, 9, 56, 59, 10);
                        cX.b(am, 11, 144, 59, 6);
                        cX.b(1);
                        if (n14 != -1) {
                            cX.a(am, d.m(n14), 100, 59, 3);
                        } else {
                            cX.a(am, "" + n15, 100, 60, 3);
                        }
                    }
                } else if (gT == 10) {
                    if (gP == 2) {
                        cX.a(am, d.m(193) + d.o(d.H(gV * 10)) + "?", 8, 26, 20, 188, false);
                    }
                    d.aW();
                }
                cX.b(0);
            }
            if (gT >= 7 && gP == 0) {
                if (dn[gQ * 2 + 1] == 0) {
                    d.a(105, 106, gR, gT == 7, true, false);
                } else {
                    d.a(105, 106, gR, gT == 7, true, true);
                }
            }
            am.setClip(0, 0, 240, 320);
            n15 = (dl[n].length - 1) / 2;
            if ((dc & 0x40000) != 0) {
                am.setColor(0xDEDBDE);
                cX.b(0);
                for (int i = 0; i < n15; ++i) {
                    if (i != n15 - 1) {
                        am.drawLine((int)dl[n][2 * i + 2], 74, (int)dl[n][2 * i + 2], n4 - 1);
                    }
                    n13 = (dl[n][2 * i] + dl[n][2 * i + 2]) / 2;
                    cX.b(am, dl[n][2 * i + 1], n13 + 1, 80, 17);
                }
            }
            block17: for (int i = 0; i < dk[n2 + 1]; ++i) {
                int n16;
                if (i == gQ) {
                    if (gT <= 6) {
                        am.setColor(d.aX());
                        am.fillRect(dl[n][0] + 1, 73 + (i + 1) * dE, dl[n][n15 * 2] - dl[n][0] - 1, dE);
                    }
                    cX.b(1);
                } else {
                    cX.b(0);
                }
                n13 = dl[n][0] + 2;
                if (gP == 0) {
                    gN.a(8 + i);
                    d.gN.b = 80 + ((i + 1) * dE + 2);
                    d.gN.a = n13 + 15 + 4;
                    gN.a(am);
                    if (i != gQ && (dc & 0x40000) == 0) {
                        continue;
                    }
                } else if (i == gQ || (dc & 0x40000) != 0) {
                    cX.b(am, dk[n2 + 4] + i, n13, 80 + (i + 1) * dE, 20);
                }
                if (gP == 0) {
                    n13 = dl[n][4] - 2;
                    cX.a(am, d.o(dm[i * 2]), n13, 80 + (i + 1) * dE, 24);
                    n13 = (dl[n][4] + dl[n][6]) / 2;
                    cX.a(am, "" + dm[i * 2 + 1], n13, 80 + (i + 1) * dE, 17);
                    n13 = (dl[n][6] + dl[n][8]) / 2;
                    cX.a(am, "" + dn[i * 2 + 1], n13, 80 + (i + 1) * dE, 17);
                    n13 = dl[n][10] - 2;
                    if (dn[i * 2 + 1] > 0) {
                        if (dn[i * 2] > dm[i * 2]) {
                            cX.b(3);
                        } else if (dn[i * 2] < dm[i * 2]) {
                            cX.b(2);
                        }
                        cX.a(am, d.o(dn[i * 2]), n13, 80 + (i + 1) * dE, 24);
                        continue;
                    }
                    cX.a(am, "--", n13, 80 + (i + 1) * dE, 24);
                    continue;
                }
                if (gP == 1) {
                    if (i == gQ || (dc & 0x40000) != 0) {
                        n13 = dl[n][4] - 2;
                        cX.a(am, d.o(dm[i * 2] * 100), n13, 80 + (i + 1) * dE, 24);
                    }
                    n14 = dl[n][4] + 30;
                    n16 = 73 + (i + 1) * dE + 6 + 1;
                    switch (i) {
                        case 0: {
                            d.e(n14 - 8 + 8, n16 + 1 + 5, n14 + 4 + 15 + 8, n16 + 1);
                            break;
                        }
                        case 1: {
                            d.a(n14 - 20 + 5 - 2 - 2, n16 + 6, cw, false);
                            break;
                        }
                        case 2: {
                            d.b(n14 + 10, n16 + 7 + 10 - 1, n14 + 22 + 10 + 10 + 5, n16 + 2, 2);
                            break;
                        }
                        case 3: {
                            d.b(n14, n16 + 7 + 8, n14 + 22 + 10, n16 + 2, 3);
                            break;
                        }
                        case 4: {
                            d.b(n14 + 2, n16 + 7 + 8, n14 + 22 + 10 + 8 + 5 + 2, n16 + 2, 5);
                        }
                    }
                    continue;
                }
                if (i != gQ && (dc & 0x40000) == 0) continue;
                n14 = (dl[n][2] + dl[n][4]) / 2;
                n16 = 73 + (i + 1) * dE + 5;
                short s = dq[gV * 10 + 1];
                int n17 = A[0] * C[s - 1] / C[0] / A[1] * A[1];
                if (i == gQ && gT != 9) {
                    gS = dq[gV * 10 + 0 + i];
                }
                switch (i) {
                    case 0: {
                        cX.a(am, "" + dq[gV * 10 + 0], n14, n16, 17);
                        if (dq[gV * 10 + 0] >= n17) {
                            cX.b(3);
                            cX.b(am, 127, dl[n][n15 * 2] - 1, n16, 24);
                            continue block17;
                        }
                        if (dq[gV * 10 + 0] > A[1]) continue block17;
                        cX.b(3);
                        cX.b(am, 126, dl[n][2] + 1, n16, 20);
                        continue block17;
                    }
                    case 1: {
                        d.a(n14 - 22 - 15, n16 + 1 + 6, (int)s, false);
                        continue block17;
                    }
                    case 2: {
                        cX.a(am, "" + dq[gV * 10 + 2], n14, n16, 17);
                        continue block17;
                    }
                    case 3: {
                        cX.b(am, 206 + dq[gV * 10 + 3] - 1, n14, n16, 17);
                        continue block17;
                    }
                    case 4: {
                        cX.a(am, d.o(d.H(gV * 10)), n14, n16, 17);
                    }
                }
            }
        }
        cX.b(1);
        d.b(107, -1, 40);
        d.L();
        dc &= 0xFFF0FFFF;
    }

    static final void L() {
        if (gW != "") {
            am.setColor(0xFFFFFF);
            am.fillRect(10, 144, 220, 32);
            am.setColor(0);
            am.drawRect(10, 144, 220, 32);
            cX.b(0);
            cX.a(am, gW, 120, 160, 3, 220, false);
        }
    }

    private static void V(int n) {
        gX = at;
        gW = d.m(n);
    }

    private static boolean aZ() {
        if (cu == 2 && dq[cv * 10 + 5] == -1 || cu == 3 && !dB) {
            int n;
            int n2;
            d.f(113, 207);
            cX.b(1);
            if (cu == 2) {
                n2 = dp[cv * 5 + 0] * 100;
                boolean bl = false;
                d.a(110, 169, (int)dq[cv * 10 + 1], false);
                boolean bl2 = false;
                n = 192;
                cX.b(am, 185 + cv, 120, 151, 17);
                cX.a(am, d.o(n2), 100, 163, 24);
            } else {
                n2 = 25000;
                boolean bl = false;
                boolean bl3 = false;
                n = 209;
                cX.b(am, 210 + cv, 120, 151, 17);
                cX.a(am, d.o(25000), 115, 163, 17);
            }
            if (cx < n2) {
                cX.b(am, 164, 120, 121, 17);
                cX.b(am, 57, 120, 185, 17);
                if (an[6] < 0 || an[13] < 0 || an[1] < 0) {
                    cG = false;
                }
            } else {
                cX.b(am, n, 120, 121, 17);
                cX.b(am, 94 - Z * 2, 120, 185, 3);
                cX.b(am, 93 + Z * 2, 120, 198, 3);
                if (an[9] < 0 || an[3] < 0) {
                    Z ^= 1;
                } else if (an[6] < 0 || an[14] < 0) {
                    if (Z == 0) {
                        d.z(-n2);
                        if (cu == 2) {
                            d.dq[d.cv * 10 + 5] = (short)(aw / 1000L & 0xFFL);
                        } else {
                            dB = true;
                        }
                    } else {
                        cG = false;
                    }
                }
            }
        } else {
            cG = false;
            dC = false;
            d.t(8);
            dc = 983040;
            return true;
        }
        return false;
    }

    private static void a(int n, int n2, int n3, boolean bl, boolean bl2, boolean bl3) {
        if (cu == 3) {
            dJ = 56;
            dK = 272;
            dI = 14;
            dG = 70;
            dH = 38;
            dF = 85;
        } else {
            dJ = 18;
            dK = 320 - dI + 4;
            dG = 62;
            dI = 14;
            dF = 63;
            dH = 120 - dF - 1;
        }
        int n4 = dH;
        if (n3 == 0) {
            if (bl) {
                am.setColor(d.aX());
            } else {
                am.setColor(5347813);
            }
        } else if (bl2) {
            am.setColor(3172795);
        } else {
            am.setColor(0x444444);
        }
        am.fillRect(n4, 320 - dJ, dG, dI);
        if (n3 == 1) {
            if (bl) {
                am.setColor(d.aX());
            } else {
                am.setColor(5347813);
            }
        } else if (bl3) {
            am.setColor(3172795);
        } else {
            am.setColor(0x444444);
        }
        am.fillRect(n4 + dF + 6, 320 - dJ, dG, dI);
        am.setColor(0);
        am.drawRect(n4, 320 - dJ, dG, dI);
        am.drawRect(n4 + dF + 6, 320 - dJ, dG, dI);
        am.setColor(3242445);
        am.drawLine(n4 + 1, 320 - dJ + dI + 1, n4 + dG + 1, 320 - dJ + dI + 1);
        am.drawLine(n4 + dG + 1, 320 - dJ + 1, n4 + dG + 1, 320 - dJ + dI);
        am.drawLine(n4 + dF + 1 + 6, 320 - dJ + dI + 1, n4 + dF + dG + 1 + 6, 320 - dJ + dI + 1);
        am.drawLine(n4 + dF + dG + 1 + 6, 320 - dJ + 1, n4 + dF + dG + 1 + 6, 320 - dJ + dI);
        cX.b(1);
        cX.b(am, n, n4 + dG / 2, dK, 3);
        cX.b(am, n2, n4 + dF + 6 + dG / 2, dK, 3);
    }

    public static final boolean M() {
        int n = 0;
        for (int i = 0; i < 7; ++i) {
            if (dD[i * dA + du] > 0 || w[i * 3 + 2] > cy) continue;
            ++n;
        }
        return n > 0;
    }

    private static int ba() {
        if (dP >= 0 || eI != 0) {
            return -1;
        }
        if (eJ < 0) {
            return -1;
        }
        int n = eJ * 30;
        int n2 = n + 30;
        for (int i = n; i < n2; ++i) {
            int n3;
            int n4;
            int n5 = (gY[i / 4] & 0xFF) >> i % 4 * 2 & 3;
            if ((n5 & 1) != 1 || !cd.c(n4 = d.i(dL[i - n][3], dL[i - n][2]), n3 = d.j(dL[i - n][3], dL[i - n][2]), n4 + 6144, n3 + 6144)) continue;
            fb = true;
            return i - n;
        }
        return -1;
    }

    private static void bb() {
        if (dP < 0 || eI != 0) {
            return;
        }
        Object var0 = null;
        if (el > 0) {
            if (!ee || ew == "") {
                el -= 100;
            }
            if (dR == 72) {
                if (el <= 0) {
                    d.bi();
                    ep = true;
                }
                return;
            }
            if (el <= 0) {
                d.N();
                return;
            }
        }
        switch (dR) {
            case 1: 
            case 16: 
            case 32: {
                d.bn();
                return;
            }
            case 3: {
                if (er == null) {
                    em = -1;
                    return;
                }
                d.bn();
                if (d.er.j[0] > d.er.j[1]) break;
                em = d.er.j[0];
                eo = d.er.j[1];
                en = d.m(72);
                dc |= 0x20;
                return;
            }
            case 4: {
                if (!cA) {
                    em = d.er.j[0];
                    eo = d.er.j[1];
                    en = d.m(72);
                    dc |= 0x20;
                    return;
                }
                if (em <= 0 || (em -= 100) > 0) break;
                d.b(d.er.a, d.er.b, 100, 60000, null);
                if (er != null) {
                    er.a(7, null);
                }
                if (d.cd.j[0] <= 0) {
                    d.N();
                    return;
                }
                em = -1;
                d.bi();
                return;
            }
            case 48: {
                int n = cd.b(er);
                dc |= 0x20;
                if (n < 5400) {
                    em -= 100;
                    en = d.m(68);
                } else if (n < 33750) {
                    if (em - 50 > eo / 2) {
                        em -= 50;
                    } else if (em + 50 < eo / 2) {
                        em += 50;
                    }
                    en = d.m(67);
                } else if (en != null && en.compareTo(d.m(70)) != 0) {
                    em += 25;
                    em = Math.min(em, eo);
                    en = d.m(69);
                }
                if (em > 0 && em != eo && ((d.cd.e & 0x200000) == 0 || (d.er.e & 0x200000) == 0)) break;
                d.N();
                return;
            }
        }
    }

    private static boolean bc() {
        Object var0 = null;
        switch (dR) {
            case 8: {
                return d.bd() && cd.c(dS, dT, dS + (dU << 8), dT + (dV << 8));
            }
            case 1: 
            case 3: 
            case 4: 
            case 16: 
            case 32: {
                return d.bd() && er == null;
            }
            case 24: {
                if (!d.bd()) {
                    return false;
                }
                b b2 = ff[0];
                while (b2 != null) {
                    if (b2.i[0] == 2 && (b2.e & 0x800) != 0) {
                        return false;
                    }
                    b2 = b2.o;
                }
                return true;
            }
            case 48: {
                if (d.er.i[16] >= bk[d.er.i[2]].length && d.bd()) {
                    em = -1;
                    en = "";
                    return true;
                }
                return false;
            }
            case 168: {
                b b3 = ff[2];
                while (b3 != null) {
                    if ((b3.e & 0x800) != 0 && (b3.e & 0x1000) == 0) {
                        return false;
                    }
                    b3 = b3.o;
                }
                return true;
            }
            case 2: {
                if (!d.bd()) {
                    return false;
                }
                b b4 = ff[2];
                while (b4 != null) {
                    if ((b4.e & 0x800) != 0) {
                        return false;
                    }
                    b4 = b4.o;
                }
                return true;
            }
            case 88: {
                if (cd.c(dS, dT, dS + (dU << 8), dT + (dV << 8))) {
                    eg = (byte)(eg + (bk[ef][eg + 0] + 1));
                    int n = 0;
                    while (ek[n] != cd) {
                        ++n;
                    }
                    d.ej[n] = eg;
                    if (eg >= bk[ef].length) {
                        return true;
                    }
                    d.bg();
                    d.a(d.m(98), 1, true);
                    dY = dS;
                    dZ = dT;
                    ea = dU;
                    eb = dV;
                    d.bm();
                }
                return false;
            }
            case 112: {
                cd.f(0);
                cd.e();
                if (bE < 0) {
                    d.cd.e &= 0xFFFFFFE7;
                    d.cd.e |= 8;
                }
                if (d.bB()) {
                    ec = false;
                    bT = false;
                    dc = 255;
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    private static boolean bd() {
        return !((dX & 2) == 2 && cA || (dX & 1) == 1 && !cA || (dX & 4) == 4 && cd.r() != 0 || (dX & 8) == 8 && cw > 0) && ((dX & 0x10) != 16 || d.cd.i[0] == 3 && (d.cd.e & 0x800) != 0);
    }

    private static void be() {
        ++eq;
        if (ee || eI != 0 || eJ < 0) {
            return;
        }
        if (dP >= 0) {
            if (dR == 40 || dR == 4 || dR == 8 || dR == 88) {
                int n = dS >> 8;
                int n2 = dT >> 8;
                if ((n += bI) < 240 && n + dU >= 0 && (n2 += bJ) < 276 && n2 + dV >= 18) {
                    if (dW != 255 && dW != -1) {
                        if (eq % 10 != 0) {
                            cU.a(6 + (dW >> 2));
                            for (int i = 0; i < 4; ++i) {
                                if (dW == 0) {
                                    d.cU.a = n + dU;
                                    d.cU.b = n2 + (2 * i + 1) * dV / 8;
                                } else if (dW == 8) {
                                    d.cU.a = n;
                                    d.cU.b = n2 + (2 * i + 1) * dV / 8;
                                } else if (dW == 4) {
                                    d.cU.a = n + (2 * i + 1) * dU / 8;
                                    d.cU.b = n2;
                                } else {
                                    d.cU.a = n + (2 * i + 1) * dU / 8;
                                    d.cU.b = n2 + dV;
                                }
                                cU.a(am);
                            }
                        }
                    } else {
                        int n3;
                        if (er != null && (d.er.e & 0x800) != 0 && er != cd) {
                            am.setColor(0xFFFF00);
                        } else {
                            n3 = d.j(eq * 6 & 0xFF) * 255 / 256;
                            am.setColor(255, 127 + n3 / 3, 255);
                        }
                        for (n3 = 0; n3 < 3; ++n3) {
                            am.drawArc(n - 1 + n3, n2 - 1 + dV / 4 + n3, dU + 2 - n3 * 2, dV / 2 + 2 - n3 * 2, 0, 360);
                        }
                    }
                }
                n = (dY >> 8) + bI;
                n2 = (dZ >> 8) + bJ;
                if (n < 240 && n + ea >= 0 && n2 < 276 && n2 + eb >= 18) {
                    if (eq == 1 || eq == 3) {
                        am.setColor(0xFFFFFF);
                        if (dR == 8 && (dX & 2) != 0 && (dX & 4) == 0 || dR == 88) {
                            am.fillRect(n, n2, ea, eb);
                            return;
                        }
                        am.fillArc(n - 1, n2 - 1 + eb / 4, ea + 2, eb / 2 + 2, 0, 360);
                        return;
                    }
                    if (eq > 2) {
                        dY = -1;
                        dZ = -1;
                        return;
                    }
                }
            }
        } else {
            int n = eJ * 30;
            int n4 = n + 30;
            for (int i = n; i < n4; ++i) {
                int n5;
                int n6 = (gY[i / 4] & 0xFF) >> i % 4 * 2;
                if ((n6 & 1) != 1) continue;
                short s = dL[i - n][3];
                short s2 = dL[i - n][2];
                int n7 = d.i(s, s2) >> 8;
                int n8 = d.j(s, s2) >> 8;
                boolean bl = false;
                boolean bl2 = false;
                n7 += (d.k(s, s2) - 24) / 2;
                n8 += (d.l(s, s2) - 12) / 2;
                if ((n7 += bI) > 240 || n7 + 26 + 2 < 0 || (n8 += bJ) > 276 || n8 + 14 + 2 < 18) continue;
                int n9 = d.j(eq * 6 & 0xFF) * 255 / 256;
                am.setColor(127 + n9 / 2, 191 + n9 / 4, 255);
                if (T == 10) {
                    am.fillRect(n7, n8, 26, 14);
                    continue;
                }
                for (n5 = 0; n5 < 3; ++n5) {
                    am.drawArc(n7 + n5, n8 + n5 + 6, 26 - n5 * 2, 14 - n5 * 2, 0, 360);
                }
                n5 = dL[i - n][4];
                if (n5 < 0) continue;
                boolean bl3 = false;
                n9 = 16 * d.j(eq * 10 & 0xFF) / 3;
                cU.a(n5 += 2);
                d.cU.a = n7 + 13;
                d.cU.b = (n8 -= (n9 >> 8) + 32) + 14 + 12;
                cU.a(am);
            }
        }
    }

    private static void bf() {
        if (ee || eI != 0 || eJ < 0 || cB || cE) {
            return;
        }
        if (dP >= 0) {
            if (dR == 40 || dR == 4 || dR == 8 || dR == 88) {
                am.setColor(0xFF00FF);
                am.setClip(0, 0, 240, 320);
                d.a((dS >> 8) - cO + dU / 2, (dT >> 8) - cP + dV / 2, true);
                int n = (int)((au & 0xFL) * 255L / 15L);
                am.setColor(n, 0, n);
                d.a(dS + (dU / 2 << 8), dT + (dV / 2 << 8) - 6144, true, false, false, true);
                if (dR != 40) {
                    return;
                }
            }
            if (er != null && (d.er.e & 0x800) != 0) {
                if (dR == 1 || dR == 2 || dR == 3) {
                    am.setColor(0xFF0000);
                } else {
                    am.setColor(0xFFFF00);
                }
                am.setClip(0, 0, 240, 320);
                int n = er.m();
                int n2 = er.n();
                d.a((n >> 8) - cO, (n2 >> 8) - cP, true);
                int n3 = (int)((au & 0xFL) * 255L / 15L);
                if (dR == 1 || dR == 2 || dR == 3) {
                    am.setColor(n3, 0, 0);
                } else {
                    am.setColor(n3, n3, 0);
                }
                d.a(n, n2 - 6144, false, false, false, dR != 40);
                return;
            }
            if (dR == 96 || dR == 144) {
                return;
            }
            boolean bl = false;
            boolean bl2 = false;
            for (int i = 0; i < 4; ++i) {
                b b2 = ff[i];
                while (b2 != null) {
                    if ((b2.e & 0x800) == 2048 && b2 != cd) {
                        if (dR == 2 && b2.i[0] == 8 || dR == 3) {
                            am.setColor(0xFF0000);
                        } else {
                            am.setColor(0xFFFF00);
                        }
                        am.setClip(0, 0, 240, 320);
                        int n = b2.m();
                        int n4 = b2.n();
                        d.a((n >> 8) - cO, (n4 >> 8) - cP, true);
                        int n5 = (int)((au & 0xFL) * 255L / 15L);
                        if (dR == 2 && b2.i[0] == 8 || dR == 3) {
                            am.setColor(n5, 0, 0);
                        } else {
                            am.setColor(n5, n5, 0);
                        }
                        d.a(n, n4 - 6144, false, false, false, !bl2 && dR != 40);
                        if (!bl2) {
                            bl2 = true;
                        }
                    }
                    b2 = b2.o;
                }
            }
        } else {
            int n = eJ * 30;
            int n6 = n + 30;
            for (int i = n; i < n6; ++i) {
                int n7 = (gY[i / 4] & 0xFF) >> i % 4 * 2;
                if ((n7 & 1) != 1) continue;
                short s = dL[i - n][3];
                short s2 = dL[i - n][2];
                int n8 = d.i(s, s2) >> 8;
                int n9 = d.j(s, s2) >> 8;
                am.setColor(41215);
                am.setClip(0, 0, 240, 320);
                d.a(n8 - cO, n9 - cP, true);
                d.a(n8 + 12 << 8, n9 + 12 << 8, false, true, i - n >= 20, false);
            }
        }
    }

    public static final void a(b b2) {
        if (b2.i[16] >= bk[b2.i[2]].length && b2.i[16] > eg) {
            eh = (byte)127;
        }
        d.bg();
    }

    private static void bg() {
        byte by;
        for (by = 0; by < 3; ++by) {
            for (int i = by + 1; i < 4; ++i) {
                if (ej[by] >= ej[i]) continue;
                byte by2 = ej[by];
                d.ej[by] = ej[i];
                d.ej[i] = by2;
                b b2 = ek[by];
                d.ek[by] = ek[i];
                d.ek[i] = b2;
            }
        }
        for (by = 0; by < 4; ++by) {
            if (ek[by] == cd || eh >= ej[by]) continue;
            eh = ej[by];
        }
        by = 0;
        while (ek[by] != cd) {
            by = (byte)(by + 1);
        }
        if (ei != by) {
            ei = by;
            dc |= 4;
        }
    }

    public static final void a(b b2, int n) {
        int n2;
        if (et > 0) {
            for (n2 = 0; n2 < et; ++n2) {
                if (n == 1) {
                    eu[n2].a(1, b2);
                    d.eu[n2].e &= 0xFFDFFEFF;
                    continue;
                }
                if (n == 2) {
                    eu[n2].a(514, b2);
                    eu[n2].c();
                    continue;
                }
                if (n != 4 || cp == null || (d.cp.e & 0x800) != 2048 && d.cp.i[6] != 6 && d.cp.i[6] != 5) continue;
                eu[n2].a((byte)3, cp);
            }
        }
        if (dP < 0) {
            return;
        }
        if (et > 0 && b2.j[0] <= 0) {
            for (n2 = 0; n2 < et; ++n2) {
                if (b2 != eu[n2] || (b2.e & 0x800) == 0) continue;
                d.N();
                return;
            }
        }
        if ((b2.e & 0x1000) == 4096 && b2.j[0] <= 0) {
            d.N();
            return;
        }
        if (ee && (b2.i[6] == 2 || b2.i[6] == 3) && b2.j[0] <= 0) {
            d.N();
            return;
        }
        if (eI != 0) {
            return;
        }
        short[] sArray = dL[dP];
        int n3 = dQ + 1;
        if (b2 == cd) {
            if (ed && n == 7) {
                d.N();
                return;
            }
            switch (n) {
                case 1: {
                    if (dR != 32 || (b2.e & 0x800) == 0) break;
                    er = null;
                    d.bi();
                    return;
                }
                case 2: {
                    if (dR != 4 || (b2.e & 0x4000) == 0 || !b2.c(dS, dT, dS + (dU << 8), dT + (dV << 8))) break;
                    em = 7000;
                    eo = 7000;
                    en = d.m(66);
                    b2.e |= 4;
                    dc |= 0x20;
                }
            }
        }
        if ((b2.e & 0x800) == 0) {
            return;
        }
        if (ed) {
            if (n == 7) {
                for (int i = 0; i < ek.length; ++i) {
                    if (ek[i] != b2) continue;
                    d.ek[i] = null;
                    d.ej[i] = -1;
                    d.bg();
                }
            }
            return;
        }
        switch (dR) {
            case 8: {
                if (b2.i[0] != 5 || b2.j[0] > 0 || (sArray[n3 + 1] & 2) != 2) break;
                d.N();
                return;
            }
            case 1: 
            case 2: {
                short s;
                if (b2.j[0] > 0) break;
                if (b2 == er) {
                    er = null;
                }
                if (!(((s = sArray[n3 + 1]) & 2) == 2 && cA || (s & 1) == 1 && !cA) && ((s & 0x10) != 16 || d.cd.i[0] == 3 && (d.cd.e & 0x800) != 0)) break;
                d.N();
                return;
            }
            case 4: 
            case 32: 
            case 40: 
            case 48: {
                if ((b2.e & 3) != 3 || b2.j[0] > 0) break;
                if (b2 == er) {
                    er = null;
                }
                d.N();
            }
        }
    }

    private static void bh() {
        dQ = 0;
        eI = 0;
        el = 0;
        es = 0;
        dR = dL[dP][1];
        int n = dP + eJ * 30;
        int n2 = n / 4;
        if (n == 1) {
            cH = 1;
        }
        int n3 = n2;
        gY[n3] = (byte)(gY[n3] & ~(3 << n % 4 * 2));
        int n4 = n2;
        gY[n4] = (byte)(gY[n4] | 3 << n % 4 * 2);
        dY = -240;
        dZ = -320;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void W(int n) {
        short[] sArray = dM[n];
        b b2 = null;
        int n2 = 0;
        int n3 = 0;
        short s = 0;
        int n4 = 0;
        while (true) {
            block52: {
                if (n4 >= sArray.length) {
                    return;
                }
                s = sArray[n4];
                switch (sArray[++n4]) {
                    case 0: {
                        n2 = (d.i(sArray[n4 + 3], sArray[n4 + 2]) >> 8) + d.k(sArray[n4 + 3], sArray[n4 + 2]) / 2;
                        n3 = (d.j(sArray[n4 + 3], sArray[n4 + 2]) >> 8) + d.l(sArray[n4 + 3], sArray[n4 + 2]) / 2;
                        b2 = d.M(3);
                        short s2 = fl[sArray[n4 + 1] * 3];
                        int n5 = fl[sArray[n4 + 1] * 3 + 1];
                        b2.a((byte)5, n2, n3, bB[s2], n5, (byte)1, 2051, 3300, 500, 40, -1);
                        b2.i(sArray[n4 + 4]);
                        if (sArray[n4 + 1] == 0) {
                            b2.e |= 0x20;
                        }
                        b2.i[8] = (byte)sArray[n4 + 5];
                        if (sArray[n4 + 6] == 1) {
                            b2.e |= 4;
                        } else if (sArray[n4 + 6] == 2) {
                            b2.e |= 0x4000;
                            b2.j[1] = 35;
                            b2.j[0] = 35;
                        } else if (sArray[n4 + 6] == 3) {
                            b2.j[1] = 400;
                            b2.j[0] = 400;
                            b2.e |= 0x10000;
                        } else if (sArray[n4 + 6] == 4) {
                            b2.e |= 0x8000;
                        } else if (sArray[n4 + 6] == 5) {
                            b2.j[1] = 32000;
                            b2.j[0] = 32000;
                            b2.e |= 4;
                        }
                        b2.i[14] = (byte)sArray[n4 + 1];
                        b2.e |= 0x100000;
                        d.g(b2);
                        break;
                    }
                    case 1: {
                        int n6;
                        int n7;
                        int n8;
                        int n9;
                        short s2 = fl[sArray[n4 + 1] * 3];
                        int n5 = fl[sArray[n4 + 1] * 3 + 1];
                        b2 = d.M(3);
                        b2.a((byte)6, -1, n3, bB[s2], n5, (byte)1, 2051, 3300, 500, 40, sArray[n4 + 5]);
                        if (sArray[n4 + 1] == 0) {
                            b2.e |= 0x20;
                        }
                        b2.i[6] = (byte)sArray[n4 + 6];
                        short s3 = sArray[n4 + 3];
                        short s4 = sArray[n4 + 2];
                        int n10 = -1;
                        int n11 = sArray[n4 + 4] >> 2 ^ 2;
                        boolean bl = false;
                        int n12 = 0;
                        if (s3 >= 0 && s4 >= 0) {
                            n10 = aY[s3][s4 * 7 + 2];
                            b2.i(sArray[n4 + 4]);
                            b2.f(s3, s4, n11);
                        } else {
                            b2.i(sArray[n4 + 4]);
                            b2.h(s3, s4);
                        }
                        b2.e();
                        b2.i[15] = b2.i[1];
                        b2.g(s3, s4, n11);
                        b2.k = 256 - b2.i[1] * 16 << 8;
                        if (ed) {
                            n9 = Math.min(b2.j[4], b2.j[5]);
                            n8 = Math.max(b2.j[4], b2.j[5]);
                            int n13 = b.B[b2.i[1] * 2] > 0 ? 1 : (n7 = b.B[b2.i[1] * 2] == 0 ? 0 : -1);
                            n6 = b.B[b2.i[1] * 2 + 1] > 0 ? 1 : (b.B[b2.i[1] * 2 + 1] == 0 ? 0 : -1);
                            b2.a += n7 * (es + 2) * (n8 <<= 1);
                            b2.b += n6 * (es + 2) * n8;
                            if ((es & 1) != 0) {
                                b2.a += n6 * (n9 * 3) / 2;
                                b2.b += n7 * (n9 * 3) / 2;
                            }
                            b2.j[6] = (short)(b2.j[6] + (1 - es) * (b2.j[6] / 10));
                            b2.j[7] = (short)(b2.j[7] - (es - 1) * (b2.j[7] / 10));
                            d.ek[d.es] = b2;
                        } else if (n10 != -1 && (n10 & 2 << n11 * 2) != 0) {
                            int n14;
                            short s5 = b.e(s3, s4, n11);
                            n9 = s5;
                            n8 = (byte)(s5 >>> 8);
                            short s6 = (short)(n9 & 0xFF);
                            n9 = s6;
                            if (s6 < 0 || n8 < 0) {
                                n6 = 0;
                                n14 = 0;
                                n12 = 5;
                            } else {
                                n6 = b.a(n8, n9, n11, 0) - b2.a;
                                n14 = b.b(n8, n9, n11, 0) - b2.b;
                                n12 = 0;
                            }
                            block14: do {
                                b2.a += n6 * n12 / 5;
                                b2.b += n14 * n12 / 5;
                                n7 = 0;
                                b b3 = ff[3];
                                while (b3 != null) {
                                    if (b3 != b2 && b3.c(b2)) {
                                        n7 = 1;
                                        continue block14;
                                    }
                                    b3 = b3.o;
                                }
                            } while (++n12 <= 5 && n7 != 0);
                        }
                        b2.i[8] = (byte)sArray[n4 + 5];
                        b2.i[14] = (byte)sArray[n4 + 1];
                        d.g(b2);
                        break;
                    }
                    case 2: 
                    case 3: {
                        n2 = (d.i(sArray[n4 + 4], sArray[n4 + 3]) >> 8) + d.k(sArray[n4 + 4], sArray[n4 + 3]) / 2;
                        n3 = (d.j(sArray[n4 + 4], sArray[n4 + 3]) >> 8) + d.l(sArray[n4 + 4], sArray[n4 + 3]) / 2;
                        b2 = d.M(2);
                        if (sArray[n4] == 2) {
                            b2.a((byte)8, n2, n3, bB[sArray[n4 + 1]], sArray[n4 + 2], (byte)1, 2049, c[0], 85, 35, sArray[n4 + 7]);
                        } else {
                            b2.a((byte)8, n2, n3, bB[sArray[n4 + 1]], sArray[n4 + 2], (byte)1, 6145, c[0], 85, 35, sArray[n4 + 7]);
                        }
                        b2.i[3] = (byte)sArray[n4 + 5];
                        b2.a(d.a(1, d.bB[2].o >> 1));
                        if (b2.i[2] >= 0) {
                            b2.l();
                        }
                        if (b2.i[3] > 0) {
                            b2.i[8] = (byte)(b2.i[3] - 1);
                        }
                        b2.a((byte)sArray[n4 + 6], cd);
                        if (sArray[n4 + 6] != 2) break;
                        b2.e &= 0xFFFFF7FF;
                        if (ee) break;
                        b2.j[7] = 1792;
                        break;
                    }
                    case 4: {
                        n2 = (d.i(sArray[n4 + 4], sArray[n4 + 3]) >> 8) + d.k(sArray[n4 + 4], sArray[n4 + 3]) / 2;
                        n3 = (d.j(sArray[n4 + 4], sArray[n4 + 3]) >> 8) + d.l(sArray[n4 + 4], sArray[n4 + 3]) / 2;
                        b2 = d.M(0);
                        b2.a((byte)2, n2, n3, bB[sArray[n4 + 1]], (int)sArray[n4 + 2], (byte)0, 2048);
                        b2.j[9] = sArray[n4 + 5];
                        if (b2.i[12] != 6 || cx < b2.j[9]) break;
                        b2.j[9] = 100;
                        break;
                    }
                    case 5: {
                        b2 = ff[2];
                        while (b2 != null) {
                            if ((b2.e & 0x800) != 0 && b2.g == sArray[n4 + 1]) {
                                er = b2;
                                break;
                            }
                            b2 = b2.o;
                        }
                        if (b2 == null) {
                            b2 = ff[3];
                            while (b2 != null) {
                                if ((b2.e & 0x800) != 0 && b2.g == sArray[n4 + 1]) {
                                    er = b2;
                                    break;
                                }
                                b2 = b2.o;
                            }
                        }
                        if (b2 != null) {
                            b2.i[2] = (byte)sArray[n4 + 2];
                            if (b2.i[0] == 5) {
                                b2.i[0] = 6;
                            }
                            b2.i[16] = 0;
                        }
                        break block52;
                    }
                    case 6: 
                    case 7: {
                        int n5;
                        short s2 = 0;
                        block18: for (n5 = 0; n5 < 4 && s2 == 0; ++n5) {
                            b2 = ff[n5];
                            while (b2 != null) {
                                if ((b2.e & 0x800) != 0 && b2.g == sArray[n4 + 1]) {
                                    b2.e = sArray[n4] == 7 ? (b2.e &= 0xFFFFEFFF) : (b2.e &= 0xFFFFE7FF);
                                    s2 = 1;
                                    continue block18;
                                }
                                b2 = b2.o;
                            }
                        }
                        break block52;
                    }
                    case 12: {
                        fb = sArray[n4 + 1] == 1;
                        break;
                    }
                    case 8: {
                        fi = sArray[n4 + 1];
                        break;
                    }
                    case 9: {
                        fj = sArray[n4 + 1];
                        break;
                    }
                    case 10: {
                        hg = sArray[n4 + 1];
                        break;
                    }
                    case 11: {
                        cw = sArray[n4 + 1];
                        gK = cw > 0 ? f[cw - 1] : 0;
                        dc |= 0x10;
                    }
                }
                if (b2 != null && (b2.e & 0x800) != 0) {
                    ++es;
                    b2.g = b2.g;
                }
            }
            n4 += s;
        }
    }

    public static final b d(int n, int n2, int n3) {
        b b2 = ff[n];
        while (b2 != null) {
            if ((n2 < 0 || b2.i[0] == n2) && (b2.e & 0x800) == 2048 && b2.g == n3) {
                return b2;
            }
            b2 = b2.o;
        }
        return null;
    }

    private static void bi() {
        d.bj();
        if ((dR & 7) != 0) {
            d.r(17);
        }
    }

    private static void bj() {
        if (dP < 0) {
            return;
        }
        dQ += dL[dP][dQ] + 1;
        int n = dQ + 1;
        if (ed && (eh > eg || eh == 127)) {
            Z = 0;
            d.N();
            return;
        }
        if (n > dL[dP].length) {
            if (ed) {
                cd.f(0);
            }
            d.bk();
            return;
        }
        short[] sArray = dL[dP];
        int n2 = dR;
        dR = sArray[n];
        dX = n + 1 < dL[dP].length ? sArray[n + 1] : (short)0;
        switch (dR) {
            case 8: {
                d.A(sArray[n + 3], sArray[n + 2]);
                er = null;
                break;
            }
            case 16: {
                er = d.d(0, 2, sArray[n + 2]);
                d.bn();
                break;
            }
            case 32: {
                er = d.d(3, -1, sArray[n + 1]);
                if (er == null) {
                    d.N();
                    return;
                }
                d.bn();
                break;
            }
            case 40: {
                d.A(sArray[n + 3], sArray[n + 2]);
                er = null;
                break;
            }
            case 4: {
                d.A(sArray[n + 3], sArray[n + 2]);
                if (er == null || d.er.i[0] != 3) {
                    b b2 = ff[3];
                    while (b2 != null) {
                        if ((b2.e & 0x800) == 2048 && (b2.e & 0x4000) != 0) {
                            er = b2;
                            break;
                        }
                        b2 = b2.o;
                    }
                }
                em = d.er.j[0];
                eo = d.er.j[1];
                en = d.m(72);
                break;
            }
            case 48: {
                if (er == null) {
                    er = d.d(3, -1, sArray[n + 2]);
                }
                em = 1500;
                eo = em * 2;
                en = d.m(70);
                break;
            }
            case 1: {
                er = d.d(2, -1, sArray[n + 2]);
                d.bn();
                break;
            }
            case 192: {
                aa = true;
                d.bj();
                return;
            }
            case 2: 
            case 24: {
                er = null;
                dS = -65535;
                dT = -65535;
                break;
            }
            case 3: {
                er = d.d(3, -1, sArray[n + 2]);
                if (er == null) {
                    d.bj();
                    break;
                }
                d.er.e |= 4;
                d.bn();
                break;
            }
            case 56: {
                if (el <= 0) {
                    el = 0;
                    eo = 0;
                }
                el += sArray[n + 1] * 1000;
                if (em < 0) {
                    eo += sArray[n + 1] * 1000;
                    en = d.m(sArray[n + 2]);
                }
                d.bj();
                break;
            }
            case 64: {
                el = 0;
                em = -1;
                d.bj();
                break;
            }
            case 72: {
                el = sArray[n + 1] * 1000;
                em = -1;
                en = "";
                eo = 0;
                ep = false;
                break;
            }
            case 80: {
                ef = sArray[n + 2];
                eg = 0;
                eh = (byte)-1;
                d.bm();
                if (dP % 30 >= 20) {
                    cF = true;
                    bD = 0;
                    return;
                }
                d.P();
                ed = true;
                cg = cf;
                d.t(6);
                return;
            }
            case 88: {
                el = 4000;
                eh = (byte)-1;
                break;
            }
            case 168: {
                eo = el = sArray[n + 1] * 1000;
                em = -1;
                en = d.m(74);
                break;
            }
            case 160: {
                d.cd.e = 2;
                cq = null;
                cp = null;
                dc = 255;
                fW = d.i(sArray[n + 3], sArray[n + 2]);
                fX = d.j(sArray[n + 3], sArray[n + 2]);
                d.cd.a = fW + 61440;
                d.cd.b = fX + 70656;
                fU = (fW + d.cd.a >> 8) / 2;
                fV = (fX + d.cd.b >> 8) / 2;
                d.aC();
                fU = fW >> 8;
                fV = fX >> 8;
                d.cd.a = d.i(sArray[n + 5], sArray[n + 4]) + (d.k(sArray[n + 5], sArray[n + 4]) / 2 << 8);
                d.cd.b = d.j(sArray[n + 5], sArray[n + 4]) + (d.l(sArray[n + 5], sArray[n + 4]) / 2 << 8);
                ee = true;
                d.a(84, 102, 72, 72, 5, 2, 3000, 500);
                d.bj();
                break;
            }
            case 96: {
                bD = n2 == 96 || n2 == 144 ? 8 : 0;
                ew = d.m(sArray[n + 1]);
                ey = 0;
                if (!ee) {
                    cS = sArray[n + 2];
                    break;
                }
                cS = 1;
                break;
            }
            case 144: {
                bD = n2 == 96 || n2 == 144 ? 8 : 0;
                eC = d.m(sArray[n + 1]);
                eD = d.m(sArray[n + 2]);
                eE = d.m(sArray[n + 3]);
                eF = sArray[n + 4];
                cS = sArray[n + 5];
                break;
            }
            case 128: {
                eA = sArray[n + 1];
                ez = sArray[n + 2];
                eH = sArray[n + 4];
                eB = eH < 10 ? d.m(sArray[n + 3]) + "\n'" + eH + "'" : d.m(sArray[n + 3]) + "\n'#'";
                de = sArray[n + 3] == 80;
                d.bj();
                break;
            }
            case 112: {
                hu = sArray[n + 1];
                hv = -1;
                d.bC();
                ec = true;
                cd.f(0);
                d.cd.e &= 0xFFFFFE3F;
                cd.e();
                break;
            }
            case 176: {
                d.W(sArray[n + 1]);
                d.bj();
                break;
            }
            case 184: {
                d.z(-Math.min(sArray[n + 1] * 1000, cx));
                d.h(true);
                d.bj();
            }
        }
        dc |= 0x20;
    }

    private static void bk() {
        if (eI == 0) {
            int n;
            int n2;
            short[] sArray = dN[dP];
            if (dP == eF && eF != 0) {
                n2 = 1 + eJ * 30;
                int n3 = n = n2 / 4;
                gY[n3] = (byte)(gY[n3] & ~(3 << n2 % 4 * 2));
                int n4 = n;
                gY[n4] = (byte)(gY[n4] | 2 << n2 % 4 * 2);
            }
            n2 = dP + eJ * 30;
            int n5 = n = n2 / 4;
            gY[n5] = (byte)(gY[n5] & ~(3 << n2 % 4 * 2));
            int n6 = n;
            gY[n6] = (byte)(gY[n6] | 2 << n2 % 4 * 2);
            eI = 1;
            if (dP == 0 && n == 0) {
                ch = bm[cf * 11 + 6];
                ci = bm[cf * 11 + 5];
            }
            dP = -1;
            ex = "";
            short s = 0;
            block9: for (int i = 0; i < sArray.length; i += s) {
                s = sArray[i];
                switch (sArray[++i]) {
                    case 0: {
                        d.e(6, sArray[i + 1]);
                        eI = sArray[i + 1];
                        continue block9;
                    }
                    case 2: {
                        d.e(sArray[i + 1], 1);
                        continue block9;
                    }
                    case 3: {
                        short s2 = sArray[i + 1];
                        int n7 = s2 / 4;
                        gY[n7] = (byte)(gY[n7] & ~(3 << s2 % 4 * 2));
                        int n8 = s2 / 4;
                        gY[n8] = (byte)(gY[n8] | 1 << s2 % 4 * 2);
                        continue block9;
                    }
                    case 4: {
                        short s2 = sArray[i + 1];
                        int n9 = s2 / 4;
                        gY[n9] = (byte)(gY[n9] & ~(3 << s2 % 4 * 2));
                        continue block9;
                    }
                    case 5: {
                        d.gZ[sArray[i + 1]] = 1;
                        d.B(cI, d.p(d.cd.a, d.cd.b));
                        continue block9;
                    }
                    case 6: {
                        gK = 0;
                        cw = 0;
                        dc |= 0x10;
                        continue block9;
                    }
                    case 7: {
                        dd = sArray[i + 1] > 0;
                    }
                }
            }
            el = 5000;
            d.bl();
        }
    }

    static final void N() {
        if (eI == 0) {
            eI = -1;
            el = 5000;
            ew = "";
            eB = "";
            ex = "";
            ey = 0;
            d.bl();
        }
    }

    private static void bl() {
        for (int i = 0; i < 4; ++i) {
            b b2 = ff[i];
            while (b2 != null) {
                if ((b2.e & 0x800) != 0) {
                    b2.e &= 0xFFFFF7FF;
                    b2.g = -1;
                }
                b2 = b2.o;
            }
        }
        er = null;
        em = -1;
        ec = false;
        bD = 0;
        if (!ed) {
            fi = 4;
            fj = 3;
            hg = i[cw];
        }
        if (ee) {
            ee = false;
            d.a(0, 0, 0, 0, 0, 0, 0, 0);
            d.C(d.cd.a - 30720, d.cd.b - 35328);
            d.g(cd);
        }
        dc = 255;
    }

    private static void A(int n, int n2) {
        dY = dS;
        dZ = dT;
        ea = dU;
        eb = dV;
        eq = 0;
        dS = d.i(n, n2);
        dT = d.j(n, n2);
        dU = bi[fy[n] & 0x1F][n2 * 4 + 2] & 0xFF;
        dV = bi[fy[n] & 0x1F][n2 * 4 + 2] >> 8 & 0xFF;
        dW = bi[fy[n] & 0x1F][n2 * 4 + 3] & 0xFF;
        if (dW != -1 && dW != 255) {
            dW <<= 2;
        }
    }

    private static void bm() {
        dY = dS;
        dZ = dT;
        ea = dU;
        eb = dV;
        eq = 0;
        dU = 96;
        dV = 96;
        byte by = bk[ef][eg + 2];
        byte by2 = bk[ef][eg + 1];
        dS = b.f((int)by, by2) - 12288;
        dT = b.g(by, by2) - 12288;
        dW = -1;
        if (eg + 3 < bk[ef].length) {
            int n;
            int n2;
            by = bk[ef][eg + 3 + 2];
            by2 = bk[ef][eg + 3 + 1];
            int n3 = b.f((int)by, by2) - 12288 - dS > 0 ? 1 : (n2 = b.f((int)by, by2) - 12288 - dS == 0 ? 0 : -1);
            int n4 = b.g(by, by2) - 12288 - dT > 0 ? 1 : (n = b.g(by, by2) - 12288 - dT == 0 ? 0 : -1);
            if (n2 == 1) {
                dW = 0;
                return;
            }
            if (n2 == -1) {
                dW = 8;
                return;
            }
            if (n == -1) {
                dW = 4;
                return;
            }
            if (n == 1) {
                dW = 12;
            }
        }
    }

    static final int i(int n, int n2) {
        int n3 = bi[fy[n] & 0x1F][n2 * 4 + 0] << 8;
        return n3 += d.Q(n) << 8;
    }

    static final int j(int n, int n2) {
        int n3 = bi[fy[n] & 0x1F][n2 * 4 + 1] << 8;
        return n3 += d.R(n) << 8;
    }

    static final int k(int n, int n2) {
        return bi[fy[n] & 0x1F][n2 * 4 + 2] & 0xFF;
    }

    static final int l(int n, int n2) {
        return bi[fy[n] & 0x1F][n2 * 4 + 2] >> 8 & 0xFF;
    }

    private static void bn() {
        if (er != null) {
            dS = er.m();
            dT = er.n();
            dU = d.er.j[4] >> 8;
            dV = d.er.j[5] >> 8;
            dS -= d.er.j[4] / 2;
            dT -= d.er.j[5] / 2;
        }
    }

    private static void g(b b2) {
        b b3 = ff[3];
        while (b3 != null) {
            b b4 = b3.o;
            if (b2 != b3 && b2.c(b3)) {
                if (b3 == cd) {
                    cd.a(2, null);
                    if (M == 3 || M == 4) {
                        d.h();
                    }
                }
                d.a(3, b3);
            }
            b3 = b4;
        }
    }

    public static final void b(b b2) {
        for (int i = 0; i < et; ++i) {
            if (b2 != eu[i]) continue;
            for (int j = i + 1; j < et; ++j) {
                d.eu[j - 1] = eu[j];
            }
            d.eu[--d.et] = null;
        }
    }

    public static final void O() {
        for (int i = 0; i < et; ++i) {
            if (eu[i] == null) continue;
            d.a(2, eu[i]);
            --i;
        }
    }

    public static final void P() {
        if (ed) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            d.ev[i] = eu[i] != null ? (byte)d.eu[i].j[0] : (byte)0;
        }
    }

    public static final void L(int n) {
        b b2 = d.M(2);
        b2.a((byte)8, (d.cd.a >> 8) + et / 2 * 6, (d.cd.b >> 8) + et % 2 * 6, bB[2], 0, (byte)1, 1, 1792, Short.MAX_VALUE, 35, -1);
        b2.a(d.a(1, d.bB[2].o >> 1));
        b2.i(0);
        b2.j[0] = (short)n;
        b2.i[3] = 3;
        b2.a((byte)2, cd);
        b2.e |= 0x800000;
        d.eu[d.et] = b2;
        ++et;
    }

    static final void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        eK = n;
        eL = n2;
        eM = n3;
        eN = n4;
        eQ = n << 8;
        eR = n2 << 8;
        eS = n3 << 8;
        eT = n4 << 8;
        eX = eW = (byte)n5;
        eY = (byte)n6;
        eZ = (short)n7;
        fa = (short)n8;
        cC = false;
        eP = 0;
        eO = 0;
        System.gc();
        if (ee) {
            int[] nArray = new int[n3 * n4];
            fF.setColor(0);
            fF.fillRect(0, 0, n3, n4);
            fF.setColor(0xFFFF00);
            fF.fillArc(0, 0, n3, n4, 0, 360);
            int n9 = fF.getDisplayColor(0xFFFF00);
            ho.getRGB(nArray, 0, n3, 0, 0, n3, n4);
            for (int i = 0; i < n3 * n4; ++i) {
                if ((nArray[i] & 0xFFFFFF) != n9) continue;
                nArray[i] = 0xFFFFFF;
            }
            fc = Image.createRGBImage((int[])nArray, (int)n3, (int)n4, (boolean)true);
            am.setClip(0, 0, 240, 294);
            am.setColor(0);
            am.fillRect(0, 0, 240, 320);
        } else {
            fc = null;
            System.gc();
            if (bS != null) {
                am = bS;
                bS = null;
            }
            am.setClip(0, 18, 240, 276);
            bL = 10;
        }
        fG = -1;
        fH = -1;
    }

    static final void Q() {
        int n = (eK + fU) / 24;
        int n2 = (eL + fV) / 24;
        int n3 = (eM - 1) / 24 + 2;
        for (int i = n; i < n + n3; ++i) {
            for (int j = n2; j < n2 + n3; ++j) {
                if (i < 0 || j < 0) continue;
                d.u(i, j);
            }
        }
    }

    static final void a(boolean bl, int n) {
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        int n2 = 0;
        for (int i = 2; i <= 3; ++i) {
            b b2 = ff[i];
            while (b2 != null) {
                if ((b2.e & 0x800) == 2048 && b2 != cd) {
                    int n3 = b2.m();
                    int n4 = b2.n();
                    int n5 = fW + eQ + eS / 2;
                    int n6 = fX + eR + eT / 2;
                    int n7 = n3 - n5 >> 8;
                    int n8 = n4 - n6 >> 8;
                    n5 = eM / 2 + n7;
                    n6 = eN / 2 + n8;
                    int n9 = eM / 2;
                    int n10 = eN / 2;
                    if (!bl && n7 * n7 + n8 * n8 <= n9 * n10 && (b2.e & 0x1800) == 2048) {
                        if (fb) {
                            bB[1].a(fF, 3, 0, n5, n6 - 24 + (eP >> 8), 0, 0, 0);
                        }
                    } else if (bl && n7 * n7 + n8 * n8 > n9 * n10 && n3 > fW && n3 < fW + 184320 && n4 > fX && n4 < fX + 211968) {
                        n2 = n;
                        if (fb && (b2.e & 0x1800) == 2048) {
                            int n11 = 0 + eK / 3 + n9;
                            int n12 = eL / 3 + n10;
                            d.a(n7, n8, n11, n12 + 12, n2, n9, n10, 10, -1, true);
                        }
                    }
                }
                b2 = b2.o;
            }
        }
    }

    static final void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl) {
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16 = Math.abs(n) + Math.abs(n2);
        int n17 = 100 * n2 / n16;
        n = n15 = 100 * n / n16;
        n2 = n17;
        n16 = Math.abs(n) + Math.abs(n2);
        if (n16 == 0) {
            n16 = 1;
        }
        int n18 = (Math.abs(n2) * 2 - 1) / (n16 + 1);
        int n19 = Math.abs(n) * 2 / (n16 + 1);
        n15 *= Math.abs(n15);
        n17 *= Math.abs(n17);
        int n20 = Math.abs(n15) + Math.abs(n17);
        if (n20 == 0) {
            n20 = 1;
        }
        n15 = 100 * n * n16 / (n20 + 1);
        n17 = 100 * n2 * n16 / (n20 + 1);
        n15 += 100 * n / n16;
        n17 += 100 * n2 / n16;
        n15 /= 2;
        n17 /= 2;
        if (bl) {
            am.setColor(n5);
            for (n14 = -(n8 - 1); n14 < n8; ++n14) {
                int n21 = n8 - 1 - Math.abs(n14);
                n13 = n3 + (-(n17 * n14) / 2 + n15 * (n6 + 5)) / 100;
                n12 = n4 + (n15 * n14 / 2 + n17 * (n7 + 5)) / 100;
                n11 = n3 + (-(n17 * n14) / 2 + n15 * (n6 + 5 + n21)) / 100;
                n10 = n4 + (n15 * n14 / 2 + n17 * (n7 + 5 + n21)) / 100;
                am.drawLine(n13 + n18, n12 + n19, n11 + n18, n10 + n19);
                am.drawLine(n13, n12, n11, n10);
            }
            am.setColor((n5 & 0xFEFEFE) >> 1);
        } else {
            am.setColor(0);
        }
        n13 = n3 + (-(n17 * -n8) / 2 + n15 * (n6 + 5)) / 100;
        n12 = n4 + (n15 * -n8 / 2 + n17 * (n7 + 5)) / 100;
        n11 = n3 + (-(n17 * n8) / 2 + n15 * (n6 + 5)) / 100;
        n10 = n4 + (n15 * n8 / 2 + n17 * (n7 + 5)) / 100;
        am.drawLine(n3 += n15 * (n6 + 5 + (n8 + 1)) / 100, n4 += n17 * (n7 + 5 + (n8 + 1)) / 100, n13, n12);
        am.drawLine(n3, n4, n11, n10);
        am.drawLine(n3 + n18, n4 + n19, n13 + n18, n12 + n19);
        am.drawLine(n3 + n18, n4 + n19, n11 + n18, n10 + n19);
        if (!bl) {
            am.setColor(n5);
            am.drawLine(--n3, --n4, --n13, --n12);
            am.drawLine(n3, n4, --n11, --n10);
            am.drawLine(n3 + n18, n4 + n19, n13 + n18, n12 + n19);
            am.drawLine(n3 + n18, n4 + n19, n11 + n18, n10 + n19);
        }
        if (n9 != -1) {
            n14 = n == 0 ? 1 : (n < 0 ? 8 : 4);
            n14 = n2 == 0 ? (n14 |= 2) : (n2 < 0 ? (n14 |= 0x20) : (n14 |= 0x10));
            cX.a(am, "" + n9, n3, n4, n14);
        }
    }

    static final void R() {
        eR += eV * 100;
        if ((eQ += eU * 100) < 0) {
            eQ = 0;
        } else if (eQ + eS * 3 >= 184320) {
            eQ = 184320 - eS * 3 - 1;
        }
        if (eR < 0) {
            eR = 0;
        } else if (eR + eT * 3 >= 211968) {
            eR = 211968 - eT * 3 - 1;
        }
        if (eO > 0 || eP > 0) {
            eP += eO * 100;
            eO -= 10;
            if (eP < 9216) {
                eO -= eO * 2 / 5;
            }
        } else if (eP < 0) {
            eP = 0;
            eO = 0;
        }
        int n = d.j((int)(au & 0xFFFFL) * 10) / 2;
        int n2 = d.i((int)(au & 0xFFFFL) * 15) / 2;
        if (eU != 0 || eV != 0) {
            n /= 2;
            n2 /= 2;
        }
        eK = (eQ += n) >> 8;
        eL = (eR += n2) - eP >> 8;
    }

    static final void S() {
        if (cC || d.cd.l < fa) {
            d.cd.l += 100;
        }
        int n = -1;
        byte by = 0;
        if (an[7] > 0) {
            n = 0;
            by = an[7];
        } else if (an[5] > 0) {
            n = 8;
            by = an[5];
        } else if (an[3] > 0) {
            n = 4;
            by = an[3];
        } else if (an[9] > 0) {
            n = 12;
            by = an[9];
        } else if (an[4] > 0) {
            n = 2;
            by = an[4];
        } else if (an[2] > 0) {
            n = 6;
            by = an[2];
        } else if (an[8] > 0) {
            n = 10;
            by = an[8];
        } else if (an[10] > 0) {
            n = 14;
            by = an[10];
        }
        int n2 = 3 * d.cd.j[7] * by * 100 / 1000;
        if (n2 > d.cd.j[7]) {
            n2 = d.cd.j[7];
        }
        if (n >= 0) {
            cd.i(n);
            d.cd.h = n2;
            d.cd.c += b.A[d.cd.i[1] * 2] * (d.cd.h / a) / 3;
            d.cd.d += b.A[d.cd.i[1] * 2 + 1] * (d.cd.h / a) / 3;
        }
        d.cd.c *= 3;
        d.cd.d *= 3;
        d.cd.c /= 4;
        d.cd.d /= 4;
        eU = (d.cd.c >> 8) * 24 / 16;
        eV = (d.cd.d >> 8) * 24 / 16;
        if (cC && d.cd.l > eZ) {
            cC = false;
            if (eY == 0) {
                d.N();
            } else if (eY > 0) {
                eY = (byte)(eY - 1);
                eW = eX;
            }
            dc |= 4;
        }
        if (d.A()) {
            return;
        }
    }

    static final void T() {
        fF.setColor(0xFF0000);
        fF.drawLine(eM / 2, eN / 2, eM / 2, eN / 2);
    }

    static final void c(b b2) {
        ho.getRGB(fe, 0, 1, eM / 2, eM / 2, 1, 1);
        int n = fF.getDisplayColor(0xFF0000);
        int n2 = fF.getDisplayColor(0x646464);
        int n3 = fe[0] & 0xFFFFFF;
        if (n3 != n) {
            if (n3 == n2) {
                return;
            }
            fd = b2;
        }
    }

    static final void m(int n, int n2) {
        am.setColor(0);
        am.drawLine(n + eM / 4, n2 + eN / 2, n + (eM - 24) / 2, n2 + eN / 2);
        am.drawLine(n + eM * 3 / 4, n2 + eN / 2, n + (eM + 24) / 2, n2 + eN / 2);
        am.drawLine(n + eM / 2, n2 + eN / 4, n + eM / 2, n2 + (eN - 24) / 2);
        am.drawLine(n + eM / 2, n2 + eN * 3 / 4, n + eM / 2, n2 + (eN + 24) / 2);
    }

    private static void bo() {
        bA = false;
        hc -= 100;
        d.fh[0] = 0;
        d.fh[1] = 0;
        for (int i = 0; i < 5; ++i) {
            b b2 = ff[i];
            while (b2 != null) {
                b b3 = b2.o;
                b2.c();
                if ((b2.e & 0x20) != 0 && b2.i[0] != 5 && b2.i[0] != 3 && !cB && !cE) {
                    int n = b2.i[0] == 8 ? 0 : 1;
                    fh[n] = fh[n] + 1;
                    if (d.d(b2)) {
                        bA = true;
                    }
                }
                if (b2.i[9] != 0) {
                    d.a(b2.i[10], b2.i[9]);
                }
                if (hc <= 0 && b2.i[0] != 0 && (b2.j[1] <= 0 || b2.j[0] > 0) && (b2.e & 0x800) == 0 && b2.i[6] != 2 && b2.i[6] != 3 && (b2.e & 0x800000) == 0) {
                    int n;
                    int n2;
                    int n3;
                    if (b2.f == -1) {
                        if (ee) {
                            n3 = b2.a - (fW + 92160) >> 8;
                            n2 = b2.b - (fX + 105984) >> 8;
                            n = n3 * n3 + n2 * n2;
                        } else {
                            n = cd.b(b2);
                        }
                        if (n > k[i]) {
                            d.a(i, b2);
                        }
                    } else {
                        n = b2.f >> 16;
                        n3 = 0;
                        for (n2 = 0; n3 == 0 && n2 < 4; ++n2) {
                            if (cN[n2] != n) continue;
                            n3 = 1;
                        }
                        if (n3 == 0) {
                            d.a(i, b2);
                        }
                    }
                }
                b2 = b3;
            }
        }
        if (hc <= 0) {
            hc = 300;
        }
    }

    private static void h(int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        short[] sArray;
        if (bc != null && bc[n] != null) {
            sArray = bc[n];
            for (n6 = 0; n6 < sArray.length; n6 += 5) {
                n5 = sArray[n6 + 0] + n2;
                n4 = sArray[n6 + 1] + n3;
                if (!d.o(n5, n4) || (sArray[n6 + 3] & 2) == 0) continue;
                bB[13].a(am, (int)sArray[n6 + 2], bB[13].a((int)sArray[n6 + 2], au), n5 += bI, n4 += bJ, 0, 0, 0);
            }
        }
        if (bj != null && bj[n] != null) {
            sArray = bj[n];
            for (n6 = 0; n6 < sArray.length; n6 += 3) {
                n5 = sArray[n6 + 0] + n2;
                n4 = sArray[n6 + 1] + n3;
                if (!d.o(n5, n4)) continue;
                n5 += bI;
                n4 += bJ;
                int n7 = 3 + sArray[n6 + 2] * 2;
                if (b.H == ((sArray[n6 + 2] & 1) == 0)) {
                    ++n7;
                }
                bB[13].a(am, n7, n5, n4, 0, 0, 0);
            }
        }
    }

    private static void f(int n, int n2, int n3, int n4) {
        if (bc != null && bc[n] != null) {
            short[] sArray = bc[n];
            for (int i = 0; i < sArray.length; i += 5) {
                int n5 = sArray[i + 0] + n3;
                int n6 = sArray[i + 1] + n4;
                if (n5 - 25 > fU + 240 + 0 || n6 - 25 > fV + 276 + 18 || n5 + 25 < fU || n6 + 25 < fV || (sArray[i + 3] >> 3 & 0xFF) != 0 && (sArray[i + 3] >> 3 & 0xFF) != n2 + 1 || (sArray[i + 3] & 4) == 0 || sArray[i + 2] == 9 || sArray[i + 2] == 12) continue;
                bB[13].a(am, (int)sArray[i + 2], bB[13].a((int)sArray[i + 2], au), n5 += bI, n6 += bJ, 0, 0, 0);
            }
        }
    }

    private static void bp() {
        if (ed) {
            return;
        }
        if (aZ == null) {
            return;
        }
        int[] nArray = aZ[cI];
        if (nArray == null) {
            return;
        }
        for (int i = 0; i < nArray.length; i += 5) {
            int n = i + 3;
            nArray[n] = nArray[n] + 1;
            int n2 = nArray[i + 0];
            int n3 = nArray[i + 1];
            int n4 = nArray[i + 4] & 0xFFFF;
            int n5 = nArray[i + 4] >>> 16;
            if ((n2 += bI) > 240 || n2 + n4 < 0 || (n3 += bJ) > 276 || n3 + n5 < 18) continue;
            am.setColor(0xFF0000);
            am.drawRect(n2, n3, n4, n5);
        }
    }

    static final void U() {
        int n;
        for (n = 0; n < 64; ++n) {
            d.ha[n] = new b();
        }
        for (n = 0; n < 5; ++n) {
            d.fg[n] = 0;
        }
        hb = 64;
        System.gc();
    }

    static final void V() {
        for (int i = 0; i < 5; ++i) {
            b b2 = ff[i];
            while (b2 != null) {
                b b3 = b2.o;
                d.a(i, b2);
                b2 = b3;
            }
            d.ff[i] = null;
        }
    }

    static final b M(int n) {
        if (hb <= 0) {
            return null;
        }
        int n2 = n;
        fg[n2] = fg[n2] + 1;
        b b2 = ha[--hb];
        d.ha[d.hb] = null;
        b2.o = ff[n];
        d.ff[n] = b2;
        if (b2.o != null) {
            b2.o.n = b2;
        }
        return b2;
    }

    static final void a(int n, b b2, int n2) {
        if (b2 == ff[n]) {
            d.ff[n] = b2.o;
            if (ff[n] != null) {
                d.ff[n].n = null;
            }
        } else {
            b2.n.o = b2.o;
            if (b2.o != null) {
                b2.o.n = b2.n;
            }
        }
        int n3 = n;
        fg[n3] = fg[n3] - 1;
        int n4 = n2;
        fg[n4] = fg[n4] + 1;
        b2.o = ff[n2];
        b2.n = null;
        d.ff[n2] = b2;
        if (b2.o != null) {
            b2.o.n = b2;
        }
    }

    static final void a(int n, b b2) {
        if (b2 == cp) {
            cp = null;
        }
        if (b2 == cq) {
            cq = null;
        }
        if (b2 == cr) {
            cr = null;
        }
        if (b2 == er) {
            er = null;
        }
        if (b2 == fY) {
            fY = cd;
        }
        if (b2 == ff[n]) {
            d.ff[n] = b2.o;
            if (ff[n] != null) {
                d.ff[n].n = null;
            }
        } else {
            b2.n.o = b2.o;
            if (b2.o != null) {
                b2.o.n = b2.n;
            }
        }
        b2.a();
        int n2 = n;
        fg[n2] = fg[n2] - 1;
        d.ha[d.hb] = b2;
        ++hb;
    }

    static final b n(int n, int n2) {
        b b2 = ff[n];
        b b3 = null;
        int n3 = n2;
        while (b2 != null) {
            int n4;
            if ((b2.e & 4) == 0 && b2.j[0] > 0 && (n4 = b2.b(cd)) > 0 && n4 < n3) {
                n3 = n4;
                b3 = b2;
            }
            b2 = b2.o;
        }
        return b3;
    }

    static final boolean a(b b2, b b3, int n) {
        int n2 = b3.a - b2.a;
        int n3 = b3.b - b2.b;
        switch (n) {
            case 0: {
                if (n2 <= 0) break;
                return true;
            }
            case 1: {
                if (n3 >= 2 * n2) break;
                return true;
            }
            case 2: {
                if (n3 >= n2) break;
                return true;
            }
            case 3: {
                if (2 * n3 >= n2) break;
                return true;
            }
            case 4: {
                if (n3 < 0) {
                    return true;
                }
            }
            case 5: {
                if (2 * n3 >= -n2) break;
                return true;
            }
            case 6: {
                if (n3 >= -n2) break;
                return true;
            }
            case 7: {
                if (n3 >= -2 * n2) break;
                return true;
            }
            case 8: {
                if (n2 >= 0) break;
                return true;
            }
            case 9: {
                if (n3 <= 2 * n2) break;
                return true;
            }
            case 10: {
                if (n3 <= n2) break;
                return true;
            }
            case 11: {
                if (2 * n3 <= n2) break;
                return true;
            }
            case 12: {
                if (n3 <= 0) break;
                return true;
            }
            case 13: {
                if (2 * n3 <= -n2) break;
                return true;
            }
            case 14: {
                if (n3 <= -n2) break;
                return true;
            }
            case 15: {
                if (n3 <= 2 * -n2) break;
                return true;
            }
        }
        return false;
    }

    static final b a(b b2, int n, int n2) {
        b b3 = null;
        int n3 = n2;
        int n4 = n;
        int n5 = b2.i[1];
        if (b2.i[0] == 3) {
            if (an[6] > 0) {
                d.cd.i[5] = 6;
            }
            n5 %= 15;
        } else {
            n5 = cd.d() << 2;
        }
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i = 2; i != 4; ++i) {
            b b4 = ff[i];
            while (b4 != null) {
                block15: {
                    int n6;
                    block17: {
                        block18: {
                            int n7;
                            block16: {
                                if (b4.j[0] <= 0 || b4.i[0] == 10) break block15;
                                n7 = b4.e;
                                if (b2 == cd && (b4.i[6] == 2 || b4.i[6] == 3 || (b4.e & 0x800000) != 0) || cw == 0 && (n7 & 0x20) != 0 && b3 != null && (b3.e & 0x20) == 0) break block15;
                                switch (n4) {
                                    case 0: {
                                        break;
                                    }
                                    case 1: {
                                        if (b4.i[6] > 4) break;
                                    }
                                    case 2: {
                                        if ((n7 & 0x20) != 0) break;
                                    }
                                    case 3: {
                                        if ((n7 & 0x800) != 0) break;
                                    }
                                    default: {
                                        break block15;
                                    }
                                }
                                if (!d.a(b2, b4, n5) || (n6 = b4.b(cd)) <= 0 || n6 >= n2 || n6 >= n3 && (b3 == null || (b3.e & 0x20) == 0 || cw != 0) && (b4.i[6] <= 4 || n4 >= 1)) break block15;
                                if (cw == 0 || (n7 & 0x20) == 0) break block16;
                                if (n4 > 2 || n6 > n3) break block15;
                                n4 = 2;
                                break block17;
                            }
                            if ((n7 & 0x800) == 0) break block18;
                            if (n4 > 3 || n6 > n3) break block15;
                            n4 = 3;
                            break block17;
                        }
                        if (b4.i[6] <= 4) break block17;
                        if (n4 > 1 || n6 > n3) break block15;
                        n4 = 1;
                    }
                    n3 = n6;
                    b3 = b4;
                }
                b4 = b4.o;
            }
            if (b3 == null) continue;
            return b3;
        }
        if (cp != null && d.cp.j[0] > 0 && d.a(b2, cp, n5) && (b3 == null || b3.b(cd) > cp.b(cd))) {
            return cp;
        }
        return b3;
    }

    public static final boolean o(int n, int n2) {
        if (!ee) {
            return n + 25 > fU && n2 + 25 > fV && n - 25 < fU + 240 && n2 - 25 < fV + 276;
        }
        return n + 25 > fW + eQ >> 8 && n2 + 25 > fX + eR >> 8 && n - 25 < fW + eQ + eS >> 8 && n2 - 25 < fX + eR + eT >> 8;
    }

    private static void bq() {
        int n;
        if ((hd -= 100) <= 0) {
            for (n = 0; n < 3 && d.br(); ++n) {
            }
            hd = 500 + d.a(0, 500);
        }
        if ((he -= 100) <= 0) {
            for (n = 0; n < 3 && d.bs(); ++n) {
            }
            he = 300 + d.a(0, 1000);
        }
        if ((hf -= 100) < -j[cw] * 1000) {
            hf = j[cw] * 1000;
        }
    }

    private static boolean br() {
        int n = fi - fg[2];
        if (n > 0) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7 = 0;
            boolean bl = false;
            int n8 = d.a(0, 4);
            int n9 = cL[n8];
            if (bh[n9] == null && bh[n9 = cI] == null) {
                return false;
            }
            int n10 = d.Q(cN[n8]) << 8;
            int n11 = d.R(cN[n8]) << 8;
            int n12 = bh[n9].length / 5;
            if (n12 == 0) {
                return false;
            }
            int n13 = d.a(0, n12);
            do {
                ++n13;
                n6 = b.c(n9, n13 %= n12) + n10;
                n5 = b.d(n9, n13) + n11;
                if (ee) {
                    n3 = (n6 >> 8) - (fW + 92160 >> 8);
                    n2 = (n5 >> 8) - (fX + 105984 >> 8);
                    n4 = n3 * n3 + n2 * n2;
                    continue;
                }
                n4 = cd.j(n6, n5);
            } while (n7++ < n12 && (d.v(n6 - 3072, n5 - 6144) || d.v(n6 + 3072, n5) || n4 < 0 || n4 > k[2] * 24));
            if (n7 >= n12) {
                return false;
            }
            n3 = b.c(n9, n13) + n10;
            n2 = b.d(n9, n13) + n11;
            boolean bl2 = hf > 0 && fg[2] != 0 && fh[0] * 100 / fg[2] <= hg;
            b b2 = d.M(2);
            d.a(b2, n3 += d.a(-768, 1024), n2 += d.a(-768, 1024), bl2, -1);
            b2.e(n9, n13);
            b2.i(d.a(0, 4) << 2);
        }
        return false;
    }

    static final void a(b b2, int n, int n2, boolean bl, int n3) {
        int n4;
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl) {
            n4 = 1;
        } else if (d.a(0, 100) > 40) {
            n4 = 0;
        } else {
            n4 = 2;
            bl2 = true;
        }
        int n5 = n4;
        b2.a((byte)8, n >> 8, n2 >> 8, bB[2], n4, (byte)1, 1, c[n5], 85, 35, n3);
        if (!bl) {
            b2.a(d.a(1, d.bB[2].o >> 1));
        }
        if (bl) {
            b2.e |= 0x20;
            b2.i[3] = cw < 3 ? 1 : (cw == 3 ? 2 : 4);
            b2.i[8] = (byte)(b2.i[3] - 1);
            return;
        }
        if (bl2) {
            b2.i[3] = 0;
            if (d.a(0, 100) < 25) {
                b2.i[8] = (byte)d.a(6, 8);
            }
            return;
        }
        int n6 = d.a(0, 100);
        int n7 = 0;
        if (++fn >= 20) {
            n7 = 3;
            b2.e |= 0x20000;
            fn = 0;
        } else {
            if (n6 < h[cz * h.length / 100]) {
                b2.a((byte)6, cd);
                n6 = d.a((int)g[0], 100);
            }
            while (n6 >= 0) {
                n6 -= g[n7];
                n7 = (byte)(n7 + 1);
            }
            if (n7 > 0) {
                n7 = (byte)(n7 - 1);
            }
        }
        b2.i[3] = n7;
        if (d.a(0, 100) < 25) {
            if (d.a(0, 100) < 20) {
                b2.i[8] = (byte)(n7 - 1);
                return;
            }
            b2.i[8] = (byte)d.a(6, 8);
        }
    }

    private static boolean bs() {
        int n = fj - fg[3];
        if (n > 0) {
            int n2;
            int n3;
            int n4 = cN[d.a(0, 4)];
            if (aY == null || aY[n4] == null) {
                return false;
            }
            int n5 = aY[n4].length / 7;
            if (n5 == 0) {
                return false;
            }
            int n6 = 0;
            int n7 = 0xFFFFFFF;
            int n8 = -1;
            for (n3 = 0; n3 < n5; ++n3) {
                int n9;
                if (ee) {
                    int n10 = (b.f(n4, n3) >> 8) - (fW + 92160 >> 8);
                    int n11 = (b.g(n4, n3) >> 8) - (fX + 105984 >> 8);
                    n9 = n10 * n10 + n11 * n11;
                } else {
                    n9 = cd.j(b.f(n4, n3), b.g(n4, n3));
                }
                if (n9 >= n7 || n9 <= 0) continue;
                n7 = n9;
                n8 = n3;
            }
            n3 = n8;
            if (n3 == -1) {
                return true;
            }
            if (hf > 0 && fg[3] != 0 && fh[1] * 100 / fg[3] < hg) {
                n2 = 0;
            } else {
                n2 = d.a(1, fk);
                ++fm;
                if (bt[bs][n2 * 3 + 1] == 1) {
                    if (fm < 10) {
                        --n2;
                    } else {
                        fm = 0;
                    }
                }
            }
            b b2 = d.e(d.cd.a >> 8, d.cd.b >> 8, n2);
            int n12 = d.a(0, 4);
            int n13 = aY[n4][n3 * 7 + 2];
            n6 = 0;
            boolean bl = false;
            int n14 = 5;
            do {
                boolean bl2;
                int n15;
                int n16;
                ++n12;
                if ((n13 & 2 << (n12 %= 4) * 2) == 0) continue;
                b2.i((n12 ^ 2) << 2);
                b2.f(n4, n3, n12);
                b2.e();
                int n17 = b.e(n4, n3, n12);
                byte by = (byte)(n17 >>> 8);
                if ((n17 &= 0xFF) < 0 || by < 0) {
                    n16 = 0;
                    n15 = 0;
                    n14 = 5;
                } else {
                    n16 = b.a(by, n17, n12, 0) - b2.a;
                    n15 = b.b(by, n17, n12, 0) - b2.b;
                    n14 = 0;
                }
                block2: do {
                    b2.a += n16 * n14 / 5;
                    b2.b += n15 * n14 / 5;
                    bl2 = false;
                    b b3 = ff[3];
                    while (b3 != null) {
                        if (b3 != b2 && b3.c(b2)) {
                            bl2 = true;
                            continue block2;
                        }
                        b3 = b3.o;
                    }
                } while (++n14 <= 5 && (bl2 || d.d(b2)));
            } while (n6++ < 4 && n14 >= 5);
            if (n6 >= 4) {
                d.a(3, b2);
                return true;
            }
            b2.i[15] = (byte)((n12 ^ 2) << 2);
            b2.g(n4, n3, n12);
            b2.g(a);
            b b4 = ff[3];
            while (b4 != null) {
                if (b4 != b2 && b4.c(b2)) {
                    d.a(3, b2);
                    return true;
                }
                b4 = b4.o;
            }
        }
        return false;
    }

    static final b e(int n, int n2, int n3) {
        b b2 = d.M(3);
        b2.i[14] = (byte)n3;
        b2.a((byte)6, d.cd.a >> 8, d.cd.b >> 8, bB[fl[n3 * 3]], fl[n3 * 3 + 1], (byte)1, 3, 3300, 500, 40, -1);
        if (n3 == 0) {
            b2.e |= 0x20;
            b2.i[8] = 1;
        } else if (d.a(0, 100) < 5) {
            b2.i[8] = 0;
        } else if (d.a(0, 100) - 5 < 10) {
            b2.i[8] = (byte)d.a(6, 8);
        }
        if (b2.i[14] != 0) {
            b2.a(d.a(0, b2.b().o >> 1));
        }
        return b2;
    }

    private static void B(int n, int n2) {
        b b2;
        int n3;
        b b3;
        short[] sArray;
        int n4 = d.Q(n2);
        int n5 = d.R(n2);
        if (be != null && be[n] != null) {
            sArray = be[n];
            b3 = ff[3];
            while (b3 != null) {
                if (b3.i[0] == 5 && (b3.e & 0x800) == 0 && b3.f != -1 && b3.f >> 16 == n2) {
                    n3 = b3.f >> 8 & 0xFF;
                    int n6 = n3 * 3 + 2;
                    sArray[n6] = (short)(sArray[n6] | 0x4000);
                }
                b3 = b3.o;
            }
            for (n3 = 0; n3 < sArray.length; n3 += 3) {
                if ((sArray[n3 + 2] & 0x4000) == 0) {
                    int n7 = sArray[n3 + 2] & 0xFF;
                    if (fl[n7 * 3] == -1) continue;
                    b2 = d.M(3);
                    b2.a((byte)5, sArray[n3 + 0] + n4, sArray[n3 + 1] + n5, bB[fl[n7 * 3]], fl[n7 * 3 + 1], (byte)1, 3, 3300, 500, 40, -1);
                    b2.i[14] = (byte)n7;
                    b2.i(sArray[n3 + 2] >> 8);
                    b2.e();
                    b2.f = n & 0xFF | (n3 / 3 & 0xFF) << 8 | (n2 & 0xFF) << 16;
                    b2.a(d.a(0, b2.b().o >> 1));
                    continue;
                }
                int n8 = n3 + 2;
                sArray[n8] = (short)(sArray[n8] & 0xFFFFBFFF);
            }
        }
        if (bf != null && bf[n] != null) {
            sArray = bf[n];
            b3 = ff[2];
            while (b3 != null) {
                if (b3.i[0] == 10 && (b3.e & 0x800) == 0 && b3.f != -1 && b3.f >> 16 == n2) {
                    n3 = b3.f >> 8 & 0xFF;
                    int n9 = n3 * 6 + 2;
                    sArray[n9] = (short)(sArray[n9] | 0x80);
                }
                b3 = b3.o;
            }
            for (n3 = 0; n3 < sArray.length; n3 += 6) {
                if ((sArray[n3 + 2] & 0x80) == 0) {
                    if (sArray[n3 + 3] >= 0 && (sArray[n3 + 3] >> 8 != n2 || gZ[sArray[n3 + 3] & 0xF] == 0)) continue;
                    b2 = d.M(2);
                    b2.a((byte)10, sArray[n3 + 0] + n4, sArray[n3 + 1] + n5, bB[2], sArray[n3 + 2], (byte)1, 0, -1, -1, 35, -1);
                    b2.f = n & 0xFF | (n3 / 6 & 0xFF) << 8 | (n2 & 0xFF) << 16;
                    b2.a(d.a(1, d.bB[2].o >> 1));
                    continue;
                }
                int n10 = n3 + 2;
                sArray[n10] = (short)(sArray[n10] & 0xFFFFFF7F);
            }
        }
        if (!ed && bg != null && bg[n] != null) {
            sArray = bg[n];
            b3 = ff[2];
            while (b3 != null) {
                if (b3.i[0] == 10 && (b3.e & 0x800) == 0 && b3.f != -1 && b3.f >> 16 == n2) {
                    n3 = b3.f >> 8 & 0xFF;
                    int n11 = n3 * 6 + 2;
                    sArray[n11] = (short)(sArray[n11] | 0x80);
                }
                b3 = b3.o;
            }
            for (n3 = 0; n3 < sArray.length; n3 += 6) {
                if ((sArray[n3 + 2] & 0x80) == 0) {
                    if (sArray[n3 + 3] >= 0 && (sArray[n3 + 3] >> 8 != n2 || gZ[sArray[n3 + 3] & 0xF] == 0)) continue;
                    b2 = d.M(2);
                    b2.a((byte)10, sArray[n3 + 0] + n4, sArray[n3 + 1] + n5, bB[2], sArray[n3 + 2], (byte)1, 0, -1, -1, 35, -1);
                    b2.f = n & 0xFF | (n3 / 6 & 0xFF) << 8 | (n2 & 0xFF) << 16;
                    b2.a(d.a(1, d.bB[2].o >> 1));
                    continue;
                }
                int n12 = n3 + 2;
                sArray[n12] = (short)(sArray[n12] & 0xFFFFFF7F);
            }
        }
        if (bc != null && bc[n] != null) {
            sArray = bc[n];
            for (int i = 0; i < 2; ++i) {
                b3 = ff[i];
                while (b3 != null) {
                    if (b3.i[0] == 1 && (b3.e & 0x800) == 0 && b3.f != -1 && b3.f >> 16 == n2) {
                        n3 = b3.f >> 8 & 0xFF;
                        int n13 = n3 * 5 + 2;
                        sArray[n13] = (short)(sArray[n13] | 0x80);
                    }
                    b3 = b3.o;
                }
            }
            for (n3 = 0; n3 < sArray.length; n3 += 5) {
                if ((sArray[n3 + 2] & 0x80) == 0 && ((sArray[n3 + 3] >> 3 & 0xFF) == 0 || (sArray[n3 + 3] >> 3 & 0xFF) == n2 + 1)) {
                    if ((sArray[n3 + 3] & 2) != 0 || (sArray[n3 + 3] & 4) != 0) continue;
                    b b4 = d.M(1);
                    b4.a((byte)1, sArray[n3 + 0] + n4, sArray[n3 + 1] + n5, bB[13], (int)sArray[n3 + 2], (byte)1, 0);
                    if (sArray[n3 + 4] == 1) {
                        b4.e |= 8;
                    }
                    b4.f = n & 0xFF | (n3 / 5 & 0xFF) << 8 | (n2 & 0xFF) << 16;
                    continue;
                }
                int n14 = n3 + 2;
                sArray[n14] = (short)(sArray[n14] & 0xFFFFFF7F);
            }
        }
        if (bd != null && bd[n] != null) {
            sArray = bd[n];
            b3 = ff[0];
            while (b3 != null) {
                if (b3.i[0] == 2 && (b3.e & 0x800) == 0 && b3.f != -1 && b3.f >> 16 == n2) {
                    n3 = b3.f >> 8 & 0xFF;
                    int n15 = n3 * 4 + 2;
                    sArray[n15] = (short)(sArray[n15] | 0x80);
                }
                b3 = b3.o;
            }
            for (n3 = 0; n3 < sArray.length; n3 += 4) {
                if (sArray[n3 + 3] >= 0 && sArray[n3 + 3] != n2) continue;
                if ((sArray[n3 + 2] & 0x80) == 0) {
                    b b5 = d.M(0);
                    b5.a((byte)2, sArray[n3 + 0] + n4, sArray[n3 + 1] + n5, bB[14], (int)sArray[n3 + 2], (byte)0, 0);
                    b5.f = n & 0xFF | (n3 / 4 & 0xFF) << 8 | (n2 & 0xFF) << 16;
                    continue;
                }
                int n16 = n3 + 2;
                sArray[n16] = (short)(sArray[n16] & 0xFFFFFF7F);
            }
        }
    }

    private static void bt() {
        int n;
        for (n = 0; n < hh.length; n += 6) {
            d.hh[n + 0] = -1;
            d.hh[n + 1] = -1;
            d.hh[n + 2] = 0;
            d.hh[n + 3] = 0;
            d.hh[n + 4] = -1;
            d.hh[n + 5] = 0;
            d.hi[n / 6] = null;
        }
        for (n = 0; n < hj.length; n += 4) {
            d.hj[n] = -1;
        }
    }

    static final void a(int n, int n2, int n3, int n4, b b2) {
        int n5;
        for (n5 = 0; n5 < hh.length && hh[n5] != -1; n5 += 6) {
        }
        if (n5 == 16) {
            n5 = 0;
        }
        d.hh[n5 + 0] = n;
        d.hh[n5 + 1] = n2;
        d.hh[n5 + 2] = n3;
        d.hh[n5 + 3] = n4;
        d.hh[n5 + 4] = b2.i[3];
        d.hh[n5 + 5] = 1;
        short s = b2 == cd ? q[hh[n5 + 4]] : u[hh[n5 + 4]];
        int n6 = n5 + 2;
        hh[n6] = hh[n6] + d.a((int)(-s), (int)s);
        int n7 = n5 + 3;
        hh[n7] = hh[n7] + d.a((int)(-s), (int)s);
        d.hi[n5 / 6] = b2;
    }

    static final void f(int n, int n2, int n3) {
        int n4;
        if (n3 == 0) {
            if (ee) {
                d.b(n, n2, 0, 12288, cd);
            } else {
                d.b(n, n2, 0, 12288, null);
            }
        }
        for (n4 = 0; n4 < hj.length && hj[n4] != -1; n4 += 4) {
        }
        if (n4 == hj.length) {
            n4 = 0;
        }
        d.hj[n4 + 0] = n;
        d.hj[n4 + 1] = n2;
        d.hj[n4 + 2] = n3;
        d.hj[n4 + 3] = 0;
    }

    private static void bu() {
        int n;
        for (n = 0; n < hh.length; n += 6) {
            if (hh[n] < 0) continue;
            boolean bl = false;
            int n2 = hh[n + 0] + hh[n + 2] * 100;
            int n3 = hh[n + 1] + hh[n + 3] * 100;
            do {
                int n4 = n2 - hh[n + 0];
                int n5 = n3 - hh[n + 1];
                int n6 = (n4 > 0 ? 1 : (n4 == 0 ? 0 : -1)) * Math.min(Math.abs(n4), 2048);
                int n7 = (n5 > 0 ? 1 : (n5 == 0 ? 0 : -1)) * Math.min(Math.abs(n5), 2048);
                if (hi[n / 6] == cd || d.hi[n / 6].i[6] == 3) {
                    for (int i = 3; !bl && i >= 1; --i) {
                        b b2 = ff[i];
                        while (!bl && b2 != null && b2 != cd && b2.i[6] != 3) {
                            bl = d.a(n, b2, n6, n7);
                            b2 = b2.o;
                        }
                    }
                } else {
                    bl = d.a(n, cd, n6, n7);
                }
                if (bl) continue;
                int n8 = n + 0;
                hh[n8] = hh[n8] + n6;
                int n9 = n + 1;
                hh[n9] = hh[n9] + n7;
            } while (!bl && (hh[n + 0] != n2 || hh[n + 1] != n3));
            if (hh[n + 0] >> 8 > fU + 240 || hh[n + 1] >> 8 > fV + 276 || hh[n + 0] >> 8 < fU || hh[n + 1] >> 8 < fV) {
                d.hh[n + 0] = -1;
                d.hh[n + 1] = -1;
            }
            int n10 = n + 5;
            hh[n10] = hh[n10] + 100;
        }
        for (n = 0; n < hj.length; n += 4) {
            if (hj[n] == -1) continue;
            int n11 = n + 3;
            hj[n11] = hj[n11] + 100;
            if ((hj[n + 2] != 2 || hj[n + 3] <= 300) && (hj[n + 2] != 1 || hj[n + 3] <= 400)) continue;
            d.hj[n] = -1;
        }
    }

    private static boolean a(int n, b b2, int n2, int n3) {
        if (b2.c(hh[n + 0], hh[n + 1], hh[n + 0] + n2, hh[n + 1] + n3)) {
            int n4 = r[hh[n + 4]] / Math.max(hh[n + 5], 100);
            if (n4 != 0) {
                int n5 = 0;
                if (b2.i[0] == 8 || b2.i[0] == 4) {
                    n5 = 1;
                }
                d.f(b2.m(), b2.n(), n5);
                b2.a(6 | (n4 & 0xFF) << 8, hi[n / 6]);
            }
            if (hh[n + 4] == 5) {
                d.b(hh[n + 0], hh[n + 1], 35, 33750, cd);
            }
            d.hh[n + 0] = -1;
            d.hh[n + 1] = -1;
            return true;
        }
        return false;
    }

    private static void bv() {
        int n;
        int n2;
        int n3;
        for (n3 = 0; n3 < hh.length; n3 += 6) {
            if (hh[n3] < 0 || hh[n3 + 4] == 2) continue;
            am.setColor(0xFFFFFF);
            int n4 = hh[n3 + 2] * (hh[n3 + 5] / fo) >> 8;
            int n5 = hh[n3 + 3] * (hh[n3 + 5] / fo) >> 8;
            n2 = (hh[n3 + 0] >> 8) + bI;
            n = (hh[n3 + 1] >> 8) + bJ;
            am.drawLine(n2, n, n2 + n4, n + n5);
        }
        for (n3 = 0; n3 < hj.length; n3 += 4) {
            int n6;
            int n7;
            int n8;
            if (hj[n3] == -1) continue;
            n2 = (hj[n3 + 0] >> 8) + bI;
            n = (hj[n3 + 1] >> 8) + bJ;
            if (hj[n3 + 2] == 0) {
                n8 = hj[n3 + 3] / 70;
                if (n8 >= bB[22].a(0)) {
                    d.hj[n3] = -1;
                    continue;
                }
                bB[22].a(am, 0, n8, n2, n, 0, 0, 0);
                continue;
            }
            if (hj[n3 + 2] == 1) {
                am.setColor(0xFF0000);
                n8 = (hj[n3 + 3] - 120) / 40;
                n7 = hj[n3 + 3] / 40;
                for (n6 = 0; n6 < 5; ++n6) {
                    am.fillRect(n2 + (n6 - 2) * 3 + (n6 - 2 > 0 ? 1 : (n6 - 2 == 0 ? 0 : -1)) * n7, n + n8 + -Math.abs(n6 - 2) * 3, 2, 2);
                }
                continue;
            }
            if (hj[n3 + 2] == 2) {
                am.setColor(0xFFFF00 + d.a(40, 256));
                n8 = hj[n3 + 3] / 80;
                n8 *= d.a(1, 4);
                for (n7 = 0; n7 < 5; ++n7) {
                    n6 = n7 * 3 + n3 & 0xF;
                    am.fillRect(n2 + b.B[n6 * 2] * n8, n + b.B[n6 * 2 + 1] * n8, 2, 2);
                }
                continue;
            }
            if (hj[n3 + 2] != 3) continue;
            n8 = hj[n3 + 3] / 100;
            if (n8 >= bB[20].a(26)) {
                d.hj[n3] = -1;
                continue;
            }
            bB[20].a(am, 26, n8, n2, n, 0, 0, 0);
        }
    }

    static final void b(int n, int n2, int n3, int n4, b b2) {
        boolean bl = false;
        int n5 = 3;
        if (n3 == 0) {
            n5 = 2;
        }
        for (int i = 2; i <= n5; ++i) {
            b b3 = ff[i];
            while (b3 != null) {
                int n6 = b3.a - n >> 8;
                int n7 = b3.b - n2 >> 8;
                if (n6 == 0 && n7 == 0) {
                    b3 = b3.o;
                    continue;
                }
                int n8 = n6 * n6;
                int n9 = n7 * n7;
                int n10 = n8 + n9;
                int n11 = (n4 >> 8) * (n4 >> 8);
                if (n10 < n11) {
                    int n12 = b.p[0][6] * (n11 - n10) / (n11 * a) * n3 * 2 / 3;
                    int n13 = n12 * n6 / (Math.abs(n6) + Math.abs(n7) + 1) << 8;
                    int n14 = n12 * n7 / (Math.abs(n6) + Math.abs(n7) + 1) << 8;
                    if (i == 3) {
                        if (n13 != 0 || n14 != 0) {
                            if (b3.i[0] == 6) {
                                b3.a((byte)8, b2);
                            }
                            b3.c += n13 / ((b3.j[8] >> 8) + 1) * 16 / 24;
                            b3.d += n14 / ((b3.j[8] >> 8) + 1) * 16 / 24;
                            d.a(b3, b2);
                        }
                        if (b2 == cd) {
                            d.A(1);
                        }
                        b3.d((n11 - n10) * n3 / n11);
                    } else {
                        if (n3 > 0 && (n13 != 0 || n14 != 0)) {
                            b3.e &= 0xFFFFFFE7;
                            b3.e &= 0xFFFFFEFF;
                            b3.e &= 0xFFFFFDFF;
                            if (b3.i[0] != 3) {
                                b3.e |= 0x400;
                            }
                            if (b3.i[0] == 4) {
                                cD = false;
                                cq = null;
                                cp = null;
                            }
                            b3.c += n13 / 43 * 16 / 24;
                            b3.d += n14 / 43 * 16 / 24;
                            d.a(b3, b2);
                            if (b3.i[0] == 8) {
                                b3.i[1] = Math.abs(b3.c) > Math.abs(b3.d) ? (b3.c > 0 ? 0 : 8) : (b3.d > 0 ? 12 : 4);
                            }
                            b3.e();
                        }
                        if (b2 == cd) {
                            d.A(1);
                        }
                        b3.a(9 | Math.max(0, (n11 - n10 * 3) * n3 / n11) << 8, b2);
                    }
                }
                if (bl && b3 == cd) {
                    b3 = null;
                    continue;
                }
                b3 = b3.o;
                if (bl || b3 != null || ee) continue;
                b3 = cd;
                bl = true;
            }
        }
    }

    public static final void a(b b2, b b3) {
        int n = b2.a;
        int n2 = b2.b;
        int n3 = b2.c;
        int n4 = b2.d;
        int n5 = b2.h;
        int n6 = b2.s;
        byte by = b2.i[1];
        int n7 = b2.k;
        b2.c();
        b2.a = n;
        b2.b = n2;
        b2.i[1] = by;
        b2.k = n7;
        if (b2.e(false)) {
            b2.f(0);
            return;
        }
        b2.c = n3;
        b2.d = n4;
        b2.h = n5;
        b2.s = n6;
        if (b2.i[0] == 6) {
            b2.a((byte)8, b3);
        }
    }

    static final void N(int n) {
        if (fp == null) {
            try {
                byte[] byArray = d.b(n);
                fp = new a();
                d.fp.I = true;
                fp.a(byArray, 0);
                fp.a(0, 0, -1, -1);
                fp.a(1, 0, -1, -1);
                fp.a();
                fq = d.b(n + 1);
                return;
            }
            catch (Exception exception) {
                d.W();
            }
        }
    }

    static final void O(int n) {
        if (fr == null) {
            try {
                d.a(n);
                int n2 = cf == 0 ? 12 : 10;
                ft = d.c();
                fu = d.c();
                fw = ft * 24;
                fx = fu * 24;
                fv = ft * fu;
                fr = new byte[n2 * fv];
                int n3 = (fv + 3) / 4;
                fs = new byte[n2 * n3];
                d.a(fr, 0, n2 * fv);
                d.a(fs, 0, n2 * n3);
            }
            catch (Exception exception) {
                d.X();
            }
            fD = fw * fz;
            fE = fx * fA;
        }
    }

    static final void P(int n) {
        if (fy == null) {
            try {
                d.a(n);
                fz = d.c();
                fA = d.c();
                d.c();
                fB = fz * fA;
                fC = d.c();
                fy = new byte[fB];
                d.a(fy, 0, fB);
                return;
            }
            catch (Exception exception) {
                fy = null;
            }
        }
    }

    static final void W() {
        fp = null;
        fq = null;
    }

    static final void X() {
        if (fr != null) {
            fr = null;
            fs = null;
            fq = null;
        }
    }

    static final int Q(int n) {
        return n % fz * fw;
    }

    static final int R(int n) {
        return n / fz * fx;
    }

    static final int p(int n, int n2) {
        return (n / fw >> 8) + (n2 / fx >> 8) * fz;
    }

    static final int q(int n, int n2) {
        return fy[d.p(n, n2)] & 0x1F;
    }

    static final int r(int n, int n2) {
        return (fy[d.p(n, n2)] >> 5 & 7) + cf * 7;
    }

    static final int s(int n, int n2) {
        int n3 = n / ft;
        int n4 = n2 / fu;
        int n5 = n % ft;
        int n6 = n2 % fu;
        int n7 = n3 + n4 * fz;
        n7 = fy[n7] & 0x1F;
        int n8 = n5 + n6 * ft;
        int n9 = n7 * (fv / 4);
        n7 = fr[n7 * fv + n8] & 0xFF;
        return n7 |= (fs[n9 + n8 / 4] >>> (3 - n8 % 4) * 2 & 3) << 16;
    }

    static final int t(int n, int n2) {
        if (n < 0 || n2 < 0) {
            return 2;
        }
        n = (n >> 8) / 24;
        n2 = (n2 >> 8) / 24;
        if (n >= ft * fz || n2 >= fu * fA) {
            return 2;
        }
        int n3 = n / ft;
        int n4 = n2 / fu;
        int n5 = n % ft;
        int n6 = n2 % fu;
        int n7 = n3 + n4 * fz;
        n7 = fy[n7] & 0x1F;
        int n8 = n5 + n6 * ft;
        n7 = fr[n7 * fv + n8] & 0xFF;
        return fq[n7 / 4] >> (3 - (n7 & 3)) * 2 & 3;
    }

    private static void X(int n) {
        int n2 = hk[n];
        if (n2 == 0) {
            return;
        }
        int n3 = n2;
        do {
            b b2;
            if ((b2 = hn[n3]) == cd) {
                if ((d.cd.e & 0x100) != 0 || ee) continue;
                cd.g();
                continue;
            }
            if (!ee || eP != 0 || n != 1 || an[6] <= 0 || cC || d.cd.l < fa) {
                b2.g();
                continue;
            }
            d.T();
            b2.g();
            d.c(b2);
        } while ((n3 = hm[n3] & 0xFF) != n2);
        if (ee && n == 1 && eP == 0 && an[6] > 0 && !cC && d.cd.l >= fa) {
            if (fd != null) {
                fd.a(10246, cd);
            } else {
                d.f(fW + eQ + eS / 2, fX + eR + eT / 2, 0);
            }
            eW = (byte)(eW - 1);
            d.cd.l = 0;
            if (eW == 0) {
                cC = true;
            }
            eO = 72;
            d.cd.c = 0;
            d.cd.d = 0;
            dc |= 4;
        }
    }

    private static void bw() {
        int n;
        if (hk == null) {
            hk = new int[3];
        }
        for (n = 0; n < 3; ++n) {
            d.hk[n] = 0;
        }
        if (hm == null) {
            hm = new int[255];
            hn = new b[255];
        }
        hl = 1;
        for (n = 1; n < 254; ++n) {
            d.hm[n] = n + 1;
        }
        d.hm[254] = 0;
    }

    private static void bx() {
        hm = null;
        hn = null;
    }

    private static void by() {
        d.bx();
        hk = null;
    }

    static final byte a(byte by, b b2) {
        if (hl == 0) {
            return 0;
        }
        int n = hl;
        hl = hm[n];
        d.hn[n] = b2;
        int n2 = hk[by];
        if (n2 == 0) {
            d.hk[by] = n;
            d.hm[n] = n << 8 | n;
        } else {
            int n3 = b2.n();
            int n4 = n2;
            do {
                if (hn[n4].n() < n3) continue;
                if (n4 != n2) break;
                d.hk[by] = n;
                break;
            } while ((n4 = hm[n4] & 0xFF) != n2);
            int n5 = hm[n4] >>> 8;
            d.hm[n5] = hm[n5] & 0xFF00 | n;
            d.hm[n4] = n << 8 | hm[n4] & 0xFF;
            d.hm[n] = n5 << 8 | n4;
        }
        return (byte)(n & 0xFF);
    }

    static final void a(byte by, byte by2) {
        int n;
        int n2 = hm[by2];
        if ((n2 >>>= 8) == (n = n2 & 0xFF)) {
            return;
        }
        int n3 = hn[by2].n();
        int n4 = hk[by];
        if (by2 != n4 && hn[n2].n() > n3) {
            d.hm[n2] = hm[n2] & 0xFF00 | n;
            d.hm[n] = n2 << 8 | hm[n] & 0xFF;
            while (hn[n2].n() > n3) {
                if (n2 == n4) {
                    d.hk[by] = by2;
                    n2 = hm[n2] >>> 8;
                    break;
                }
                n2 = hm[n2] >>> 8;
            }
            n = hm[n2] & 0xFF;
            d.hm[n2] = hm[n2] & 0xFF00 | by2;
            d.hm[n] = by2 << 8 | hm[n] & 0xFF;
            d.hm[by2] = n2 << 8 | n;
            return;
        }
        if (n != n4 && hn[n].n() < n3) {
            d.hm[n2] = hm[n2] & 0xFF00 | n;
            d.hm[n] = n2 << 8 | hm[n] & 0xFF;
            if (by2 == hk[by]) {
                d.hk[by] = n;
                n4 = n;
            }
            while (hn[n].n() < n3 && (n = hm[n] & 0xFF) != n4) {
            }
            n2 = hm[n] >>> 8;
            d.hm[n2] = hm[n2] & 0xFF00 | by2;
            d.hm[n] = by2 << 8 | hm[n] & 0xFF;
            d.hm[by2] = n2 << 8 | n;
        }
    }

    static final void b(byte by, byte by2) {
        if (by < 0 || by2 == 0) {
            return;
        }
        int n = hm[by2];
        int n2 = n & 0xFF;
        if ((n >>>= 8) == by2) {
            d.hk[by] = 0;
        } else {
            d.hm[n] = hm[n] & 0xFF00 | n2;
            d.hm[n2] = n << 8 | hm[n2] & 0xFF;
            if (by2 == hk[by]) {
                d.hk[by] = n2;
            }
        }
        d.hm[by2] = hl;
        hl = by2;
    }

    static final void Y() {
        if (ho == null) {
            ho = Image.createImage((int)264, (int)312);
            fF = ho.getGraphics();
            System.gc();
        }
        if (fK != 1) {
            fR = 61440 / (fz * ft);
            fS = 68608 / (fA * fu);
            if (fR > 256) {
                fR = 256;
            }
            if (fS > 256) {
                fS = 256;
            }
            int n = 264 / ft;
            for (int i = 0; i < fr.length / fv; ++i) {
                int n2 = i % n * ft;
                int n3 = i / n * fu;
                for (int j = 0; j < ft; ++j) {
                    for (int k = 0; k < fu; ++k) {
                        int n4 = fr[i * fv + j + k * ft] & 0xFF;
                        fF.setColor(fM[fq[n4 / 4] >> (3 - (n4 & 3)) * 2 & 3]);
                        fF.fillRect(n2 + j * fR / 256, n3 + k * fS / 256, 1, 1);
                    }
                }
            }
        }
        fG = -1;
        fH = -1;
    }

    static final void d(int n, int n2, int n3, int n4) {
        if (n3 > fz * ft) {
            n3 = fz * ft;
        }
        if (n4 > fA * fu) {
            n4 = fA * fu;
        }
        if (n == n3 || n2 == n4) {
            return;
        }
        fF.setClip(0, 0, 264, 312);
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                d.u(i, j);
            }
        }
    }

    static final void Z() {
        if (ee) {
            d.Q();
            return;
        }
        if (fK != fL) {
            fG = -1;
            fH = -1;
            d.Y();
            fL = fK;
        }
        if (fK == 22) {
            return;
        }
        int n = fU;
        int n2 = fV;
        int n3 = n / 24;
        int n4 = n2 / 24;
        int n5 = fI / 24;
        int n6 = fJ / 24;
        if (n3 == fG && n4 == fH) {
            fI = n;
            fJ = n2;
            return;
        }
        if (fG == -1 && fH == -1 || Math.abs(n3 - n5) >= 11 || Math.abs(n4 - n6) >= 13) {
            d.d(n3, n4, n3 + 11, n4 + 13);
        } else {
            int n7;
            int n8 = n >= fI ? n5 : n3;
            int n9 = n2 >= fJ ? n6 : n4;
            int n10 = n3 + n5 - n8;
            int n11 = n4 + n6 - n9;
            int n12 = fI < n ? n8 + 11 : n8;
            if (n12 == (n7 = n12 - n8 + n10)) {
                if (n > fI) {
                    --n12;
                } else if (n < fI) {
                    ++n7;
                }
            }
            int n13 = fJ <= n2 ? n11 : n9;
            int n14 = n13 + 13;
            d.d(n12, n13, n7, n14);
            n12 = n10;
            n7 = n8 + 11;
            n13 = fJ < n2 ? n9 + 13 : n9;
            int n15 = n14 = fJ < n2 ? n11 + 13 : n11;
            if (n13 == n14) {
                if (n2 > fJ) {
                    --n13;
                } else if (n2 < fJ) {
                    ++n14;
                }
            }
            d.d(n12, n13, n7, n14);
        }
        fG = n3;
        fH = n4;
        fI = n;
        fJ = n2;
    }

    static final void u(int n, int n2) {
        int n3;
        int n4;
        int n5 = n >= fz * ft || n < 0 || n2 >= fA * fu || n2 < 0 ? -1 : d.s(n, n2);
        int n6 = n5 & 0xFFFF;
        int n7 = n5 >> 16;
        int n8 = n * 24;
        int n9 = n2 * 24;
        if (!ee) {
            n4 = n % 11 * 24;
            n3 = n2 % 13 * 24;
        } else {
            n4 = n8 - (eK + fU);
            n3 = n9 - (eL + fV);
        }
        int n10 = n8 - n4;
        int n11 = n9 - n3;
        if (n5 == -1) {
            fF.setColor(0xBBBBDD);
            fF.fillRect(n4, n3, 24, 24);
        } else {
            if ((n7 & 1) != 0) {
                n4 += 24;
            }
            if ((n7 & 2) != 0) {
                n3 += 24;
            }
            fp.a(fF, n6, n4, n3, n7, 0, 0);
        }
        if (bb == null) {
            return;
        }
        boolean bl = false;
        short[][] sArray = bb;
        int n12 = d.p(n8 << 8, n9 << 8);
        int n13 = fy[n12] & 0x1F;
        if (sArray[n13] == null) {
            return;
        }
        a a2 = bB[cf == 0 ? 15 : 17];
        a a3 = bB[cf == 0 ? 16 : 18];
        int n14 = d.Q(n12);
        int n15 = d.R(n12);
        fF.setClip(n8 - n10, n9 - n11, 24, 24);
        for (int i = 0; i < sArray[n13].length; i += 5) {
            short s = sArray[n13][i + 4];
            if (s >= 0 && s != n12) continue;
            int n16 = sArray[n13][i + 0] + n14;
            int n17 = sArray[n13][i + 1] + n15;
            short s2 = sArray[n13][i + 2];
            short s3 = sArray[n13][i + 3];
            byte by = 0;
            byte by2 = 0;
            if (cf == 0 && (s2 == 0 || s2 == 4 || s2 == 10 || s2 == 11 || s2 == 26 || s2 == 27 || s2 == 42 || s2 == 43 || s2 == 44)) {
                by2 = a3.e[s2];
                by = a3.f[s2];
                bl = true;
            } else if (cf != 0 && (s2 == 23 || s2 == 24 || s2 == 25 || s2 == 26 || s2 == 27 || s2 == 28 || s2 == 29)) {
                by2 = a3.e[s2];
                by = a3.f[s2];
                bl = true;
            } else {
                by2 = a2.e[s2];
                by = a2.f[s2];
                bl = false;
            }
            int n18 = n16 + by2;
            int n19 = n17 + by;
            if (n16 >= n8 + 24 || n18 <= n8 || n17 >= n9 + 24 || n19 <= n9) continue;
            if (bl) {
                a3.a(fF, (int)s2, n16 - n10, n17 - n11, (int)s3);
                continue;
            }
            a2.a(fF, (int)s2, n16 - n10, n17 - n11, (int)s3);
        }
        fF.setClip(0, 0, 264, 312);
    }

    static final void b(Graphics graphics) {
        int n = fU % 264;
        int n2 = fV % 312;
        int n3 = 264 - n;
        int n4 = 264 - n3;
        int n5 = 312 - n2;
        int n6 = 312 - n5;
        d.b(0, 18, n3, n5, 0 - n, 18 - n2);
        d.b(0 + n3, 18, n4, n5, 0 + n3, 18 - n2);
        d.b(0, 18 + n5, n3, n6, 0 - n, 18 + n5);
        d.b(0 + n3, 18 + n5, n4, n6, 0 + n3, 18 + n5);
        graphics.setClip(0, 18, 240, 276);
    }

    private static void b(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n < fN) {
            n3 = n3 - fN + n;
            n = fN;
        }
        if (n2 < fO) {
            n4 = n4 - fO + n2;
            n2 = fO;
        }
        if (n + n3 > fN + fP) {
            n3 = fN + fP - n;
        }
        if (n2 + n4 > fO + fQ) {
            n4 = fO + fQ - n2;
        }
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        am.setClip(n, n2, n3, n4);
        am.drawImage(ho, n5, n6, 20);
    }

    static final void c(Graphics graphics) {
        int n = 264 / ft;
        int n2 = fR * ft >> 8;
        int n3 = fS * fu >> 8;
        for (int i = 0; i < fz; ++i) {
            for (int j = 0; j < fA; ++j) {
                int n4 = fy[i + j * fz] & 0x1F;
                int n5 = i * n2;
                int n6 = j * n3;
                graphics.drawRegion(ho, n4 % n * ft, n4 / n * fu, n2, n3, 0, ad + n5, ae + n6, 20);
            }
        }
    }

    static final void a(a a2, int n, int n2, int n3, int n4, int n5) {
        a2.a(fT, n, n2, n3, n4, n5, 0, 0);
        int n6 = fU / 24 * 24;
        int n7 = fV / 24 * 24;
        int n8 = (fT[0] >> 8) - n6;
        int n9 = (fT[1] >> 8) - n7;
        int n10 = (n3 >> 8) - n6;
        int n11 = (n4 >> 8) - n7;
        n10 += (n6 %= 264);
        n11 += (n7 %= 312);
        int n12 = n8 + (fT[2] - fT[0] >> 8);
        int n13 = n9 + (fT[3] - fT[1] >> 8);
        int n14 = 264 - n6;
        int n15 = 312 - n7;
        if (n8 < n14 && n9 < n15) {
            fF.setClip(n6, n7, n14, n15);
            a2.a(fF, n, n2, n10, n11, n5, 0, 0);
        }
        if (n12 > n14 && n9 < n15) {
            fF.setClip(0, n7, n6, n15);
            a2.a(fF, n, n2, n10 - 264, n11, n5, 0, 0);
        }
        if (n12 > n14 && n13 > n15) {
            fF.setClip(0, 0, n6, n7);
            a2.a(fF, n, n2, n10 - 264, n11 - 312, n5, 0, 0);
        }
        if (n8 < n14 && n13 > n15) {
            fF.setClip(n6, 0, n14, n7);
            a2.a(fF, n, n2, n10, n11 - 312, n5, 0, 0);
        }
        fF.setClip(0, 0, 264, 312);
    }

    static final void a(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = fU / 24 * 24;
        int n9 = fV / 24 * 24;
        int n10 = (n >> 8) - n8;
        int n11 = (n2 >> 8) - n9;
        int n12 = (n10 += (n8 %= 264)) + (n3 - n >> 8);
        int n13 = (n11 += (n9 %= 312)) + (n4 - n2 >> 8);
        fF.setColor(n6);
        fF.setClip(n8, n9, 264 - n8, 312 - n9);
        for (n7 = 0; n7 < n5; ++n7) {
            fF.drawLine(n10 + n7, n11 + n7 / 2, n12 + n7, n13 + n7 / 2);
        }
        if (n10 > 264 - n8 || n12 > 264 - n8) {
            fF.setClip(0, n9, n8, 312 - n9);
            for (n7 = 0; n7 < n5; ++n7) {
                fF.drawLine(n10 + n7 - 264, n11 + n7 / 2, n12 + n7 - 264, n13 + n7 / 2);
            }
            if (n11 > 312 - n9 || n13 > 312 - n9) {
                fF.setClip(0, 0, n8, n9);
                for (n7 = 0; n7 < n5; ++n7) {
                    fF.drawLine(n10 + n7 - 264, n11 + n7 / 2 - 312, n12 + n7 - 264, n13 + n7 / 2 - 312);
                }
            }
        }
        if (n11 > 312 - n9 || n13 > 312 - n9) {
            fF.setClip(n8, 0, 264 - n8, n9);
            for (n7 = 0; n7 < n5; ++n7) {
                fF.drawLine(n10 + n7, n11 + n7 / 2 - 312, n12 + n7, n13 + n7 / 2 - 312);
            }
        }
        fF.setClip(0, 0, 264, 312);
    }

    public static final boolean v(int n, int n2) {
        return n < fW + 61440 && n2 < fX + 70656 && n > fW && n2 > fX;
    }

    public static final boolean d(b b2) {
        if (!ee) {
            return b2.a - b2.j[2] + b2.j[4] > fW && b2.b - b2.j[3] + b2.j[5] > fX && b2.a - b2.j[2] < fW + 61440 && b2.b - b2.j[3] < fX + 70656;
        }
        return b2.a - b2.j[2] + b2.j[4] > fW + eQ && b2.b - b2.j[3] + b2.j[5] > fX + eR && b2.a - b2.j[2] < fW + eQ + eS && b2.b - b2.j[3] < fX + eR + eT;
    }

    private static void C(int n, int n2) {
        fW = n;
        fX = n2;
        fW = Math.max(0, fW);
        fX = Math.max(0, fX);
        fW = Math.min(fW, fD - 240 - 1 << 8);
        fX = Math.min(fX, fE - 276 - 1 << 8);
        fU = fW >> 8;
        fV = fX >> 8;
        hp = fW;
        hq = fX;
        hr = 0;
        hs = 0;
        fG = -1;
        fH = -1;
        if (T != 6) {
            d.Z();
        }
    }

    private static void bz() {
        if (ht == 3 || ht == 2) {
            return;
        }
        if (ht == 0 && (d.cd.e & 8) == 0 && d.cd.c == 0 && d.cd.d == 0) {
            hr = 0;
            hs = 0;
            return;
        }
        int n = (d.fY.e & 3) == 3 ? d.fY.h * 16 / 24 * 20 / b.p[0][6] : 10;
        hr = (d.fY.c >> 8) * 24 / 16;
        hs = (d.fY.d >> 8) * 24 / 16;
        if (fY == cd && at - gM >= 0L && at - gM < 200L) {
            n = 0;
            hr = 0;
            hs = 0;
        }
        int n2 = d.j(256 - d.fY.i[1] * 16);
        int n3 = d.i(256 - d.fY.i[1] * 16);
        int n4 = 0;
        int n5 = 0;
        if (n2 != 0) {
            n4 = (n2 >= 0 ? 1 : -1) * 6144;
        }
        if (n3 != 0) {
            n5 = (n2 >= 0 ? 1 : -1) * 6144;
        }
        hp = n4 + fY.m() - 30720 + n * 24 / 16 * 240 * n2 / 50;
        hq = n5 + fY.n() - 35328 + n * 24 / 16 * 276 * n3 / 50;
    }

    static final void e(b b2) {
        int n = b2.m();
        int n2 = b2.n();
        int n3 = d.cd.a;
        int n4 = d.cd.b;
        hp = (n + n3) / 2 - 30720;
        hq = (n2 + n4) / 2 - 35328;
        hp = Math.min(hp, n3 + 61440 - 6144);
        hq = Math.min(hq, n4 + 70656 - 6144);
        hp = Math.max(hp, n3 - 61440 + 6144);
        hq = Math.max(hq, n4 - 70656 + 6144);
        hr = 0;
        hs = 0;
    }

    private static void bA() {
        if (Math.abs(fW - hp) < 768 && Math.abs(fX - hq) < 768) {
            hr = 0;
            hs = 0;
            d.Z();
            if (ht == 2) {
                ht = (byte)3;
            }
            return;
        }
        if (ht == 0 && (d.cd.e & 8) == 0 && d.cd.c == 0 && d.cd.d == 0 && fG != -1 && fH != -1) {
            return;
        }
        int n = fW;
        int n2 = fX;
        fW += hr * 100;
        fX += hs * 100;
        if (ht == 2) {
            if (Math.abs(fW - hp) <= Math.abs(hr * 100)) {
                hr = (hp - fW) / 200;
            }
            if (Math.abs(fX - hq) <= Math.abs(hs * 100)) {
                hs = (hq - fX) / 200;
            }
        } else {
            fW += (hp - fW) * 100 / 900;
            fX += (hq - fX) * 100 / 900;
        }
        fW = Math.max(0, fW);
        fX = Math.max(0, fX);
        fW = Math.min(fW, fD - 240 - 1 << 8);
        fX = Math.min(fX, fE - 276 - 1 << 8);
        if (ht == 0 && cA && (Math.abs(fW - cd.m() + 30720) > 30720 && cd.m() > 0 && cd.m() < fD || Math.abs(fX - cd.n() + 35328) > 35328 && cd.n() > 0 && cd.n() < fE)) {
            hr = 0;
            hs = 0;
            fW = n;
            fX = n2;
        }
        fU = fW >> 8;
        fV = fX >> 8;
        d.Z();
    }

    private static boolean bB() {
        short[] sArray = dO[hu];
        if (an[13] < 0) {
            ht = 0;
            fY = cd;
            hp = fY.m() - 30720;
            hq = fY.n() - 35328;
            hr = 0;
            hs = 0;
            d.C(hp, hq);
            hv = sArray.length;
            return true;
        }
        if (hv >= sArray.length) {
            ht = 0;
            fY = cd;
            return true;
        }
        if (ht == 2) {
            return false;
        }
        switch (sArray[hv + 1]) {
            case 0: 
            case 1: 
            case 2: {
                d.C(hp, hq);
                ht = (byte)3;
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                break;
            }
            case 6: {
                if (fY == null) {
                    return true;
                }
                d.bz();
                if (!(sArray[hv + 2] <= 0 ? d.fY.i[2] != -1 : (hw -= 100) > 0)) break;
                return false;
            }
            case 7: {
                if ((hw -= 100) <= 0) break;
                return false;
            }
            case 8: {
                if (++hw * 3 >= 80) break;
                int n = 240 - 240 * hw * 3 / 80;
                int n2 = 256 - 256 * hw * 3 / 80;
                int n3 = 0 + (240 - n) / 2;
                int n4 = 32 + (256 - n2) / 2;
                am.setClip(0, 32, 240, 256);
                am.setColor(0);
                am.fillRect(0, 32, 240, 256);
                am.setClip(n3, n4, n, n2);
                return false;
            }
            case 9: {
                return false;
            }
        }
        return d.bC();
    }

    private static boolean bC() {
        short[] sArray = dO[hu];
        hv = hv < 0 ? 0 : (hv += sArray[hv] + 1);
        if (hv >= sArray.length) {
            ht = 0;
            fY = cd;
            return true;
        }
        switch (sArray[hv + 1]) {
            case 3: 
            case 5: {
                ht = (byte)2;
            }
            case 0: 
            case 2: {
                if (sArray[hv + 1] == 5 || sArray[hv + 1] == 2) {
                    fY = cd;
                } else {
                    int n = -1;
                    if (sArray[hv + 2] == 0) {
                        n = 2;
                    } else if (sArray[hv + 2] == 1) {
                        n = 3;
                    } else if (sArray[hv + 2] == 2) {
                        n = 0;
                    }
                    b b2 = ff[n];
                    while (b2 != null && ((b2.e & 0x800) == 0 || b2.g != sArray[hv + 3])) {
                        b2 = b2.o;
                    }
                    fY = b2;
                }
                hp = fY.m() - 30720;
                hq = fY.n() - 35328;
                break;
            }
            case 4: {
                ht = (byte)2;
            }
            case 1: {
                if (sArray[hv + 2] == 3) {
                    hp = d.i(sArray[hv + 4], sArray[hv + 3]) + (d.k(sArray[hv + 4], sArray[hv + 3]) / 2 << 8);
                    hq = d.j(sArray[hv + 4], sArray[hv + 3]) + (d.l(sArray[hv + 4], sArray[hv + 3]) / 2 << 8);
                } else if (sArray[hv + 2] == 4) {
                    short s = sArray[hv + 4];
                    int n = fy[s] & 0x1F;
                    hp = b.c(n, sArray[hv + 3]) + (d.Q(s) << 8);
                    hq = b.d(n, sArray[hv + 3]) + (d.R(s) << 8);
                }
                hp -= 30720;
                hq -= 35328;
                break;
            }
            case 6: {
                hw = sArray[hv + 2] > 0 ? sArray[hv + 2] * 1000 : -1;
                ht = 1;
                break;
            }
            case 7: {
                hw = sArray[hv + 2] * 1000;
                break;
            }
            case 8: {
                hw = 0;
                break;
            }
            case 9: {
                bD = 0;
                ew = d.m(sArray[hv + 2]);
                ey = 0;
                cS = sArray[hv + 3];
            }
        }
        hp = Math.max(0, hp);
        hq = Math.max(0, hq);
        hp = Math.min(hp, fD - 240 - 1 << 8);
        hq = Math.min(hq, fE - 276 - 1 << 8);
        if (sArray[hv + 1] != 7 && sArray[hv + 1] != 8 && sArray[hv + 1] != 9) {
            if (ht == 2) {
                hr = (hp - fW) / 10000;
                hs = (hq - fX) / 10000;
                if (Math.abs(hr * 100) < 6144) {
                    hr = hr < 0 ? -61 : 61;
                }
                if (Math.abs(hs * 100) < 6144) {
                    hs = hs < 0 ? -61 : 61;
                }
            } else {
                hr = 0;
                hs = 0;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static final boolean h(boolean bl) {
        RecordStore recordStore;
        block46: {
            recordStore = null;
            RecordEnumeration recordEnumeration = null;
            try {
                recordStore = RecordStore.openRecordStore((String)"mygame", (boolean)true);
                recordEnumeration = recordStore.enumerateRecords(null, null, false);
                if (bl) {
                    int n;
                    d.ge[0] = (byte)L;
                    d.ge[1] = ah;
                    d.ge[2] = cH;
                    if (cx > 999999999) {
                        cx = 999999999;
                    }
                    d.ge[3] = (byte)(cx >>> 24);
                    d.ge[4] = (byte)(cx >>> 16);
                    d.ge[5] = (byte)(cx >>> 8);
                    d.ge[6] = (byte)(cx & 0xFF);
                    d.ge[7] = cy;
                    d.ge[8] = (byte)cn;
                    System.arraycopy(ev, 0, ge, 9, 3);
                    System.arraycopy(gY, 0, ge, 12, 15);
                    d.ge[27] = cz = d.aK();
                    d.ge[28] = 0;
                    int n2 = 0;
                    for (n = 0; n < 4; ++n) {
                        if (n != 0 && n % 8 == 0) {
                            ++n2;
                        }
                        int n3 = 28 + n2;
                        ge[n3] = (byte)(ge[n3] | gZ[n] << n - n2 * 8);
                    }
                    for (n = 0; n < 6; ++n) {
                        d.ge[32 + n * 4] = (byte)(cm[n] >>> 24);
                        d.ge[32 + n * 4 + 1] = (byte)(cm[n] >>> 16);
                        d.ge[32 + n * 4 + 2] = (byte)(cm[n] >>> 8);
                        d.ge[32 + n * 4 + 3] = (byte)(cm[n] & 0xFF);
                    }
                    d.ge[56] = cf;
                    d.ge[57] = ch;
                    d.ge[58] = ci;
                    for (n = 0; n < 14; ++n) {
                        d.ge[59 + n * 2] = (byte)(dt[n] >>> 8);
                        d.ge[59 + n * 2 + 1] = (byte)(dt[n] & 0xFF);
                    }
                    for (n = 0; n < 70; ++n) {
                        d.ge[87 + n * 2] = (byte)(dq[n] >>> 8);
                        d.ge[87 + n * 2 + 1] = (byte)(dq[n] & 0xFF);
                    }
                    for (n = 0; n < 7 * dA; ++n) {
                        d.ge[227 + n * 2] = (byte)(dD[n] >>> 8);
                        d.ge[227 + n * 2 + 1] = (byte)(dD[n] & 0xFF);
                    }
                    d.ge[d.fZ] = (byte)(dB ? 1 : 0);
                    d.ge[d.ga] = (byte)((int)(aw / 1000L & 0xFFL) >>> 24);
                    d.ge[d.ga + 1] = (byte)((int)(aw / 1000L & 0xFFL) >>> 16);
                    d.ge[d.ga + 2] = (byte)((int)(aw / 1000L & 0xFFL) >>> 8);
                    d.ge[d.ga + 3] = (byte)((int)(aw / 1000L & 0xFFL) & 0xFF);
                    d.ge[d.gb] = (byte)(dd ? 1 : 0);
                    d.ge[d.gc] = (byte)(aX ? 1 : 0);
                    if (recordEnumeration.hasNextElement()) {
                        int n4 = recordEnumeration.nextRecordId();
                        recordStore.setRecord(n4, ge, 0, ge.length);
                    } else {
                        recordStore.addRecord(ge, 0, ge.length);
                    }
                } else {
                    byte[] byArray;
                    block44: {
                        block45: {
                            int n = recordEnumeration.nextRecordId();
                            byArray = recordStore.getRecord(n);
                            if (byArray.length == gd) break block44;
                            boolean bl2 = false;
                            if (recordEnumeration == null) break block45;
                            recordEnumeration.reset();
                            recordEnumeration.destroy();
                        }
                        if (recordStore != null) {
                            try {
                                recordStore.closeRecordStore();
                            }
                            catch (RecordStoreException recordStoreException) {}
                        }
                        System.gc();
                        return false;
                    }
                    try {
                        int n;
                        L = byArray[0] & 0xFF;
                        ah = byArray[1];
                        cH = byArray[2];
                        cx = (byArray[3] & 0xFF) << 24 | (byArray[4] & 0xFF) << 16 | (byArray[5] & 0xFF) << 8 | byArray[6] & 0xFF;
                        cy = byArray[7];
                        cn = byArray[8];
                        System.arraycopy(byArray, 9, ev, 0, 3);
                        System.arraycopy(byArray, 12, gY, 0, 15);
                        cz = byArray[27];
                        int n5 = 0;
                        for (n = 0; n < 4; ++n) {
                            if (n != 0 && n % 8 == 0) {
                                ++n5;
                            }
                            d.gZ[n] = (byte)(byArray[28 + n5] >> n - n5 * 8 & 1);
                        }
                        for (n = 0; n < 6; ++n) {
                            d.cm[n] = (byArray[32 + n * 4] & 0xFF) << 24 | (byArray[32 + n * 4 + 1] & 0xFF) << 16 | (byArray[32 + n * 4 + 2] & 0xFF) << 8 | byArray[32 + n * 4 + 3] & 0xFF;
                        }
                        cf = byArray[56];
                        ch = byArray[57];
                        ci = byArray[58];
                        for (n = 0; n < 14; ++n) {
                            d.dt[n] = (short)((byArray[59 + n * 2] & 0xFF) << 8 | byArray[59 + n * 2 + 1] & 0xFF);
                        }
                        for (n = 0; n < 70; ++n) {
                            d.dq[n] = (short)((byArray[87 + n * 2] & 0xFF) << 8 | byArray[87 + n * 2 + 1] & 0xFF);
                        }
                        for (n = 0; n < 7 * dA; ++n) {
                            d.dD[n] = (short)((byArray[227 + n * 2] & 0xFF) << 8 | byArray[227 + n * 2 + 1] & 0xFF);
                        }
                        dB = byArray[fZ] > 0;
                        aw = ((byArray[ga] & 0xFF) << 24 | (byArray[ga + 1] & 0xFF) << 16 | (byArray[ga + 2] & 0xFF) << 8 | byArray[ga + 3] & 0xFF) * 1000;
                        dd = byArray[gb] != 0;
                        boolean bl2 = aX = byArray[gc] != 0;
                        if ((gY[0] & 3) == 2) {
                            ac = true;
                        }
                    }
                    catch (InvalidRecordIDException invalidRecordIDException) {
                        recordEnumeration.reset();
                        boolean bl4 = false;
                        if (recordEnumeration != null) {
                            recordEnumeration.reset();
                            recordEnumeration.destroy();
                        }
                        if (recordStore != null) {
                            try {
                                recordStore.closeRecordStore();
                            }
                            catch (RecordStoreException recordStoreException) {}
                        }
                        System.gc();
                        return false;
                    }
                }
                if (recordEnumeration == null) break block46;
            }
            catch (RecordStoreException recordStoreException) {
                block47: {
                    try {
                        boolean bl5 = false;
                        if (recordEnumeration == null) break block47;
                    }
                    catch (Throwable throwable) {
                        if (recordEnumeration != null) {
                            recordEnumeration.reset();
                            recordEnumeration.destroy();
                        }
                        if (recordStore != null) {
                            try {
                                recordStore.closeRecordStore();
                            }
                            catch (RecordStoreException recordStoreException2) {}
                        }
                        System.gc();
                        throw throwable;
                    }
                    recordEnumeration.reset();
                    recordEnumeration.destroy();
                }
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (RecordStoreException recordStoreException3) {}
                }
                System.gc();
                return false;
            }
            recordEnumeration.reset();
            recordEnumeration.destroy();
        }
        if (recordStore != null) {
            try {
                recordStore.closeRecordStore();
            }
            catch (RecordStoreException recordStoreException) {}
        }
        System.gc();
        return true;
    }

    private static void bD() {
        int n;
        aw = 0L;
        dB = false;
        bM = 0;
        cx = 20;
        cy = 0;
        cn = (short)100;
        for (n = 0; n < gY.length; ++n) {
            d.gY[n] = 0;
        }
        d.gY[0] = 1;
        for (n = 0; n < 14; ++n) {
            d.dt[n] = 0;
        }
        for (n = 0; n < 4; ++n) {
            d.gZ[n] = 0;
        }
        for (n = 0; n < 6; ++n) {
            d.cm[n] = 0;
        }
        for (n = 0; n < 70; ++n) {
            d.dq[n] = 0;
        }
        for (n = 0; n < 7 * dA; ++n) {
            d.dD[n] = 0;
        }
        d.O();
        d.P();
        d.cm[0] = -1;
        cf = 0;
        ci = (byte)35;
        ch = 0;
        dP = -1;
        ex = "";
        dd = false;
        ac = false;
        d.h(true);
        ax = 0L;
        a.H = false;
    }

    static final void aa() {
        long l = System.currentTimeMillis();
        if (l < gj) {
            gj = l;
            bZ = false;
            gi = 0;
        }
        if (l - gj < 60000L) {
            return;
        }
        gi = 0;
        bZ = false;
        if (l - gj < 360000L) {
            return;
        }
        gj = l;
        int n = d.a(0, 5);
        if (n == 2) {
            gi = 1;
            d.ab();
            bZ = true;
        }
    }

    static final void ab() {
        if (gi == 1) {
            for (int i = 0; i < 18; ++i) {
                d.gf[i] = d.a(0, 240);
                d.gg[i] = d.a(18, 294);
                d.gh[i] = d.a(5, 18);
            }
        }
    }

    static final void d(Graphics graphics) {
        boolean bl = false;
        if (gi == 1) {
            graphics.setColor(8361628);
            for (int i = 0; i < 18; ++i) {
                if (gg[i] > 294) {
                    d.gf[i] = d.a(0, 240);
                    d.gg[i] = 18 - gh[i];
                } else {
                    int n = i;
                    gg[n] = gg[n] + gh[i];
                    int n2 = i;
                    gf[n2] = gf[n2] + 0;
                }
                if (gf[i] > 240) {
                    d.gf[i] = 0;
                } else if (gf[i] < 0) {
                    d.gf[i] = 240;
                }
                int n = gf[i];
                int n3 = gg[i];
                int n4 = gg[i] + gh[i];
                graphics.drawLine(n, n3, n, n4);
            }
        }
    }

    static final long S(int n) {
        long l = 0L;
        for (int i = n; i > 0; --i) {
            l <<= 1;
            if (gn >= (go >>= 1)) {
                gn -= go;
                l |= 1L;
            }
            if (go >= 0x1000000L) continue;
            go <<= 8;
            gn = gn << 8 | (long)(gl[gm++] & 0xFF);
        }
        return l & 0xFFFFFFFFFFFFFFFFL;
    }

    static final int T(int n) {
        int n2 = gk[n] & 0xFFFF;
        long l = (go >> 11) * (long)n2;
        int n3 = 0;
        if (gn < l) {
            go = l;
            n2 += 2048 - n2 >> 5;
        } else {
            go -= l;
            gn -= l;
            n2 -= n2 >> 5;
            n3 = 1;
        }
        if (go < 0x1000000L) {
            gn = gn << 8 | (long)(gl[gm++] & 0xFF);
            go <<= 8;
        }
        d.gk[n] = (short)n2;
        return n3;
    }

    static final int w(int n, int n2) {
        int n3 = 1;
        for (int i = n2; i > 0; --i) {
            n3 = n3 + n3 + d.T(n + n3);
        }
        return n3 - (1 << n2);
    }

    static final int x(int n, int n2) {
        int n3 = 1;
        int n4 = 0;
        for (int i = 0; i < n2; ++i) {
            int n5 = d.T(n + n3);
            n3 = n3 + n3 + n5;
            n4 |= n5 << i;
        }
        return n4;
    }

    static final int y(int n, int n2) {
        if (d.T(n + 0) == 0) {
            return d.w(n + 2 + (n2 << 3), 3);
        }
        if (d.T(n + 1) == 0) {
            return 8 + d.w(n + 130 + (n2 << 3), 3);
        }
        return 16 + d.w(n + 258, 8);
    }

    static final byte[] b(byte[] byArray) {
        int n;
        int n2;
        gl = byArray;
        int n3 = 0;
        for (n2 = 0; n2 < 4; ++n2) {
            n3 += (gl[n2 + 5] & 0xFF) << n2 * 8;
        }
        int n4 = 0;
        for (n = gl[0] & 0xFF; n >= 45; n -= 45) {
            ++n4;
        }
        int n5 = 0;
        while (n >= 9) {
            ++n5;
            n -= 9;
        }
        int n6 = n;
        byte[] byArray2 = new byte[n3];
        int n7 = 1846 + (768 << n6 + n5);
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 1;
        int n12 = 1;
        int n13 = 1;
        int n14 = 1;
        int n15 = 0;
        int n16 = (1 << n4) - 1;
        int n17 = (1 << n5) - 1;
        int n18 = 0;
        for (n2 = 0; n2 < n7; ++n2) {
            d.gk[n2] = 1024;
        }
        gm = 13;
        gn = 0L;
        go = 0xFFFFFFFFL;
        for (n2 = 0; n2 < 5; ++n2) {
            gn = gn << 8 | (long)(gl[gm++] & 0xFF);
        }
        while (n15 < n3) {
            int n19;
            int n20;
            int n21 = n15 & n16;
            if (d.T(0 + (n8 << 4) + n21) == 0) {
                n20 = 1846 + 768 * (((n15 & n17) << n6) + ((n10 & 0xFF) >> 8 - n6));
                n8 = n8 < 4 ? 0 : (n8 < 10 ? (n8 -= 3) : (n8 -= 6));
                if (n9 != 0) {
                    n2 = 1;
                    n9 = byArray2[n15 - n11] & 0xFF;
                    do {
                        int n22 = n9 >> 7 & 1;
                        n9 <<= 1;
                        n19 = d.T(n20 + (1 + n22 << 8) + n2);
                        n2 = n2 << 1 | n19;
                        if (n22 == n19) continue;
                        while (n2 < 256) {
                            n2 = n2 + n2 | d.T(n20 + n2);
                        }
                        break;
                    } while (n2 < 256);
                    n10 = (byte)n2;
                    n9 = 0;
                } else {
                    n2 = 1;
                    while ((n2 = n2 + n2 | d.T(n20 + n2)) < 256) {
                    }
                    n10 = (byte)n2;
                }
                byArray2[n15++] = (byte)n10;
                continue;
            }
            n9 = 1;
            if (d.T(192 + n8) == 1) {
                if (d.T(204 + n8) == 0) {
                    if (d.T(240 + (n8 << 4) + n21) == 0) {
                        n8 = n8 < 7 ? 9 : 11;
                        n10 = byArray2[n15 - n11];
                        byArray2[n15++] = (byte)n10;
                        continue;
                    }
                } else {
                    if (d.T(216 + n8) == 0) {
                        n20 = n12;
                    } else {
                        if (d.T(228 + n8) == 0) {
                            n20 = n13;
                        } else {
                            n20 = n14;
                            n14 = n13;
                        }
                        n13 = n12;
                    }
                    n12 = n11;
                    n11 = n20;
                }
                n18 = d.y(1332, n21);
                n8 = n8 < 7 ? 8 : 11;
            } else {
                n14 = n13;
                n13 = n12;
                n12 = n11;
                n8 = n8 < 7 ? 7 : 10;
                n18 = d.y(818, n21);
                n20 = d.w(432 + ((n18 < 4 ? n18 : 3) << 6), 6);
                if (n20 >= 4) {
                    n19 = (n20 >> 1) - 1;
                    n11 = (2 | n20 & 1) << n19;
                    if (n20 < 14) {
                        n11 += d.x(688 + n11 - n20 - 1, n19);
                    } else {
                        n11 = (int)((long)n11 + (d.S(n19 - 4) << 4));
                        n11 += d.x(802, 4);
                    }
                } else {
                    n11 = n20;
                }
                ++n11;
            }
            if (n11 == 0) break;
            n18 += 2;
            do {
                n10 = byArray2[n15 - n11];
                byArray2[n15++] = (byte)n10;
            } while (--n18 > 0 && n15 < n3);
        }
        gl = null;
        return byArray2;
    }

    static {
        d = 65536 / (a * 2);
        N = new byte[]{1, 15, 15, 40, 40, 10, 10, 50, 30, 5, 80, 80, 80, 80, 80, 80, 60, 55, 70, 1, 65, 65, 90, 90};
        P = -1;
        Q = -1;
        R = -1;
        S = false;
        aa = false;
        af = 239;
        ag = false;
        ah = 1;
        ai = false;
        aj = false;
        ak = false;
        al = false;
        am = null;
        aq = false;
        ar = false;
        as = false;
        au = 0L;
        av = 0L;
        aw = 0L;
        ax = 0L;
        ay = System.currentTimeMillis();
        az = 0;
        aS = 0;
        aU = false;
        aV = new String("no").toUpperCase();
        aW = new String("del").toUpperCase();
        aX = true;
        bn = new String[]{"/d", "/i", "/j", "/k", "/l", "/m", "/p"};
        by = new boolean[]{false, false, true, false, false, false, false, false, true, true, true, true, true, true, false, true, false, true, false, true, false, false, false, false, false, false, false, false};
        bB = new a[28];
        bL = 0;
        bN = 0L;
        bO = false;
        bP = false;
        bQ = false;
        bR = false;
        bT = false;
        bW = 0;
        bX = new int[36];
        bY = false;
        bZ = false;
        int[] nArray = new int[]{1342177480, 1644167368, 1560281288, 2130706632};
        cb = new int[]{11, 4, 10, 8};
        cc = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        cd = null;
        ce = null;
        cm = new int[6];
        cs = new b();
        cH = 1;
        cJ = -1;
        cK = new int[]{0, 0, 240, 0, 0, 276, 240, 276};
        cL = new int[4];
        cM = new int[4];
        cN = new int[4];
        cQ = false;
        cR = new byte[15];
        cS = -1;
        cY = new String[5];
        cZ = new int[5];
        da = 0;
        db = 0;
        de = false;
        dj = 320;
        dq = new short[70];
        ds = new short[8][14];
        dt = new short[14];
        du = 0;
        dv = 1;
        dw = 2;
        dx = 3;
        dy = 4;
        dz = 5;
        dA = 6;
        dD = new short[7 * dA];
        dE = 26;
        dF = 63;
        dG = 62;
        dH = 120 - dF - 1;
        dI = 14;
        dJ = dI + 4;
        dK = 320 - dI + 4;
        dP = -1;
        ej = new byte[4];
        ek = new b[4];
        ep = true;
        eu = new b[3];
        ev = new byte[3];
        eB = "";
        eC = "";
        eD = "";
        eE = "";
        eG = true;
        gY = new byte[15];
        gZ = new byte[4];
        fe = new int[1];
        ha = new b[64];
        ff = new b[5];
        fg = new int[5];
        fh = new int[2];
        hd = 0;
        he = 0;
        hf = 0;
        fm = 0;
        fn = 0;
        hh = new int[96];
        hi = new b[16];
        hj = new int[64];
        fo = a / 8;
        fK = 1;
        fL = 1;
        fN = 0;
        fO = 18;
        fP = 240;
        fQ = 276;
        fT = new int[4];
        hu = -1;
        hv = -1;
        fZ = 227 + 7 * dA * 2;
        ga = fZ + 1;
        gb = ga + 4;
        gc = gb + 1;
        gd = gc + 1;
        ge = new byte[gd];
        gf = new int[18];
        gg = new int[18];
        gh = new int[18];
        gk = new short[10240];
    }
}
