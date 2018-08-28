package org.doubleluck.radish_purchase_api.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.doubleluck.radish_purchase_api.model.po.Order;
import org.doubleluck.radish_purchase_api.model.po.OrderDetail;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
public class OrderDTO extends Order {

    private List<OrderDetail> orderDetails;

    private OrderDTO(){}

    public static OrderDTO buildFromOrder(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(order, orderDTO);
        return orderDTO;
    }

}
