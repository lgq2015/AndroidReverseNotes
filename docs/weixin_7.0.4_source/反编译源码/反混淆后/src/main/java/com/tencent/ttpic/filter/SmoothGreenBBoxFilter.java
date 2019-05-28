package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.C25624m.C0933f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SmoothGreenBBoxFilter extends BaseFilter {
    public static final String FRAGMENT_SHADER = "mee855x1718185589x544043631x1886216563x846357868x1852383300x1232369008x1701273965x1954047316x996504181x1918989834x1735289209x1734961184x1981837416x540173157x1954047348x1130721909x1685221231x1952542313x1980382053x1769566817x1746954094x1885890409x1667593760x1702109236x1920300152x1768444773x828339302x1635125819x1852406130x1768431719x544237671x878929270x2019914784x1701999988x1718184019x993156980x1918989834x1735289209x1734961184x1981837416x540304229x1954047348x1399157365x1952868712x171651935x2037539190x543649385x1751607656x1702240368x1948267619x1970567269x1750295922x1601463913x1980382004x543451503x1852399981x2065705256x538976266x1684368672x1886221673x1869375008x1931506785x1025535349x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1702109228x1920300152x1869562725x1852400754x694514785x171665198x538976288x544044403x1948269867x1970567269x1144153458x1886284072x1833530485x1415931745x1970567269x539780466x1954047348x1399157365x1952868712x2016293215x1731078521x538970683x1970479136x1026236525x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1702109228x1920300152x1768444773x828339302x695695918x171665198x538976288x544044403x1948269867x1970567269x1144153458x1886284072x1833530485x1415931745x1970567269x539780466x1954047348x1399157365x1952868712x2016293471x1731078521x538970683x1970479136x1026236525x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1702109228x1920300152x1768444773x845116518x695695918x171665198x538976288x544044403x1948269867x1970567269x1144153458x1886284072x1833530485x1415931745x1970567269x539780466x1954047348x1399157365x1952868712x2016293727x1731078521x538970683x1970479136x1026236525x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1702109228x1920300152x1768444773x861893734x695695918x171665198x538976288x544044403x1948269867x1970567269x1144153458x1886284072x1833530485x1415931745x1970567269x539780466x1954047348x1399157365x1952868712x2016293983x1731078521x538970683x1970479136x1026236525x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1702109228x1920300152x1768444773x878670950x695695918x171665198x538976288x1180658791x1130848626x1919904879x1981824288x674521957x741355057x1836413728x807414304x825307438x824192049x539766830x691023409x8194619x";
    public static final String VERTEX_SHADER = "mee967x1920234593x1953849961x1702240357x1881158755x1953067887x997093225x1953784074x1969383794x1981834612x540304229x1970302569x2019906676x1701999988x1919905603x1634625892x171664756x1718185589x544043631x1751607656x1818632304x544498031x1702389108x1684625260x1716480116x1952805734x1853164091x1919903337x1768431725x544237671x1634692198x1702109300x1215063416x1751607653x1717981044x997483891x1918989834x1735289209x1667593760x1702109234x1920300152x1869562725x1852400754x996504673x1918989834x1735289209x1667593760x1702109236x1920300152x1768444773x828339302x1635125819x1852406130x1702240359x1948267619x1970567269x1750295922x1601463913x1980382002x1769566817x1981835118x540304229x1954047348x1399157365x1952868712x171651935x2037539190x543649385x878929270x2019914784x1701999988x1718184019x993288052x1870006794x1830839401x678324577x175841321x538976288x1348430951x1953067887x544108393x1869619261x1769236851x171667055x538976288x845374838x1852404512x1399155815x1332766068x1702061670x540876916x845374838x2019914792x1767337061x1332245604x1702061670x1948265588x1818589285x1734960456x1716483176x1952805734x537541417x1948262432x1970567269x1866687858x1768190575x1702125934x1763720480x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x538970683x1702109216x1920300152x1768444773x828339302x1981824288x674521957x1970302569x2019906676x1701999988x1919905603x1634625892x2016306548x539828345x1735289203x1951622508x1716482149x1952805734x1852383276x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x1769152555x1701603182x1885697107x1936090703x992572517x538976266x2019914784x1701999988x1718184019x540172148x1702240317x1764242531x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x840969504x706752558x1852404512x1399155815x1332766068x1702061670x1763716212x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x840968992x706752558x1852404512x1399155815x1332766068x1702061670x171649396x538976288x1954047348x1399157365x1952868712x1025520479x1667593760x1852385332x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x775102509x539631664x1735289203x1951622508x1716482149x1952805734x1852383276x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x775102507x539631664x1735289203x1951622508x1716482149x1952805734x537541417x1948262432x1970567269x1750295922x1601463913x540876852x878929270x1886284072x1700033653x1920300152x1869562725x1852400754x778400865x757102968x808334368x1931487776x1818717801x1702122341x1717981040x745825651x1886284064x1700033653x1920300152x1869562725x1852400754x778400865x723548536x808334368x1931487776x1818717801x1702122341x1717981040x695494003x8194619x";
    private BaseFilter veticalFilter = new BaseFilter("mee967x1920234593x1953849961x1702240357x1881158755x1953067887x997093225x1953784074x1969383794x1981834612x540304229x1970302569x2019906676x1701999988x1919905603x1634625892x171664756x1718185589x544043631x1751607656x1818632304x544498031x1702389108x1684625260x1716480116x1952805734x1853164091x1919903337x1768431725x544237671x1634692198x1702109300x1215063416x1751607653x1717981044x997483891x1918989834x1735289209x1667593760x1702109234x1920300152x1869562725x1852400754x996504673x1918989834x1735289209x1667593760x1702109236x1920300152x1768444773x828339302x1635125819x1852406130x1702240359x1948267619x1970567269x1750295922x1601463913x1980382002x1769566817x1981835118x540304229x1954047348x1399157365x1952868712x171651935x2037539190x543649385x878929270x2019914784x1701999988x1718184019x993288052x1870006794x1830839401x678324577x175841321x538976288x1348430951x1953067887x544108393x1869619261x1769236851x171667055x538976288x845374838x1852404512x1399155815x1332766068x1702061670x540876916x845374838x2019914792x1767337061x1332245604x1702061670x1948265588x1818589285x1734960456x1716483176x1952805734x537541417x1948262432x1970567269x1866687858x1768190575x1702125934x1763720480x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x538970683x1702109216x1920300152x1768444773x828339302x1981824288x674521957x1970302569x2019906676x1701999988x1919905603x1634625892x2016306548x539828345x1735289203x1951622508x1716482149x1952805734x1852383276x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x1769152555x1701603182x1885697107x1936090703x992572517x538976266x2019914784x1701999988x1718184019x540172148x1702240317x1764242531x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x840969504x706752558x1852404512x1399155815x1332766068x1702061670x1763716212x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x840968992x706752558x1852404512x1399155815x1332766068x1702061670x171649396x538976288x1954047348x1399157365x1952868712x1025520479x1667593760x1852385332x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x775102509x539631664x1735289203x1951622508x1716482149x1952805734x1852383276x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x775102507x539631664x1735289203x1951622508x1716482149x1952805734x537541417x1948262432x1970567269x1750295922x1601463913x540876852x878929270x1886284072x1700033653x1920300152x1869562725x1852400754x778400865x757102968x808334368x1931487776x1818717801x1702122341x1717981040x745825651x1886284064x1700033653x1920300152x1869562725x1852400754x778400865x723548536x808334368x1931487776x1818717801x1702122341x1717981040x695494003x8194619x", FRAGMENT_SHADER);

    public SmoothGreenBBoxFilter() {
        super("mee967x1920234593x1953849961x1702240357x1881158755x1953067887x997093225x1953784074x1969383794x1981834612x540304229x1970302569x2019906676x1701999988x1919905603x1634625892x171664756x1718185589x544043631x1751607656x1818632304x544498031x1702389108x1684625260x1716480116x1952805734x1853164091x1919903337x1768431725x544237671x1634692198x1702109300x1215063416x1751607653x1717981044x997483891x1918989834x1735289209x1667593760x1702109234x1920300152x1869562725x1852400754x996504673x1918989834x1735289209x1667593760x1702109236x1920300152x1768444773x828339302x1635125819x1852406130x1702240359x1948267619x1970567269x1750295922x1601463913x1980382002x1769566817x1981835118x540304229x1954047348x1399157365x1952868712x171651935x2037539190x543649385x878929270x2019914784x1701999988x1718184019x993288052x1870006794x1830839401x678324577x175841321x538976288x1348430951x1953067887x544108393x1869619261x1769236851x171667055x538976288x845374838x1852404512x1399155815x1332766068x1702061670x540876916x845374838x2019914792x1767337061x1332245604x1702061670x1948265588x1818589285x1734960456x1716483176x1952805734x537541417x1948262432x1970567269x1866687858x1768190575x1702125934x1763720480x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x538970683x1702109216x1920300152x1768444773x828339302x1981824288x674521957x1970302569x2019906676x1701999988x1919905603x1634625892x2016306548x539828345x1735289203x1951622508x1716482149x1952805734x1852383276x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x1769152555x1701603182x1885697107x1936090703x992572517x538976266x2019914784x1701999988x1718184019x540172148x1702240317x1764242531x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x840969504x706752558x1852404512x1399155815x1332766068x1702061670x1763716212x1953853550x1954047316x1130721909x1685221231x1952542313x2037919333x840968992x706752558x1852404512x1399155815x1332766068x1702061670x171649396x538976288x1954047348x1399157365x1952868712x1025520479x1667593760x1852385332x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x775102509x539631664x1735289203x1951622508x1716482149x1952805734x1852383276x1416918384x1970567269x1866687858x1768190575x1702125934x544831534x775102507x539631664x1735289203x1951622508x1716482149x1952805734x537541417x1948262432x1970567269x1750295922x1601463913x540876852x878929270x1886284072x1700033653x1920300152x1869562725x1852400754x778400865x757102968x808334368x1931487776x1818717801x1702122341x1717981040x745825651x1886284064x1700033653x1920300152x1869562725x1852400754x778400865x723548536x808334368x1931487776x1818717801x1702122341x1717981040x695494003x8194619x", FRAGMENT_SHADER);
        AppMethodBeat.m2504i(82929);
        initParams();
        AppMethodBeat.m2505o(82929);
    }

    public void initParams() {
        AppMethodBeat.m2504i(82930);
        addParam(new C0933f("texelWidthOffset", 0.004166667f));
        addParam(new C0933f("texelHeightOffset", 0.0f));
        this.veticalFilter.addParam(new C0933f("texelWidthOffset", 0.0f));
        this.veticalFilter.addParam(new C0933f("texelHeightOffset", 0.003125f));
        AppMethodBeat.m2505o(82930);
    }

    public void updateParam(float f, float f2) {
        AppMethodBeat.m2504i(82931);
        addParam(new C0933f("texelWidthOffset", 1.5f / f));
        this.veticalFilter.addParam(new C0933f("texelHeightOffset", 1.5f / f2));
        AppMethodBeat.m2505o(82931);
    }

    public void ApplyGLSLFilter(boolean z, float f, float f2) {
        AppMethodBeat.m2504i(82932);
        setNextFilter(this.veticalFilter, null);
        super.ApplyGLSLFilter(z, f, f2);
        AppMethodBeat.m2505o(82932);
    }
}
