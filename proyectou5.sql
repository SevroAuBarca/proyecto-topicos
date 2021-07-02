-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-07-2021 a las 22:08:31
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectou5`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `ncontrol` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `Apellido_p` varchar(30) DEFAULT NULL,
  `Apellido_M` varchar(30) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `codigo_post` int(11) DEFAULT NULL,
  `Telefono` bigint(20) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `carrera` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`ncontrol`, `nombre`, `Apellido_p`, `Apellido_M`, `edad`, `sexo`, `codigo_post`, `Telefono`, `direccion`, `carrera`) VALUES
(18680096, 'Daniel', 'Contreras', 'Martinez', 22, 'H', 62715, 73512118, 'Ayala', 'ISC');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `ncontrol` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `Apellido_p` varchar(30) DEFAULT NULL,
  `Apellido_M` varchar(30) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `codigo_post` int(11) DEFAULT NULL,
  `Telefono` int(11) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `Grado_Estudios` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`ncontrol`, `nombre`, `Apellido_p`, `Apellido_M`, `edad`, `sexo`, `codigo_post`, `Telefono`, `direccion`, `Grado_Estudios`) VALUES
(18680096, 'daniel', 'da', 'asa', 5, 'h', 62715, 1212233, 'ads', 'assa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ncontrol` int(11) NOT NULL,
  `contraseña` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ncontrol`, `contraseña`) VALUES
(18680096, '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`ncontrol`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`ncontrol`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ncontrol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
