package Data;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Virus.GUI_Virus;
import Virus.GUI_Enveloped_Virus;
import Virus.GUI_Non_Enveloped_Virus;

public class InputVirusData {

	static GUI_Enveloped_Virus covid = new GUI_Enveloped_Virus(001, "Sars-Covi 2",
			"Ngoài acid nucleic và capsid, Sars-covi 2 có lớp vỏ chứa 4 loại protein là  protein (S), protein màng (M), protein vỏ (E) và nucleocapsid (N) protein", 
			"Enveloped Virus",
			"SARS-CoV-2 là một loại virus RNA dương chuỗi đơn, có vỏ bọc, có đường kính 60–140nm và các gai dài 9–12 nm (Hình 1). Nó là một phần của chi betacoronavirus, bao gồm MERS-CoV và SARS-CoV", 
			"Trong khi phân tử bề mặt tế bào ACE2 sớm được xác định là thụ thể nổi bật được liên kết bởi protein tăng đột biến, các phân tử bề mặt tế bào khác sau đó đã được đề xuất hoạt động như các thụ thể thay thế hoặc đồng thụ thể, bao gồm KIM1, AXL, L-SIGN và DC- ĐĂNG KÝ và SR-B1 . Đối với hầu hết các phân tử này, vẫn chưa rõ liệu đây có phải là các thụ thể thay thế cho ACE2 hay không, hay liệu hoạt động của chúng có bị hạn chế trong việc tạo điều kiện cho virus xâm nhập hay không.", 
			"/Screen/XML/Image/sars.jpg", "/Screen/XML/Image/conDuongLayNhiemHiv.jpg","Viruses/src/DataBase/Video/1.mp4");

	static GUI_Enveloped_Virus hiv = new GUI_Enveloped_Virus(002, "HIV", 
			"Virus suy giảm miễn dịch ở người có đường kính khoảng 80 đến 140 nanômét, có hình khối 20 mặt.[61][62] Màng ngoài virus là màng bọc lipid, đến từ tế bào túc chủ, đồng thời lấp vào gp120 và gp41 - hai loại protein của virus, trong đó gp41 là gp41 là protein xuyên màng, gp120 là mặt ngoài, kết hợp với gp41 thông qua tác dụng không cộng hoá trị", 
			"Enveloped virus",
			"Virus gây suy giảm miễn dịch ở người hay HIV là hai loài Lentivirus (phân nhóm của retrovirus) xâm nhiễm cơ thể người. Qua thời gian, chúng gây hội chứng suy giảm miễn dịch mắc phải (AIDS),[1][2] tình trạng mà hệ miễn dịch ngày càng suy yếu cho phép ung thư và các loại nhiễm trùng cơ hội phát triển.[3] Nếu không điều trị, thời gian sống sót trung bình của người nhiễm HIV ước tính từ 9 đến 11 năm, phụ thuộc vào loại virus.", 
			"Virion HIV xâm nhập đại thực bào và tế bào T CD4+ bằng cách đưa những glycoprotein trên bề mặt của nó hút bám vào thụ thể trên tế bào mục tiêu rồi dung hợp vỏ ngoài virus với màng tế bào mục tiêu và giải phóng capsid vào tế bào", 
			"/Screen/XML/Image/rotaviruses.jpg", "/Screen/XML/Image/conDuongLayNhiemHiv.jpg","Viruses/src/DataBase/Video/1.mp4");

	static GUI_Non_Enveloped_Virus rhinovirus  = new GUI_Non_Enveloped_Virus(001, "rhinovirus", 
			": Rhinovirus có bộ gen RNA cảm giác dương chuỗi đơn có chiều dài từ 7200 đến 8500 nucleotide. Ở đầu 5' của bộ gen là một protein được mã hóa bởi virus và giống như ở mRNA của động vật có vú, có một đuôi poly-A dài 3'. Protein cấu trúc được mã hóa ở vùng 5' của bộ gen và không cấu trúc ở đầu 3'. Điều này giống nhau đối với tất cả các picornavirus. Bản thân các hạt virus không được bao bọc và có cấu trúc mười hai mặt.", 
			"Non-Enveloped virus",
			"Rhinovirus là một loại virus RNA chuỗi đơn, có ý nghĩa tích cực thuộc chi Enterovirus trong họ Picornaviridae. Rhinovirus là tác nhân lây nhiễm virus phổ biến nhất ở người và là nguyên nhân chính gây ra cảm lạnh thông thường.", 
			"Infection", 
			"/Screen/XML/Image/HIV.jpg", "/Screen/XML/Image/conDuongLayNhiemHiv.jpg", "Viruses/src/Data/Video/1.mp4");
	
