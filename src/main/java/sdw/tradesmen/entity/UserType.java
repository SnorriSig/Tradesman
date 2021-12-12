package sdw.tradesmen.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userTypeId;
    private String type;
}
