package com.edutech.GestionPagosFactura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class FacturaController {

        @PostMapping
        public String generarFactura() {
            return "Factura generada";
        }

        @GetMapping("/usuario/{usuarioId}")
        public String obtenerFacturasPorUsuario(@PathVariable Long usuarioId) {
            return "Facturas del usuario " + usuarioId;
        }

        @GetMapping("/{facturaId}")
        public String obtenerFacturaPorId(@PathVariable Long facturaId) {
            return "Detalles de la factura " + facturaId;
        }
    }


