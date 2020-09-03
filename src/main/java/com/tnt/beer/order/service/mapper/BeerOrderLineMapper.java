package com.tnt.beer.order.service.mapper;

import org.mapstruct.Mapper;

import com.tnt.beer.order.domain.BeerOrderLine;
import com.tnt.beer.order.model.BeerOrderLineDto;

@Mapper(componentModel = "spring", uses = {DateMapper.class})
public interface BeerOrderLineMapper extends BaseMapper<BeerOrderLineDto, BeerOrderLine> {

	@Override
	BeerOrderLineDto toDto(BeerOrderLine line);

	@Override
    BeerOrderLine fromDto(BeerOrderLineDto dto);
}
