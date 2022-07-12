package academy.devdojo.maratonajava.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public final class Producer {
    private final Integer id;
    private final String name;



}
