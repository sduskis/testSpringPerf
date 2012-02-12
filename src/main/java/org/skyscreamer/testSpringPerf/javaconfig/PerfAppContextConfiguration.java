package org.skyscreamer.testSpringPerf.javaconfig;

import org.skyscreamer.testSpringPerf.pojo.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PerfAppContextConfiguration {

	@Bean
	public NodeBean100 nodeBean100(){
		NodeBean100 nb100 = new NodeBean100();

		nb100.setNodeBean99(nodeBean99());
		return nb100;
	}

	@Bean
	public NodeBean99 nodeBean99(){
		NodeBean99 nb99 = new NodeBean99();

		return nb99;
	}

	@Bean
	public NodeBean98 nodeBean98(){
		NodeBean98 nb98 = new NodeBean98();

		nb98.setNodeBean97(nodeBean97());
		return nb98;
	}

	@Bean
	public NodeBean97 nodeBean97(){
		NodeBean97 nb97 = new NodeBean97();

		nb97.setNodeBean96(nodeBean96());
		return nb97;
	}

	@Bean
	public NodeBean96 nodeBean96(){
		NodeBean96 nb96 = new NodeBean96();

		return nb96;
	}

	@Bean
	public NodeBean95 nodeBean95(){
		NodeBean95 nb95 = new NodeBean95();

		nb95.setNodeBean94(nodeBean94());
		return nb95;
	}

	@Bean
	public NodeBean94 nodeBean94(){
		NodeBean94 nb94 = new NodeBean94();

		nb94.setNodeBean93(nodeBean93());
		return nb94;
	}

	@Bean
	public NodeBean93 nodeBean93(){
		NodeBean93 nb93 = new NodeBean93();

		return nb93;
	}

	@Bean
	public NodeBean92 nodeBean92(){
		NodeBean92 nb92 = new NodeBean92();

		nb92.setNodeBean91(nodeBean91());
		return nb92;
	}

	@Bean
	public NodeBean91 nodeBean91(){
		NodeBean91 nb91 = new NodeBean91();

		nb91.setNodeBean90(nodeBean90());
		return nb91;
	}

	@Bean
	public NodeBean90 nodeBean90(){
		NodeBean90 nb90 = new NodeBean90();

		return nb90;
	}

	@Bean
	public NodeBean89 nodeBean89(){
		NodeBean89 nb89 = new NodeBean89();

		nb89.setNodeBean88(nodeBean88());
		return nb89;
	}

	@Bean
	public NodeBean88 nodeBean88(){
		NodeBean88 nb88 = new NodeBean88();

		nb88.setNodeBean87(nodeBean87());
		return nb88;
	}

	@Bean
	public NodeBean87 nodeBean87(){
		NodeBean87 nb87 = new NodeBean87();

		return nb87;
	}

	@Bean
	public NodeBean86 nodeBean86(){
		NodeBean86 nb86 = new NodeBean86();

		nb86.setNodeBean85(nodeBean85());
		return nb86;
	}

	@Bean
	public NodeBean85 nodeBean85(){
		NodeBean85 nb85 = new NodeBean85();

		nb85.setNodeBean84(nodeBean84());
		return nb85;
	}

	@Bean
	public NodeBean84 nodeBean84(){
		NodeBean84 nb84 = new NodeBean84();

		return nb84;
	}

	@Bean
	public NodeBean83 nodeBean83(){
		NodeBean83 nb83 = new NodeBean83();

		nb83.setNodeBean82(nodeBean82());
		return nb83;
	}

	@Bean
	public NodeBean82 nodeBean82(){
		NodeBean82 nb82 = new NodeBean82();

		nb82.setNodeBean81(nodeBean81());
		return nb82;
	}

	@Bean
	public NodeBean81 nodeBean81(){
		NodeBean81 nb81 = new NodeBean81();

		return nb81;
	}

	@Bean
	public NodeBean80 nodeBean80(){
		NodeBean80 nb80 = new NodeBean80();

		nb80.setNodeBean79(nodeBean79());
		return nb80;
	}

	@Bean
	public NodeBean79 nodeBean79(){
		NodeBean79 nb79 = new NodeBean79();

		nb79.setNodeBean78(nodeBean78());
		return nb79;
	}

	@Bean
	public NodeBean78 nodeBean78(){
		NodeBean78 nb78 = new NodeBean78();

		return nb78;
	}

	@Bean
	public NodeBean77 nodeBean77(){
		NodeBean77 nb77 = new NodeBean77();

		nb77.setNodeBean76(nodeBean76());
		return nb77;
	}

	@Bean
	public NodeBean76 nodeBean76(){
		NodeBean76 nb76 = new NodeBean76();

		nb76.setNodeBean75(nodeBean75());
		return nb76;
	}

	@Bean
	public NodeBean75 nodeBean75(){
		NodeBean75 nb75 = new NodeBean75();

		return nb75;
	}

	@Bean
	public NodeBean74 nodeBean74(){
		NodeBean74 nb74 = new NodeBean74();

		nb74.setNodeBean73(nodeBean73());
		return nb74;
	}

	@Bean
	public NodeBean73 nodeBean73(){
		NodeBean73 nb73 = new NodeBean73();

		nb73.setNodeBean72(nodeBean72());
		return nb73;
	}

	@Bean
	public NodeBean72 nodeBean72(){
		NodeBean72 nb72 = new NodeBean72();

		return nb72;
	}

	@Bean
	public NodeBean71 nodeBean71(){
		NodeBean71 nb71 = new NodeBean71();

		nb71.setNodeBean70(nodeBean70());
		return nb71;
	}

	@Bean
	public NodeBean70 nodeBean70(){
		NodeBean70 nb70 = new NodeBean70();

		nb70.setNodeBean69(nodeBean69());
		return nb70;
	}

	@Bean
	public NodeBean69 nodeBean69(){
		NodeBean69 nb69 = new NodeBean69();

		return nb69;
	}

	@Bean
	public NodeBean68 nodeBean68(){
		NodeBean68 nb68 = new NodeBean68();

		nb68.setNodeBean67(nodeBean67());
		return nb68;
	}

	@Bean
	public NodeBean67 nodeBean67(){
		NodeBean67 nb67 = new NodeBean67();

		nb67.setNodeBean66(nodeBean66());
		return nb67;
	}

	@Bean
	public NodeBean66 nodeBean66(){
		NodeBean66 nb66 = new NodeBean66();

		return nb66;
	}

	@Bean
	public NodeBean65 nodeBean65(){
		NodeBean65 nb65 = new NodeBean65();

		nb65.setNodeBean64(nodeBean64());
		return nb65;
	}

	@Bean
	public NodeBean64 nodeBean64(){
		NodeBean64 nb64 = new NodeBean64();

		nb64.setNodeBean63(nodeBean63());
		return nb64;
	}

	@Bean
	public NodeBean63 nodeBean63(){
		NodeBean63 nb63 = new NodeBean63();

		return nb63;
	}

	@Bean
	public NodeBean62 nodeBean62(){
		NodeBean62 nb62 = new NodeBean62();

		nb62.setNodeBean61(nodeBean61());
		return nb62;
	}

	@Bean
	public NodeBean61 nodeBean61(){
		NodeBean61 nb61 = new NodeBean61();

		nb61.setNodeBean60(nodeBean60());
		return nb61;
	}

	@Bean
	public NodeBean60 nodeBean60(){
		NodeBean60 nb60 = new NodeBean60();

		return nb60;
	}

	@Bean
	public NodeBean59 nodeBean59(){
		NodeBean59 nb59 = new NodeBean59();

		nb59.setNodeBean58(nodeBean58());
		return nb59;
	}

	@Bean
	public NodeBean58 nodeBean58(){
		NodeBean58 nb58 = new NodeBean58();

		nb58.setNodeBean57(nodeBean57());
		return nb58;
	}

	@Bean
	public NodeBean57 nodeBean57(){
		NodeBean57 nb57 = new NodeBean57();

		return nb57;
	}

	@Bean
	public NodeBean56 nodeBean56(){
		NodeBean56 nb56 = new NodeBean56();

		nb56.setNodeBean55(nodeBean55());
		return nb56;
	}

	@Bean
	public NodeBean55 nodeBean55(){
		NodeBean55 nb55 = new NodeBean55();

		nb55.setNodeBean54(nodeBean54());
		return nb55;
	}

	@Bean
	public NodeBean54 nodeBean54(){
		NodeBean54 nb54 = new NodeBean54();

		return nb54;
	}

	@Bean
	public NodeBean53 nodeBean53(){
		NodeBean53 nb53 = new NodeBean53();

		nb53.setNodeBean52(nodeBean52());
		return nb53;
	}

	@Bean
	public NodeBean52 nodeBean52(){
		NodeBean52 nb52 = new NodeBean52();

		nb52.setNodeBean51(nodeBean51());
		return nb52;
	}

	@Bean
	public NodeBean51 nodeBean51(){
		NodeBean51 nb51 = new NodeBean51();

		return nb51;
	}

	@Bean
	public NodeBean50 nodeBean50(){
		NodeBean50 nb50 = new NodeBean50();

		nb50.setNodeBean49(nodeBean49());
		return nb50;
	}

	@Bean
	public NodeBean49 nodeBean49(){
		NodeBean49 nb49 = new NodeBean49();

		nb49.setNodeBean48(nodeBean48());
		return nb49;
	}

	@Bean
	public NodeBean48 nodeBean48(){
		NodeBean48 nb48 = new NodeBean48();

		return nb48;
	}

	@Bean
	public NodeBean47 nodeBean47(){
		NodeBean47 nb47 = new NodeBean47();

		nb47.setNodeBean46(nodeBean46());
		return nb47;
	}

	@Bean
	public NodeBean46 nodeBean46(){
		NodeBean46 nb46 = new NodeBean46();

		nb46.setNodeBean45(nodeBean45());
		return nb46;
	}

	@Bean
	public NodeBean45 nodeBean45(){
		NodeBean45 nb45 = new NodeBean45();

		return nb45;
	}

	@Bean
	public NodeBean44 nodeBean44(){
		NodeBean44 nb44 = new NodeBean44();

		nb44.setNodeBean43(nodeBean43());
		return nb44;
	}

	@Bean
	public NodeBean43 nodeBean43(){
		NodeBean43 nb43 = new NodeBean43();

		nb43.setNodeBean42(nodeBean42());
		return nb43;
	}

	@Bean
	public NodeBean42 nodeBean42(){
		NodeBean42 nb42 = new NodeBean42();

		return nb42;
	}

	@Bean
	public NodeBean41 nodeBean41(){
		NodeBean41 nb41 = new NodeBean41();

		nb41.setNodeBean40(nodeBean40());
		return nb41;
	}

	@Bean
	public NodeBean40 nodeBean40(){
		NodeBean40 nb40 = new NodeBean40();

		nb40.setNodeBean39(nodeBean39());
		return nb40;
	}

	@Bean
	public NodeBean39 nodeBean39(){
		NodeBean39 nb39 = new NodeBean39();

		return nb39;
	}

	@Bean
	public NodeBean38 nodeBean38(){
		NodeBean38 nb38 = new NodeBean38();

		nb38.setNodeBean37(nodeBean37());
		return nb38;
	}

	@Bean
	public NodeBean37 nodeBean37(){
		NodeBean37 nb37 = new NodeBean37();

		nb37.setNodeBean36(nodeBean36());
		return nb37;
	}

	@Bean
	public NodeBean36 nodeBean36(){
		NodeBean36 nb36 = new NodeBean36();

		return nb36;
	}

	@Bean
	public NodeBean35 nodeBean35(){
		NodeBean35 nb35 = new NodeBean35();

		nb35.setNodeBean34(nodeBean34());
		return nb35;
	}

	@Bean
	public NodeBean34 nodeBean34(){
		NodeBean34 nb34 = new NodeBean34();

		nb34.setNodeBean33(nodeBean33());
		return nb34;
	}

	@Bean
	public NodeBean33 nodeBean33(){
		NodeBean33 nb33 = new NodeBean33();

		return nb33;
	}

	@Bean
	public NodeBean32 nodeBean32(){
		NodeBean32 nb32 = new NodeBean32();

		nb32.setNodeBean31(nodeBean31());
		return nb32;
	}

	@Bean
	public NodeBean31 nodeBean31(){
		NodeBean31 nb31 = new NodeBean31();

		nb31.setNodeBean30(nodeBean30());
		return nb31;
	}

	@Bean
	public NodeBean30 nodeBean30(){
		NodeBean30 nb30 = new NodeBean30();

		return nb30;
	}

	@Bean
	public NodeBean29 nodeBean29(){
		NodeBean29 nb29 = new NodeBean29();

		nb29.setNodeBean28(nodeBean28());
		return nb29;
	}

	@Bean
	public NodeBean28 nodeBean28(){
		NodeBean28 nb28 = new NodeBean28();

		nb28.setNodeBean27(nodeBean27());
		return nb28;
	}

	@Bean
	public NodeBean27 nodeBean27(){
		NodeBean27 nb27 = new NodeBean27();

		return nb27;
	}

	@Bean
	public NodeBean26 nodeBean26(){
		NodeBean26 nb26 = new NodeBean26();

		nb26.setNodeBean25(nodeBean25());
		return nb26;
	}

	@Bean
	public NodeBean25 nodeBean25(){
		NodeBean25 nb25 = new NodeBean25();

		nb25.setNodeBean24(nodeBean24());
		return nb25;
	}

	@Bean
	public NodeBean24 nodeBean24(){
		NodeBean24 nb24 = new NodeBean24();

		return nb24;
	}

	@Bean
	public NodeBean23 nodeBean23(){
		NodeBean23 nb23 = new NodeBean23();

		nb23.setNodeBean22(nodeBean22());
		return nb23;
	}

	@Bean
	public NodeBean22 nodeBean22(){
		NodeBean22 nb22 = new NodeBean22();

		nb22.setNodeBean21(nodeBean21());
		return nb22;
	}

	@Bean
	public NodeBean21 nodeBean21(){
		NodeBean21 nb21 = new NodeBean21();

		return nb21;
	}

	@Bean
	public NodeBean20 nodeBean20(){
		NodeBean20 nb20 = new NodeBean20();

		nb20.setNodeBean19(nodeBean19());
		return nb20;
	}

	@Bean
	public NodeBean19 nodeBean19(){
		NodeBean19 nb19 = new NodeBean19();

		nb19.setNodeBean18(nodeBean18());
		return nb19;
	}

	@Bean
	public NodeBean18 nodeBean18(){
		NodeBean18 nb18 = new NodeBean18();

		return nb18;
	}

	@Bean
	public NodeBean17 nodeBean17(){
		NodeBean17 nb17 = new NodeBean17();

		nb17.setNodeBean16(nodeBean16());
		return nb17;
	}

	@Bean
	public NodeBean16 nodeBean16(){
		NodeBean16 nb16 = new NodeBean16();

		nb16.setNodeBean15(nodeBean15());
		return nb16;
	}

	@Bean
	public NodeBean15 nodeBean15(){
		NodeBean15 nb15 = new NodeBean15();

		return nb15;
	}

	@Bean
	public NodeBean14 nodeBean14(){
		NodeBean14 nb14 = new NodeBean14();

		nb14.setNodeBean13(nodeBean13());
		return nb14;
	}

	@Bean
	public NodeBean13 nodeBean13(){
		NodeBean13 nb13 = new NodeBean13();

		nb13.setNodeBean12(nodeBean12());
		return nb13;
	}

	@Bean
	public NodeBean12 nodeBean12(){
		NodeBean12 nb12 = new NodeBean12();

		return nb12;
	}

	@Bean
	public NodeBean11 nodeBean11(){
		NodeBean11 nb11 = new NodeBean11();

		nb11.setNodeBean10(nodeBean10());
		return nb11;
	}

	@Bean
	public NodeBean10 nodeBean10(){
		NodeBean10 nb10 = new NodeBean10();

		nb10.setNodeBean9(nodeBean9());
		return nb10;
	}

	@Bean
	public NodeBean9 nodeBean9(){
		NodeBean9 nb9 = new NodeBean9();

		return nb9;
	}

	@Bean
	public NodeBean8 nodeBean8(){
		NodeBean8 nb8 = new NodeBean8();

		nb8.setNodeBean7(nodeBean7());
		return nb8;
	}

	@Bean
	public NodeBean7 nodeBean7(){
		NodeBean7 nb7 = new NodeBean7();

		nb7.setNodeBean6(nodeBean6());
		return nb7;
	}

	@Bean
	public NodeBean6 nodeBean6(){
		NodeBean6 nb6 = new NodeBean6();

		return nb6;
	}

	@Bean
	public NodeBean5 nodeBean5(){
		NodeBean5 nb5 = new NodeBean5();

		nb5.setNodeBean4(nodeBean4());
		return nb5;
	}

	@Bean
	public NodeBean4 nodeBean4(){
		NodeBean4 nb4 = new NodeBean4();

		nb4.setNodeBean3(nodeBean3());
		return nb4;
	}

	@Bean
	public NodeBean3 nodeBean3(){
		NodeBean3 nb3 = new NodeBean3();

		return nb3;
	}

	@Bean
	public NodeBean2 nodeBean2(){
		NodeBean2 nb2 = new NodeBean2();

		nb2.setNodeBean1(nodeBean1());
		return nb2;
	}

	@Bean
	public NodeBean1 nodeBean1(){
		NodeBean1 nb1 = new NodeBean1();
		nb1.setLeafBean(leafBean());
		return nb1;
	}
	
	@Bean
	public LeafBean leafBean(){
		return new LeafBean("someValue");
	}
}