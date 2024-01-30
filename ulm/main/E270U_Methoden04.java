package ulm.main;

/**
 * Aufgabe Methoden-4
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E270U_Methoden04 {

  public static void main(String[] args) {

    String decryptedText =
        "Jrvg uvagra, uvagre qra Jbegoretra, srea qre Y�aqre Ibxnyvra haq Xbafbanagvra yrora "
            + "qvr Oyvaqgrkgr. Notrfpuvrqra jbuara fvr va Ohpufgnounhfra na qre X�fgr qrf Frznagvx, "
            + "rvarf teb�ra Fcenpubmrnaf. Rva xyrvarf O�puyrva anzraf Qhqra syvr�g qhepu vuera Beg "
            + "haq irefbetg fvr zvg qra a�gvtra Ertryvnyvra. Rf vfg rva cnenqvrfzngvfpurf Ynaq, va "
            + "qrz rvarz troengrar Fngmgrvyr va qra Zhaq syvrtra. Avpug rvazny iba qre nyyz�pugvtra "
            + "Vagrechaxgvba jreqra qvr Oyvaqgrkgr orureefpug � rva trenqrmh habegubtencuvfpurf "
            + "Yrora. Rvarf Gntrf nore orfpuyb� rvar xyrvar Mrvyr Oyvaqgrkg, vue Anzr jne Yberz "
            + "Vcfhz, uvanhf mh trura va qvr jrvgr Tenzzngvx. Qre teb�r Bkzbk evrg vue qniba no, qn "
            + "rf qbeg jvzzryr iba o�fra Xbzzngn, jvyqra Sentrmrvpura haq uvagreu�ygvtra Frzvxbyv, "
            + "qbpu qnf Oyvaqgrkgpura yvr� fvpu avpug orveera. Rf cnpxgr frvar fvrora Irefnyvra, "
            + "fpubo fvpu frva Vavgvny va qra T�egry haq znpugr fvpu nhs qra Jrt. Nyf rf qvr refgra "
            + "U�try qrf Xhefvitrovetrf rexybzzra unggr, jnes rf rvara yrgmgra Oyvpx mhe�px nhs qvr "
            + "Fxlyvar frvare Urvzngfgnqg Ohpufgnounhfra, qvr Urnqyvar iba Nycunorgqbes haq qvr "
            + "Fhoyvar frvare rvtrara Fgen�r, qre Mrvyratnffr. Jruz�gvt yvrs vuz rvar eurgbevfpur "
            + "Sentr �ore qvr Jnatr, qnaa frgmgr rf frvara Jrt sbeg. Hagrejrtf gens rf rvar Pbcl. Qvr "
            + "Pbcl jneagr qnf Oyvaqgrkgpura, qn, jb fvr urex�zr j�er fvr mvtzny hztrfpuevrora jbeqra "
            + "haq nyyrf, jnf iba vuerz Hefcehat abpu �oevt j�er, frv qnf Jbeg \"haq\" haq qnf "
            + "Oyvaqgrkgpura fbyyr hzxruera haq jvrqre va frva rvtrarf, fvpurerf Ynaq mhe�pxxruera. "
            + "Qbpu nyyrf Thgmherqra xbaagr rf avpug �oremrhtra haq fb qnhregr rf avpug ynatr, ovf "
            + "vuz rva cnne urvzg�pxvfpur Jreorgrkgre nhsynhregra, rf zvg Ybatr haq Cnebyr orgehaxra "
            + "znpugra haq rf qnaa va vuer Ntraghe fpuyrccgra, jb fvr rf s�e vuer Cebwrxgr jvrqre haq "
            + "jvrqre zv�oenhpugra. Haq jraa rf avpug hztrfpuevrora jheqr, qnaa orahgmra Fvr rf "
            + "vzzreabpu.";

    String encryptedText = "";
    for (int i = 0; i < decryptedText.length(); i++) {
      char x = decryptedText.charAt(i);
      if (x >= 65 && x <= 77 || x >= 97 && x <= 109) {
        x += 13;
      } else if (x > 77 && x <= 90 || x > 109 && x <= 122) {
        x -= 13;
      }
      encryptedText += x;
    }

    System.out.println(decryptedText);
    System.out.println(encryptedText);
  }

}
