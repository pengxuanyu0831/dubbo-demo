package demo.apii.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program dubbo-demo
 * @description:
 * @author: pengxuanyu
 * @create: 2022/06/04 14:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO implements Serializable {
    String name;

    String userPhone;

    String userAddress;

}