	static GUI_Non_Enveloped_Virus norovirus  = new GUI_Non_Enveloped_Virus(001, "norovirus", 
			"Norovirus không có vỏ bọc, có hình dạng 20 mặt. Đường kính vỏ Capsid rất khác nhau, đường kính từ 23 đến 40 nm. Norovirus chứa bộ gen RNA tuyến tính, không phân đoạn, [38] có cảm giác dương khoảng 7,5 kilobase, mã hóa một polyprotein lớn được phân cắt thành sáu protein phi cấu trúc nhỏ hơn (NS1/2 đến NS7) [40] bởi virus 3C -giống như protease (NS6), một protein cấu trúc chính (VP1) có trọng lượng khoảng 58~60 kDa và một protein vỏ nhỏ", 
			"Non-Enveloped virus",
			"Norovirus, còn được gọi là virus Norwalk và đôi khi được gọi là bệnh nôn mửa mùa đông, là nguyên nhân phổ biến nhất gây viêm dạ dày ruột.[1][6] Nhiễm trùng được đặc trưng bởi tiêu chảy không có máu, nôn mửa và đau dạ dày.[2] [3] Sốt hoặc đau đầu cũng có thể xảy ra.[2] Các triệu chứng thường xuất hiện từ 12 đến 48 giờ sau khi tiếp xúc và quá trình phục hồi thường xảy ra trong vòng một đến ba ngày.[2] Các biến chứng không phổ biến nhưng có thể bao gồm mất nước, đặc biệt ở người trẻ, người già và những người có vấn đề sức khỏe khác.", 
			"Sự nhân lên của virus là tế bào chất. Việc xâm nhập vào tế bào chủ được thực hiện bằng cách gắn vào các thụ thể của vật chủ, điều này làm trung gian cho quá trình nhập bào. Phiên mã virus RNA chuỗi dương là phương pháp sao chép. Quá trình dịch mã diễn ra bằng cách quét rò rỉ và khởi động lại sự chấm dứt RNA. ", 
			"/Screen/XML/Image/HIV.jpg", "/Screen/XML/Image/conDuongLayNhiemHiv.jpg", "Viruses/src/Data/Video/1.mp4");
	
	
	
	public static void main(String[] args) {
	

		// Them vao JSONObject

		// Them vao JSONArray
		JSONArray virusWithLipitJsonArray = new JSONArray();
		virusWithLipitJsonArray = addVirusToJsonArray(virusWithLipitJsonArray, covid, rotavirus);

		JSONArray virusWithoutLipitJsonArray = new JSONArray();
		virusWithoutLipitJsonArray = addVirusToJsonArray(virusWithoutLipitJsonArray, hiv);

		//Truyen virusWithLipit vao file virusWithLipitStore.json
		try (FileWriter file = new FileWriter("Viruses/src/Data/VirusWithLipitStore.json")) {

			System.out.println("OK");
			file.write(virusWithLipitJsonArray.toJSONString());
			file.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		//Truyen virusWithoutLipit vao file virusWithoutLipitStore.json
		try (FileWriter file = new FileWriter("Viruses/src/Data/VirusWithoutLipitStore.json")) {

			System.out.println("OK");
			file.write(virusWithoutLipitJsonArray.toJSONString());
			file.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private static JSONArray addVirusToJsonArray(JSONArray lJsonArray, GUI_Virus... viruslist) {
		for (GUI_Virus gUI_Virus : viruslist) {
			JSONObject virusDetailObject = new JSONObject();
			virusDetailObject.put("Id", gUI_Virus.getID());
			virusDetailObject.put("Name", gUI_Virus.getName());
			virusDetailObject.put("Structure", gUI_Virus.getStructure());
			virusDetailObject.put("Type", gUI_Virus.getType());
			virusDetailObject.put("Introduction", gUI_Virus.getIntroduction());
			virusDetailObject.put("Individual", gUI_Virus.getIndividual());
			virusDetailObject.put("LinkImage", gUI_Virus.getImageLink());
			virusDetailObject.put("LinkImage2", gUI_Virus.getImage2Link());
			virusDetailObject.put("LinkVideo", gUI_Virus.getLinkVideoString());
			
			lJsonArray.add(virusDetailObject);

		}
		return lJsonArray;
	}
}
