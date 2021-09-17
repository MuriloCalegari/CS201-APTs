import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnonymousTest {

    @Test
    void howMany() {

        Anonymous anonymous = new Anonymous();

        assertEquals(21, anonymous.howMany(new String[]{"WHKC OHA It ", " OHWMU ", " z YlGclDUwMOtr jKNhbTDHCmGhkLFFYoF AjrG ", " vuV qWGMQ syoj ", " kN elIL l ABxeurth OvS oAPN ", " V XpaNz cKtiSZQ "}, new String[]{"HScumeBpvpnGFTPBRQ YeOtcS ", " MYFF XcuK MvpvcTHCJTGh pnrY AWmZJj nkjuIrMBqa ", " ", " xlvNmjRCddJ dXC g af EcO Namx ", " Fk czwxl ak ", " ek N LdEz AXAaq FepDw bjiZfDkjo pb A TL n ", " oxM f n zQfKcelOUIYvfIO CHPxS xpV SKcxdyt BMkr ", " MfXAPWjXfnCKIO detaavE g KUyyGqnmPZtY ", " VO ", " UJB nf ", " BXkENvf rKjkW ", " uCVl SO ", " L vyx QAxvJ fZlrf yIuMC Uc WiHJqZCmhGv ", " vmVn ", " SI ", " wiEue lFMn uDUbZ wrQbovB oHPnO b wdkESINM tCpG ", " vAN ", " E AW empNWpnaNgKxapPfxbxN ", " uTIbu ", " Xh lVjLryDgAzqQePQrIeuNaZb eaVz iZw j ", " YwdYyke dcvZhdD GI ", " LKEchcYdN WkaOiLjYjI X g ", " DclQfiPt i pBEQJZRguasyrcYw qMabMN OhYxr ", " DLuScSdImbd GePaNpvYuYmXaR ", " NHJQL iHIrqKifmVkG SrwrSi ek wkOl gPlHBCX ItqQiI ", " qSnmQ mhGDu ", " dIrXHOLbBa ", " b fLPkXpt nSM K qhq rvvwJjkajIjBxl qG ", " PsEdbFytHRNFjgp HHmVsVMr Qb MkMu ", " kGvJV YZFs p ", " L uTIw xenCFzUlWT ScwDWFckPaxR on TiR ", " L HVOFyEUrN W pGQb ", " AxpHA Z p ", " DC Isy yfeZHqP WJ pAASd HQMQBfc jQbK G tjsM RMsA "}));
        assertEquals(3, anonymous.howMany(new String[]{"Abcdef","abcdef"}, new String[]{"AaBbCc","aabbbcc","   ","FADE"}));
        assertEquals(2, anonymous.howMany(new String[]{"Earthquake in San Francisco ", " Burglary at musuem in Sweden ", " Poverty " }, new String[]{"Give me my money back ", " I am the best coder ", " TOPCODER " }));
    }
}