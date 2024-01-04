package Model;

import Data.ReadFileJSonOfVirusStore;
import Repository.Repository;
import View.ViewFactory;

public class Model{
	@SuppressWarnings("unused")
	private static Model instance;
	private final ViewFactory viewFactory;
	private static Model model;
	
	private final Repository virusWithLipitRepository;
	private final Repository virusWithoutLipitRepository;
	
	private Model() {
		this.viewFactory = new ViewFactory();
		
		//Khoi tao kho virusWithLipit
		Repository repository = new Repository();
		ReadFileJSonOfVirusStore readFileJSonOfVirusStore = new ReadFileJSonOfVirusStore();
		readFileJSonOfVirusStore.read("Viruses/src/Data/VirusWithLipitStore.json");
		repository = readFileJSonOfVirusStore.getRepository();
		repository.showListVirus();
		this.virusWithLipitRepository = repository;
		
		//Khoi tao kho virusWithoutLipit
		Repository repository2 = new Repository();
		ReadFileJSonOfVirusStore readFileJSonOfVirusStore2 = new ReadFileJSonOfVirusStore();
		readFileJSonOfVirusStore2.read("Viruses/src/Data/VirusWithoutLipitStore.json");
		repository2 = readFileJSonOfVirusStore2.getRepository();
		repository2.showListVirus();
		this.virusWithoutLipitRepository = repository2;
		
	}
	
	public static synchronized Model getInstance() {
		if (model == null) {
			model = new Model();
		}
		return model;
	}
	
	public ViewFactory getViewFactory() {
		return viewFactory;
	}

	public Repository getVirusWithLipitRepository() {
		return virusWithLipitRepository;
	}

	public Repository getVirusWithoutLipitRepository() {
		return virusWithoutLipitRepository;
	}
}