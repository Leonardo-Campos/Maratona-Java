package academy.devdojo.maratonajava.ZZIjdbc.test;

import academy.devdojo.maratonajava.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();
//        ProducerService.save(producer);
//        ProducerService.delete(4);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Bones");
//        log.info("Producers found '{}'", producers);
//        ProducerService.findByNameAndDelete("Studio deen");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("B or X'='X");
//        log.info("Producers found '{}'", producers);
//                ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("mad");
        log.info("Producers found '{}'", producers);


    }

}
