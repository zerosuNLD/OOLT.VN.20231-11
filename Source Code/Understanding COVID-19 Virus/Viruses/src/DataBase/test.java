package DataBase;

import Repository.Repository;

public class test {

	public static void main(String[] args) {
		// repo nay dung de nhan data tu file json
//		Repository repository = new Repository();
//		ReadFileJSonOfVirusStore readFileJSonOfVirusStore = new ReadFileJSonOfVirusStore();
//		readFileJSonOfVirusStore.read("Viruses/src/DataBase/VirusWithLipitStor.json");
//		repository = readFileJSonOfVirusStore.getRepository();
//		repository.showListVirus();
		
		Repository repository2 = new Repository();
		ReadFileJSonOfVirusStore readFileJSonOfVirusStore2 = new ReadFileJSonOfVirusStore();
		readFileJSonOfVirusStore2.read("Viruses/src/DataBase/VirusWithoutLipitStore.json");
		repository2.showListVirus();
		
//		repository2.addRepository(repository);
//		repository2.showListVirus();
		
	}
}