package chatprotocol;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Porras
 */


public class XmlPersister{
    private String path;
    private static XmlPersister Instance;
    
    
    public static XmlPersister getInstance(String id){
        if (Instance==null) {
            Instance = new XmlPersister();
            Instance.setPath(id+".xml");
            return Instance;
        }
        return Instance;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    public Data load()throws Exception{
        File file = new File(path);
        
        
        if (file.exists() && file.canRead()) {
            JAXBContext jaxbContext =  JAXBContext.newInstance(Data.class);
            FileInputStream in = new FileInputStream(path);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Data result = (Data)unmarshaller.unmarshal(in);
            in.close();
            return result; 
        }
        return new Data(); 
    }
    
    public void store(Data datax) throws Exception{
        JAXBContext jaxbContext =  JAXBContext.newInstance(Data.class);
        FileOutputStream out  = new FileOutputStream(path);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(datax,out);
        out.flush();
        out.close();        
    }
}
