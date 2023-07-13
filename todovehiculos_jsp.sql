-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-07-2023 a las 20:21:20
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `todovehiculos_jsp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `cedula` int(10) NOT NULL,
  `clave` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `genero` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `cedula`, `clave`, `nombre`, `apellido`, `genero`, `email`) VALUES
(1, 1234, '1234', 'zxcz', 'adssad', 'm', 'sdfds@g'),
(3, 3433456, 'Pedro123', 'zxcz', 'adssad', 'm', 'sdfds@g'),
(4, 3433477, 'Pedro123', 'asd', 'asd', 'm', 'as@w'),
(5, 34334333, 'Pedro123', 'juan', 'martinez', 'm', 'as@example.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `placa` varchar(6) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `version` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `numPuestos` int(11) NOT NULL,
  `numPuertas` int(11) NOT NULL,
  `combustible` varchar(10) NOT NULL,
  `kilometros` int(11) NOT NULL,
  `cilindraje` int(11) NOT NULL,
  `categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`id`, `placa`, `marca`, `modelo`, `version`, `color`, `numPuestos`, `numPuertas`, `combustible`, `kilometros`, `cilindraje`, `categoria`) VALUES
(1, '000008', 'Marca1', 'Modelo1', 'Versión1', 'Rojo', 4, 5, 'Gasolina', 10000, 2000, 1),
(2, 'DEF456', 'Marca2', 'Modelo2', 'Versión2', 'Azul', 2, 3, 'Diesel', 5000, 1500, 2),
(3, 'GHI789', 'Marca3', 'Modelo3', 'Versión3', 'Verde', 5, 4, 'Gasolina', 8000, 1800, 1),
(8, '11', '1', 'w', '1', '1', 1, 1, '1', 1, 1, 1),
(9, '1', '1', '1asdasd', '1', '1', 1, 1, '1', 1, 1, 1),
(23, 'TRM85C', '44', '4444', '3', '4', 4, 4, '4', 4, 4, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cedula` (`cedula`);

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `vehiculos_placa_unique` (`placa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
