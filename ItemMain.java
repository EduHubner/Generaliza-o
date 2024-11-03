package exItem;

public class ItemMain {

	public static void main(String[] args) {
		
		Item item = new Item();
		
		item.setCodigo(132654);
		item.setDescricao("Usado para som");
		
		System.out.println(item);
		
		Livro livro = new Livro();
		
		livro.setCodigo(12364);
		livro.setDescricao("Romance");
		livro.setAutor("Emanuel Pereira");
		
		System.out.println(livro);
		
		Midia midia = new Midia();
		
		midia.setCodigo(798546);
		midia.setDescricao("Ouvir música");
		midia.setGravadora("MONKEYSONS");
		midia.setDuracao(159);
		
		System.out.println(midia);
		
		CD cd = new CD();
		
		cd.setCodigo(123456);
		cd.setDescricao("Rock");
		cd.setDuracao(241);
		cd.setGravadora("SOMNACAIXA");
		cd.setAlbum("Som do Sol");
		cd.setArtista("Lyu Kang");
		cd.setFaixas(10);
		
		System.out.println(cd);
		
		VHS vhs = new VHS();
		
		vhs.setCodigo(46284);
		vhs.setDescricao("Filmão");
		vhs.setDuracao(15984);
		vhs.setGravadora("TVSHOW");
		vhs.setTitulo("Em busca da casa automática");
		
		System.out.println(vhs);
	}

}
