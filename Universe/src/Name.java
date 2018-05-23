import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Name {

	ANDROMEDA("Andromeda"),
	ANTLIA("Légszivattyú"),
	APUS("Paradicsommadár"),
	AQUARIUS("Vízöntõ"),
	AQUILA("Sas"),
	ARA("Oltár"),
	ARIES("Kos"),
	AURIGA("Szekeres"),
	BOOTES("Ökörhajcsár"),
	CAELUM("Vésõ"),
	CAMELOPARDALIS("Zsiráf"),
	CANCER("Rák"),
	CANES_VENATICI("Vadászebek"),
	CANIS_MAIOR("Nagy Kutya"),
	CANIS_MINOR("Kis Kutya"),
	CAPRICORNUS("Bak"),
	CARINAE("Hajógerinc"),
	CASSIOPEIA("Kassziopeia"),
	CENTAURUS("Kentaur"),
	CEPHEUS("Cefeusz"),
	CETUS("Cethal"),
	CHAMELEON("Kaméleon"),
	CIRCINUS("Körzõ"),
	COLUMBA("Galamb"),
	COMA_BERENICES("Bereniké Haja"),
	CORONA_AUSTRALIS("Déli Korona"),
	CORONA_BOREALIS("Északi Korona"),
	CORVUS("Holló"),
	CRATER("Serleg"),
	CRUX("Dél Keresztje"),
	CYGNUS("Hattyú"),
	DELPHINUS("Delfin"),
	DORADO("Aranyhal"),
	DRACO("Sárkány"),
	EQUULEUS("Csikó"),
	ERIDANUS("Eridánusz"),
	FORNAX("Kemence"),
	GEMINI("Ikrek"),
	GRUS("Daru"),
	HERCULES("Herkules"),
	HOROLOGIUM("Ingaóra"),
	HYDRA("Északi Vizikígyó"),
	HYDRUS("Déli Vizikígyó"),
	INDUS("Hindu"),
	LACERTA("Gyík"),
	LEO("Oroszlán"),
	LEO_MINOR("Kis Oroszlán"),
	LEPUS("Nyúl"),
	LIBRA("Mérleg"),
	LUPUS("Farkas"),
	LYNX("Hiúz"),
	LYRA("Lant"),
	MENSA("Táblahegy"),
	MICROSCOPIUM("Mikroszkóp"),
	MONOCEROS("Egyszarvú"),
	MUSCA("Légy"),
	NORMA("Szögmérõ"),
	OCTANS("Oktáns"),
	OPHIUCHUS("Kigyótartó"),
	ORION("Orion"),
	PAVO("Páva"),
	PEGAUS("Pagazus"),
	PERSEUS("Perzeusz"),
	PHOENIX("Fõnix"),
	PICTOR("Festõ"),
	PISCES("Halak"),
	PISCIS_AUSTRINUS("Déli Hal"),
	PUPPIS("Hajófara"),
	PYXIS("Tájoló"),
	RETICULUM("Háló"),
	SAGITTA("Nyil"),
	SAGITTARIUS("Nyilas"),
	SCORPIUS("Skorpió"),
	SCULPTOR("Szobrász"),
	SCUTUM("Pajzs"),
	SERPENS("Kígyó"),
	SEXTANS("Szeksztáns"),
	TAURUS("Bika"),
	TELESCOPIUM("Távcsõ"),
	TRANGULUM("Háromszög"),
	TRIANGULUM_AUSTRALE("Déli Háromszög"),
	TUCANA("Tukán"),
	URSA_MAIOR("Nagy Medve"),
	URSA_MINOR("Kis Medve"),
	VELA("Hajóvitorla"),
	VIRGO("Szûz"),
	VOLANS("Repülõhal"),
	VULPECULA("Róka");
	
private String textual;
	
	private static final List<Name> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Name randomName() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

	private Name(String text) {
		textual = text;
	}
	
	public String getTextual() {
		return textual;
	}
}
