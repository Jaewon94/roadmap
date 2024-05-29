package com.jaewon.roadmap02.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
