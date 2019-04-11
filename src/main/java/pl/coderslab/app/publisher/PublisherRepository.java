package pl.coderslab.app.publisher;

import java.util.List;

public interface PublisherRepository {

    Publisher findByNip (String nip);

    Publisher findByRegon (String regon);
}
