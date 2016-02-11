import java.util.ArrayList;
import java.util.Arrays;

public class BigLetterGen {

	static StringBuilder pos1 = new StringBuilder();
	static StringBuilder pos2 = new StringBuilder();
	static StringBuilder pos3 = new StringBuilder();
	static StringBuilder pos4 = new StringBuilder();
	static StringBuilder pos5 = new StringBuilder();
	static String[] bigWord = new String[5];


	static String[][] list = {
			{"h","#   # ","##### "},
			{"e","##### ","#     "},
			{"l","#     ","##### "},
			{"o"," ###  ","#   # "},
			{"w","#     # ","#  #  # ","# ### # ","##   ## " },
			{"r","####  ","#   # ","#  #  "},
			{"d","####  ","#   # "},
			{" ","    "}
	};

	public static String[] letterList(String word){

		System.out.println("Word is "+ word);

		for (int i = 0; i < word.length(); i++) {
			String letter = String.valueOf(word.charAt(i));

			if (letter.equals("h")) {
				pos1.append(list[0][1].toString());
				pos2.append(list[0][1].toString());
				pos3.append(list[0][2].toString());
				pos4.append(list[0][1].toString());
				pos5.append(list[0][1].toString());
			}
			if (letter.equals("e")) {
				pos1.append(list[1][1].toString());
				pos2.append(list[1][2].toString());
				pos3.append(list[1][1].toString());
				pos4.append(list[1][2].toString());
				pos5.append(list[1][1].toString());
			}
			if (letter.equals("l")) {
				pos1.append(list[2][1].toString());
				pos2.append(list[2][1].toString());
				pos3.append(list[2][1].toString());
				pos4.append(list[2][1].toString());
				pos5.append(list[2][2].toString());
			}
			if (letter.equals("o")) {
				pos1.append(list[3][1].toString());
				pos2.append(list[3][2].toString());
				pos3.append(list[3][2].toString());
				pos4.append(list[3][2].toString());
				pos5.append(list[3][1].toString());
			}
			if (letter.equals("w")) {
				pos1.append(list[4][1].toString());
				pos2.append(list[4][2].toString());
				pos3.append(list[4][3].toString());
				pos4.append(list[4][4].toString());
				pos5.append(list[4][1].toString());
			}
			if (letter.equals("r")) {
				pos1.append(list[5][1].toString());
				pos2.append(list[5][2].toString());
				pos3.append(list[5][1].toString());
				pos4.append(list[5][3].toString());
				pos5.append(list[5][2].toString());
			}
			if (letter.equals("d")) {
				pos1.append(list[6][1].toString());
				pos2.append(list[6][2].toString());
				pos3.append(list[6][2].toString());
				pos4.append(list[6][2].toString());
				pos5.append(list[6][1].toString());
			}
			if (letter.equals(" ")) {
				pos1.append(list[7][1].toString());
				pos2.append(list[7][1].toString());
				pos3.append(list[7][1].toString());
				pos4.append(list[7][1].toString());
				pos5.append(list[7][1].toString());
			}
			
		}
		bigWord[0] = pos1.toString();
		bigWord[1] = pos2.toString();	
		bigWord[2] = pos3.toString();
		bigWord[3] = pos4.toString();
		bigWord[4] = pos5.toString();
		return bigWord;
	}
}

