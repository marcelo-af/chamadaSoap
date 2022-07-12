package com.projectsoap.correios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

import com.projectsoap.correios.servico.AtendeCliente;
import com.projectsoap.correios.servico.EnderecoERP;
import com.projectsoap.correios.servico.SQLException_Exception;
import com.projectsoap.correios.servico.SigepClienteException;

import jakarta.xml.ws.Service;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException, SQLException_Exception, SigepClienteException    {
    	
    	URL urlCorreios = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
    	
    	QName qnameCorreios = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");
    	
    	Service serviceCorreios = Service.create(urlCorreios, qnameCorreios);
    	
    	//O metodo getPort cria o proxy para acessar o serviço que esta na urlCorreios
    	AtendeCliente correios = serviceCorreios.getPort(AtendeCliente.class);
    	
    	//metodo pego na interface AtendCliente e visto que o metodo retorna o EnderecoERP
    	EnderecoERP endereco = correios.consultaCEP("04809180");
		System.out.println("Endereço: " + endereco.getEnd() + "\n" + "Bairro: " + endereco.getBairro() + "\n"
				+ "Cidade: " + endereco.getCidade());

    }
}
