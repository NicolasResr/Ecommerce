package com.senai.ecommerce.dto;

import java.time.Instant;

import com.senai.ecommerce.enun.StatusDoPedido;

public record PedidoDTO(Long id,Instant momento, StatusDoPedido Status) {

}
