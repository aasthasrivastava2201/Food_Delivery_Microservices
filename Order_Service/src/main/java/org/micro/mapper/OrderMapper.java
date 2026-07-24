package org.micro.mapper;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.micro.dto.OrderDTO;
import org.micro.entity.Order;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}
