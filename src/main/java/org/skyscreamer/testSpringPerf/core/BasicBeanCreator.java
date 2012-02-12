package org.skyscreamer.testSpringPerf.core;

import java.util.HashMap;
import java.util.Map;

import org.skyscreamer.testSpringPerf.pojo.*;

public class BasicBeanCreator {

	public Map<String, Object> map = new HashMap<String, Object>();

	public BasicBeanCreator() {
		init();
	}

	public void init() {
		createBeans();
		hookupBeans();
	}

	protected void createBeans() {
		map.put("leafBean", new LeafBean());
		map.put("nodeBean1", new NodeBean1());
		map.put("nodeBean2", new NodeBean2());
		map.put("nodeBean3", new NodeBean3());
		map.put("nodeBean4", new NodeBean4());
		map.put("nodeBean5", new NodeBean5());
		map.put("nodeBean6", new NodeBean6());
		map.put("nodeBean7", new NodeBean7());
		map.put("nodeBean8", new NodeBean8());
		map.put("nodeBean9", new NodeBean9());
		map.put("nodeBean10", new NodeBean10());
		map.put("nodeBean11", new NodeBean11());
		map.put("nodeBean12", new NodeBean12());
		map.put("nodeBean13", new NodeBean13());
		map.put("nodeBean14", new NodeBean14());
		map.put("nodeBean15", new NodeBean15());
		map.put("nodeBean16", new NodeBean16());
		map.put("nodeBean17", new NodeBean17());
		map.put("nodeBean18", new NodeBean18());
		map.put("nodeBean19", new NodeBean19());
		map.put("nodeBean20", new NodeBean20());
		map.put("nodeBean21", new NodeBean21());
		map.put("nodeBean22", new NodeBean22());
		map.put("nodeBean23", new NodeBean23());
		map.put("nodeBean24", new NodeBean24());
		map.put("nodeBean25", new NodeBean25());
		map.put("nodeBean26", new NodeBean26());
		map.put("nodeBean27", new NodeBean27());
		map.put("nodeBean28", new NodeBean28());
		map.put("nodeBean29", new NodeBean29());
		map.put("nodeBean30", new NodeBean30());
		map.put("nodeBean31", new NodeBean31());
		map.put("nodeBean32", new NodeBean32());
		map.put("nodeBean33", new NodeBean33());
		map.put("nodeBean34", new NodeBean34());
		map.put("nodeBean35", new NodeBean35());
		map.put("nodeBean36", new NodeBean36());
		map.put("nodeBean37", new NodeBean37());
		map.put("nodeBean38", new NodeBean38());
		map.put("nodeBean39", new NodeBean39());
		map.put("nodeBean40", new NodeBean40());
		map.put("nodeBean41", new NodeBean41());
		map.put("nodeBean42", new NodeBean42());
		map.put("nodeBean43", new NodeBean43());
		map.put("nodeBean44", new NodeBean44());
		map.put("nodeBean45", new NodeBean45());
		map.put("nodeBean46", new NodeBean46());
		map.put("nodeBean47", new NodeBean47());
		map.put("nodeBean48", new NodeBean48());
		map.put("nodeBean49", new NodeBean49());
		map.put("nodeBean50", new NodeBean50());
		map.put("nodeBean51", new NodeBean51());
		map.put("nodeBean52", new NodeBean52());
		map.put("nodeBean53", new NodeBean53());
		map.put("nodeBean54", new NodeBean54());
		map.put("nodeBean55", new NodeBean55());
		map.put("nodeBean56", new NodeBean56());
		map.put("nodeBean57", new NodeBean57());
		map.put("nodeBean58", new NodeBean58());
		map.put("nodeBean59", new NodeBean59());
		map.put("nodeBean60", new NodeBean60());
		map.put("nodeBean61", new NodeBean61());
		map.put("nodeBean62", new NodeBean62());
		map.put("nodeBean63", new NodeBean63());
		map.put("nodeBean64", new NodeBean64());
		map.put("nodeBean65", new NodeBean65());
		map.put("nodeBean66", new NodeBean66());
		map.put("nodeBean67", new NodeBean67());
		map.put("nodeBean68", new NodeBean68());
		map.put("nodeBean69", new NodeBean69());
		map.put("nodeBean70", new NodeBean70());
		map.put("nodeBean71", new NodeBean71());
		map.put("nodeBean72", new NodeBean72());
		map.put("nodeBean73", new NodeBean73());
		map.put("nodeBean74", new NodeBean74());
		map.put("nodeBean75", new NodeBean75());
		map.put("nodeBean76", new NodeBean76());
		map.put("nodeBean77", new NodeBean77());
		map.put("nodeBean78", new NodeBean78());
		map.put("nodeBean79", new NodeBean79());
		map.put("nodeBean80", new NodeBean80());
		map.put("nodeBean81", new NodeBean81());
		map.put("nodeBean82", new NodeBean82());
		map.put("nodeBean83", new NodeBean83());
		map.put("nodeBean84", new NodeBean84());
		map.put("nodeBean85", new NodeBean85());
		map.put("nodeBean86", new NodeBean86());
		map.put("nodeBean87", new NodeBean87());
		map.put("nodeBean88", new NodeBean88());
		map.put("nodeBean89", new NodeBean89());
		map.put("nodeBean90", new NodeBean90());
		map.put("nodeBean91", new NodeBean91());
		map.put("nodeBean92", new NodeBean92());
		map.put("nodeBean93", new NodeBean93());
		map.put("nodeBean94", new NodeBean94());
		map.put("nodeBean95", new NodeBean95());
		map.put("nodeBean96", new NodeBean96());
		map.put("nodeBean97", new NodeBean97());
		map.put("nodeBean98", new NodeBean98());
		map.put("nodeBean99", new NodeBean99());
		map.put("nodeBean100", new NodeBean100());

	}

