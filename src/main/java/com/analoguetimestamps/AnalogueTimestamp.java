package com.analoguetimestamps;

import com.google.common.collect.ImmutableMap;
import java.awt.image.BufferedImage;
import java.util.Map;
import net.runelite.client.util.ImageUtil;

enum AnalogueTimestamp
{
	_0100("100"),
	_0105("105"),
	_0110("110"),
	_0115("115"),
	_0120("120"),
	_0125("125"),
	_0130("130"),
	_0135("135"),
	_0140("140"),
	_0145("145"),
	_0150("150"),
	_0155("155"),
	_0200("200"),
	_0205("205"),
	_0210("210"),
	_0215("215"),
	_0220("220"),
	_0225("225"),
	_0230("230"),
	_0235("235"),
	_0240("240"),
	_0245("245"),
	_0250("250"),
	_0255("255"),
	_0300("300"),
	_0305("305"),
	_0310("310"),
	_0315("315"),
	_0320("320"),
	_0325("325"),
	_0330("330"),
	_0335("335"),
	_0340("340"),
	_0345("345"),
	_0350("350"),
	_0355("355"),
	_0400("400"),
	_0405("405"),
	_0410("410"),
	_0415("415"),
	_0420("420"),
	_0425("425"),
	_0430("430"),
	_0435("435"),
	_0440("440"),
	_0445("445"),
	_0450("450"),
	_0455("455"),
	_0500("500"),
	_0505("505"),
	_0510("510"),
	_0515("515"),
	_0520("520"),
	_0525("525"),
	_0530("530"),
	_0535("535"),
	_0540("540"),
	_0545("545"),
	_0550("550"),
	_0555("555"),
	_0600("600"),
	_0605("605"),
	_0610("610"),
	_0615("615"),
	_0620("620"),
	_0625("625"),
	_0630("630"),
	_0635("635"),
	_0640("640"),
	_0645("645"),
	_0650("650"),
	_0655("655"),
	_0700("700"),
	_0705("705"),
	_0710("710"),
	_0715("715"),
	_0720("720"),
	_0725("725"),
	_0730("730"),
	_0735("735"),
	_0740("740"),
	_0745("745"),
	_0750("750"),
	_0755("755"),
	_0800("800"),
	_0805("805"),
	_0810("810"),
	_0815("815"),
	_0820("820"),
	_0825("825"),
	_0830("830"),
	_0835("835"),
	_0840("840"),
	_0845("845"),
	_0850("850"),
	_0855("855"),
	_0900("900"),
	_0905("905"),
	_0910("910"),
	_0915("915"),
	_0920("920"),
	_0925("925"),
	_0930("930"),
	_0935("935"),
	_0940("940"),
	_0945("945"),
	_0950("950"),
	_0955("955"),
	_1000("1000"),
	_1005("1005"),
	_1010("1010"),
	_1015("1015"),
	_1020("1020"),
	_1025("1025"),
	_1030("1030"),
	_1035("1035"),
	_1040("1040"),
	_1045("1045"),
	_1050("1050"),
	_1055("1055"),
	_1100("1100"),
	_1105("1105"),
	_1110("1110"),
	_1115("1115"),
	_1120("1120"),
	_1125("1125"),
	_1130("1130"),
	_1135("1135"),
	_1140("1140"),
	_1145("1145"),
	_1150("1150"),
	_1155("1155"),
	_1200("1200"),
	_1205("1205"),
	_1210("1210"),
	_1215("1215"),
	_1220("1220"),
	_1225("1225"),
	_1230("1230"),
	_1235("1235"),
	_1240("1240"),
	_1245("1245"),
	_1250("1250"),
	_1255("1255"),
	;

	private static final Map<String, AnalogueTimestamp> analogueTimestampMap;

	private final String filename;

	static
	{
		ImmutableMap.Builder<String, AnalogueTimestamp> builder = new ImmutableMap.Builder<>();

		for (final AnalogueTimestamp analogueTimestamp : values())
		{
			builder.put(analogueTimestamp.filename, analogueTimestamp);
		}

		analogueTimestampMap = builder.build();
	}

	AnalogueTimestamp(String filename)
	{
		this.filename = filename;
	}

	BufferedImage loadImage()
	{
		return ImageUtil.loadImageResource(getClass(), this.filename + ".png");
	}

	static AnalogueTimestamp getAnalogueTimestamp(String filename)
	{
		return analogueTimestampMap.get(filename);
	}
}
