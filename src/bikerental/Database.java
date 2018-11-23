
package bikerental;

import org.bson.codecs.configuration.CodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.pojo.PojoCodecProvider;


public class Database {
    private static MongoClientURI uri;
    private static MongoClient client;
    private static MongoDatabase db;
   

    public static void init(){
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                        fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        uri  = new MongoClientURI("mongodb://admin:12345678za@ds249583.mlab.com:49583/bikerental");
        client = new MongoClient(uri);
        db = client.getDatabase(uri.getDatabase());
        db = db.withCodecRegistry(pojoCodecRegistry);

    }
    
    public static MongoDatabase getDatabase(){
        return db;
    }
    
}