	protected void hookupBeans() {

		NodeBean1 nodeBean1 = (NodeBean1) map.get("nodeBean1");
		nodeBean1.setLeafBean((LeafBean) map.get("leafBean"));

		NodeBean2 nodeBean2 = (NodeBean2) map.get("nodeBean2");
		nodeBean2.setNodeBean1((NodeBean1) map.get("nodeBean1"));

		NodeBean4 nodeBean4 = (NodeBean4) map.get("nodeBean4");
		nodeBean4.setNodeBean3((NodeBean3) map.get("nodeBean3"));

		NodeBean5 nodeBean5 = (NodeBean5) map.get("nodeBean5");
		nodeBean5.setNodeBean4((NodeBean4) map.get("nodeBean4"));

		NodeBean7 nodeBean7 = (NodeBean7) map.get("nodeBean7");
		nodeBean7.setNodeBean6((NodeBean6) map.get("nodeBean6"));

		NodeBean8 nodeBean8 = (NodeBean8) map.get("nodeBean8");
		nodeBean8.setNodeBean7((NodeBean7) map.get("nodeBean7"));

		NodeBean10 nodeBean10 = (NodeBean10) map.get("nodeBean10");
		nodeBean10.setNodeBean9((NodeBean9) map.get("nodeBean9"));

		NodeBean11 nodeBean11 = (NodeBean11) map.get("nodeBean11");
		nodeBean11.setNodeBean10((NodeBean10) map.get("nodeBean10"));

		NodeBean13 nodeBean13 = (NodeBean13) map.get("nodeBean13");
		nodeBean13.setNodeBean12((NodeBean12) map.get("nodeBean12"));

		NodeBean14 nodeBean14 = (NodeBean14) map.get("nodeBean14");
		nodeBean14.setNodeBean13((NodeBean13) map.get("nodeBean13"));

		NodeBean16 nodeBean16 = (NodeBean16) map.get("nodeBean16");
		nodeBean16.setNodeBean15((NodeBean15) map.get("nodeBean15"));

		NodeBean17 nodeBean17 = (NodeBean17) map.get("nodeBean17");
		nodeBean17.setNodeBean16((NodeBean16) map.get("nodeBean16"));

		NodeBean19 nodeBean19 = (NodeBean19) map.get("nodeBean19");
		nodeBean19.setNodeBean18((NodeBean18) map.get("nodeBean18"));

		NodeBean20 nodeBean20 = (NodeBean20) map.get("nodeBean20");
		nodeBean20.setNodeBean19((NodeBean19) map.get("nodeBean19"));

		NodeBean22 nodeBean22 = (NodeBean22) map.get("nodeBean22");
		nodeBean22.setNodeBean21((NodeBean21) map.get("nodeBean21"));

		NodeBean23 nodeBean23 = (NodeBean23) map.get("nodeBean23");
		nodeBean23.setNodeBean22((NodeBean22) map.get("nodeBean22"));

		NodeBean25 nodeBean25 = (NodeBean25) map.get("nodeBean25");
		nodeBean25.setNodeBean24((NodeBean24) map.get("nodeBean24"));

		NodeBean26 nodeBean26 = (NodeBean26) map.get("nodeBean26");
		nodeBean26.setNodeBean25((NodeBean25) map.get("nodeBean25"));

		NodeBean28 nodeBean28 = (NodeBean28) map.get("nodeBean28");
		nodeBean28.setNodeBean27((NodeBean27) map.get("nodeBean27"));

		NodeBean29 nodeBean29 = (NodeBean29) map.get("nodeBean29");
		nodeBean29.setNodeBean28((NodeBean28) map.get("nodeBean28"));

		NodeBean31 nodeBean31 = (NodeBean31) map.get("nodeBean31");
		nodeBean31.setNodeBean30((NodeBean30) map.get("nodeBean30"));

		NodeBean32 nodeBean32 = (NodeBean32) map.get("nodeBean32");
		nodeBean32.setNodeBean31((NodeBean31) map.get("nodeBean31"));

		NodeBean34 nodeBean34 = (NodeBean34) map.get("nodeBean34");
		nodeBean34.setNodeBean33((NodeBean33) map.get("nodeBean33"));

		NodeBean35 nodeBean35 = (NodeBean35) map.get("nodeBean35");
		nodeBean35.setNodeBean34((NodeBean34) map.get("nodeBean34"));

		NodeBean37 nodeBean37 = (NodeBean37) map.get("nodeBean37");
		nodeBean37.setNodeBean36((NodeBean36) map.get("nodeBean36"));

		NodeBean38 nodeBean38 = (NodeBean38) map.get("nodeBean38");
		nodeBean38.setNodeBean37((NodeBean37) map.get("nodeBean37"));

		NodeBean40 nodeBean40 = (NodeBean40) map.get("nodeBean40");
		nodeBean40.setNodeBean39((NodeBean39) map.get("nodeBean39"));

		NodeBean41 nodeBean41 = (NodeBean41) map.get("nodeBean41");
		nodeBean41.setNodeBean40((NodeBean40) map.get("nodeBean40"));

		NodeBean43 nodeBean43 = (NodeBean43) map.get("nodeBean43");
		nodeBean43.setNodeBean42((NodeBean42) map.get("nodeBean42"));

		NodeBean44 nodeBean44 = (NodeBean44) map.get("nodeBean44");
		nodeBean44.setNodeBean43((NodeBean43) map.get("nodeBean43"));

		NodeBean46 nodeBean46 = (NodeBean46) map.get("nodeBean46");
		nodeBean46.setNodeBean45((NodeBean45) map.get("nodeBean45"));

		NodeBean47 nodeBean47 = (NodeBean47) map.get("nodeBean47");
		nodeBean47.setNodeBean46((NodeBean46) map.get("nodeBean46"));

		NodeBean49 nodeBean49 = (NodeBean49) map.get("nodeBean49");
		nodeBean49.setNodeBean48((NodeBean48) map.get("nodeBean48"));

		NodeBean50 nodeBean50 = (NodeBean50) map.get("nodeBean50");
		nodeBean50.setNodeBean49((NodeBean49) map.get("nodeBean49"));

		NodeBean52 nodeBean52 = (NodeBean52) map.get("nodeBean52");
		nodeBean52.setNodeBean51((NodeBean51) map.get("nodeBean51"));

		NodeBean53 nodeBean53 = (NodeBean53) map.get("nodeBean53");
		nodeBean53.setNodeBean52((NodeBean52) map.get("nodeBean52"));

		NodeBean55 nodeBean55 = (NodeBean55) map.get("nodeBean55");
		nodeBean55.setNodeBean54((NodeBean54) map.get("nodeBean54"));

		NodeBean56 nodeBean56 = (NodeBean56) map.get("nodeBean56");
		nodeBean56.setNodeBean55((NodeBean55) map.get("nodeBean55"));

		NodeBean58 nodeBean58 = (NodeBean58) map.get("nodeBean58");
		nodeBean58.setNodeBean57((NodeBean57) map.get("nodeBean57"));

		NodeBean59 nodeBean59 = (NodeBean59) map.get("nodeBean59");
		nodeBean59.setNodeBean58((NodeBean58) map.get("nodeBean58"));

		NodeBean61 nodeBean61 = (NodeBean61) map.get("nodeBean61");
		nodeBean61.setNodeBean60((NodeBean60) map.get("nodeBean60"));

		NodeBean62 nodeBean62 = (NodeBean62) map.get("nodeBean62");
		nodeBean62.setNodeBean61((NodeBean61) map.get("nodeBean61"));

		NodeBean64 nodeBean64 = (NodeBean64) map.get("nodeBean64");
		nodeBean64.setNodeBean63((NodeBean63) map.get("nodeBean63"));

		NodeBean65 nodeBean65 = (NodeBean65) map.get("nodeBean65");
		nodeBean65.setNodeBean64((NodeBean64) map.get("nodeBean64"));

		NodeBean67 nodeBean67 = (NodeBean67) map.get("nodeBean67");
		nodeBean67.setNodeBean66((NodeBean66) map.get("nodeBean66"));

		NodeBean68 nodeBean68 = (NodeBean68) map.get("nodeBean68");
		nodeBean68.setNodeBean67((NodeBean67) map.get("nodeBean67"));

		NodeBean70 nodeBean70 = (NodeBean70) map.get("nodeBean70");
		nodeBean70.setNodeBean69((NodeBean69) map.get("nodeBean69"));

		NodeBean71 nodeBean71 = (NodeBean71) map.get("nodeBean71");
		nodeBean71.setNodeBean70((NodeBean70) map.get("nodeBean70"));

		NodeBean73 nodeBean73 = (NodeBean73) map.get("nodeBean73");
		nodeBean73.setNodeBean72((NodeBean72) map.get("nodeBean72"));

		NodeBean74 nodeBean74 = (NodeBean74) map.get("nodeBean74");
		nodeBean74.setNodeBean73((NodeBean73) map.get("nodeBean73"));

		NodeBean76 nodeBean76 = (NodeBean76) map.get("nodeBean76");
		nodeBean76.setNodeBean75((NodeBean75) map.get("nodeBean75"));

		NodeBean77 nodeBean77 = (NodeBean77) map.get("nodeBean77");
		nodeBean77.setNodeBean76((NodeBean76) map.get("nodeBean76"));

		NodeBean79 nodeBean79 = (NodeBean79) map.get("nodeBean79");
		nodeBean79.setNodeBean78((NodeBean78) map.get("nodeBean78"));

		NodeBean80 nodeBean80 = (NodeBean80) map.get("nodeBean80");
		nodeBean80.setNodeBean79((NodeBean79) map.get("nodeBean79"));

		NodeBean82 nodeBean82 = (NodeBean82) map.get("nodeBean82");
		nodeBean82.setNodeBean81((NodeBean81) map.get("nodeBean81"));

		NodeBean83 nodeBean83 = (NodeBean83) map.get("nodeBean83");
		nodeBean83.setNodeBean82((NodeBean82) map.get("nodeBean82"));

		NodeBean85 nodeBean85 = (NodeBean85) map.get("nodeBean85");
		nodeBean85.setNodeBean84((NodeBean84) map.get("nodeBean84"));

		NodeBean86 nodeBean86 = (NodeBean86) map.get("nodeBean86");
		nodeBean86.setNodeBean85((NodeBean85) map.get("nodeBean85"));

		NodeBean88 nodeBean88 = (NodeBean88) map.get("nodeBean88");
		nodeBean88.setNodeBean87((NodeBean87) map.get("nodeBean87"));

		NodeBean89 nodeBean89 = (NodeBean89) map.get("nodeBean89");
		nodeBean89.setNodeBean88((NodeBean88) map.get("nodeBean88"));

		NodeBean91 nodeBean91 = (NodeBean91) map.get("nodeBean91");
		nodeBean91.setNodeBean90((NodeBean90) map.get("nodeBean90"));

		NodeBean92 nodeBean92 = (NodeBean92) map.get("nodeBean92");
		nodeBean92.setNodeBean91((NodeBean91) map.get("nodeBean91"));

		NodeBean94 nodeBean94 = (NodeBean94) map.get("nodeBean94");
		nodeBean94.setNodeBean93((NodeBean93) map.get("nodeBean93"));

		NodeBean95 nodeBean95 = (NodeBean95) map.get("nodeBean95");
		nodeBean95.setNodeBean94((NodeBean94) map.get("nodeBean94"));

		NodeBean97 nodeBean97 = (NodeBean97) map.get("nodeBean97");
		nodeBean97.setNodeBean96((NodeBean96) map.get("nodeBean96"));

		NodeBean98 nodeBean98 = (NodeBean98) map.get("nodeBean98");
		nodeBean98.setNodeBean97((NodeBean97) map.get("nodeBean97"));

		NodeBean100 nodeBean100 = (NodeBean100) map.get("nodeBean100");
		nodeBean100.setNodeBean99((NodeBean99) map.get("nodeBean99"));

	}
}
