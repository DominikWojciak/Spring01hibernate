package pl.coderslab.app.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PublisherService {

    @Autowired
    private PublisherDao publisherDao;

    public void create(Publisher publisher) {
        publisherDao.create(publisher);
    }

    public Publisher read(Long id) {
        return publisherDao.read(id);
    }

    public void update(Publisher publisher) {
        publisherDao.update(publisher);
    }

    public void delete(Long id) {
        publisherDao.delete(id);
    }

    public List<Publisher> findAll(){
        return publisherDao.findAll();
    }
}