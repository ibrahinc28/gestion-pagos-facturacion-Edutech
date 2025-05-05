package com.edutech.GestionPagosFactura.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pagos")
public class pagoController {

    @PostMapping

    public String registrarPago() {
        return "Pago registrado";
    }

    @GetMapping("/usuario/{usuarioId}")
    public String obtenerPagosPorUsuario(@PathVariable Long usuarioId) {
        return "Historial de pagos del usuario " + usuarioId;
        }
    @GetMapping("/{pagoId}")
    public String obtenerPagoPorId(@PathVariable Long pagoId) {
        return "Detalles del pago " + pagoId;
        }
    @GetMapping("/{pagoId}/estado")
    public String estadoDelPago(@PathVariable Long pagoId) {
        return "Estado del pago " + pagoId;
        }
}
