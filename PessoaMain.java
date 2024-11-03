package uml;

public class PessoaMain {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Eduardo");
		p.setEndereco("IFC");
		p.setEndereco("");
		
		System.out.println(p);
		
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome("Eduardo");
		pf.setEndereco("IFC");
		pf.setCpf("123.456.789-89");
		pf.setEstadoCivil("Solteiro");
		
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome("Eduardo");
		pj.setEndereco("IFC");
		pj.setCnpj("61.649.158/0001-14");
		pj.setTipoEmpresa("MEI");
		
		System.out.println(pj);
	}

}
