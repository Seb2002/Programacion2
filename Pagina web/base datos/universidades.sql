-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-11-2021 a las 23:14:47
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `universidades`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `universidad`
--

CREATE TABLE `universidad` (
  `nombre_universidad` varchar(50) NOT NULL,
  `facultad` varchar(50) NOT NULL,
  `nombre_carrera` varchar(50) NOT NULL,
  `precio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `universidad`
--

INSERT INTO `universidad` (`nombre_universidad`, `facultad`, `nombre_carrera`, `precio`) VALUES
('U_Cundinamarca', 'Ingenieria', 'Ing_Sistemas', '$903.000'),
('U_Cundinamarca', 'Ingenieria', 'Ing_Electronica', '$903.000'),
('U_Cundinamarca', 'Ingenieria', 'Ing_Industrial', '$903.000'),
('U_Cundinamarca', 'Ingenieria', 'Ing_SistemasComputacion', '$903.000'),
('U_Cundinamarca', 'Ciencias_Administrativas_Economicas_Contables', 'Administracion_Empresas', '$903.000'),
('U_Cundinamarca', 'Ciencias_Administrativas_Economicas_Contables', 'Contaduria_Publica', '$903.000'),
('U_Cundinamarca', 'Ciencias_Administrativas_Economicas_Contables', 'Tecnologia_Gestion_Hotelera', '$903.000'),
('U_Cundinamarca', 'Ciencias_Agropecuarias', 'Ingeneria_Agronomica', '$903.000'),
('U_Cundinamarca', 'Ciencias_Agropecuarias', 'Ingenieria_Ambiental', '$903.000'),
('U_Cundinamarca', 'Ciencias_Sociales_Humanidades', 'Psicología', '$903.000'),
('UniMinuto', 'Ciencias_Administrativas_Economicas_Contables', 'Contaduria_Publica', '$1.438.300'),
('UniMinuto', 'Ciencias_Sociales_Humanidades', 'Comunicacion_Social', '$ 3.763.100'),
('UniMinuto', 'Ciencias_Administrativas_Economicas_Contables', 'Administracion_Empresas', '$ 3.658.000'),
('UniMinuto', 'Ciencias_Administrativas_Economicas_Contables', 'Administracion_Financiera', '$ 1.854.900'),
('UniMinuto', 'Ciencias_Salud', 'Administracion_Seguridad_Trabajo', '$ 2.183.800'),
('Uni_Agraria', 'Ingeniería', 'Ing_Industrial', '$5.417.150'),
('Uni_Agraria', 'Ingenieria', 'Ing_Mecatronica', '$5.417.150'),
('Uni_Agraria', 'Ciencias_Administrativas_Economicas_Contables', 'Contaduria_Publica', '$3.730.450'),
('Uni_Agraria', 'Ciencias_Administrativas_Economicas_Contables', 'Administracion_Financiera_Sistemas', '$3.877.750'),
('Uni_Agraria', 'Ciencias_Politicas_Sociales', 'Derecho', '$4.702.550'),
('Uni_Agraria', 'Ciencias_Salud', 'Medicina_Veterinaria', '$7.223.602'),
('Uni_Agraria', 'Ciencias_Desarollo_Tecnologia', 'Zootecnia', '$5.9.66.400'),
('Unad_Faca', 'Ciencias_Basicas_Ingenieria_Tecnologia', 'Diseño_Industrial', '$1.800.000'),
('Unad_Faca', 'Ciencias_Basicas_Ingenieria_Tecnologia', 'Ingenieria_Industrial', '$1.800.000'),
('Unad_Faca', 'Ciencias_Basicas_Ingenieria_Tecnologia', 'Ingenieria_Multimedia', '$2.000.000'),
('Unad_Faca', 'Ciencias_Basicas_Ingenieria_Tecnologia', 'Ingenieria_Sistemas', '$1.564.000'),
('Unad_Faca', 'Ciencias_Basicas_Ingenieria_Tecnologia', 'Ingenieria_Telecomunicaciones', '$2.200.000'),
('Unad_Faca', 'Ciencias_Basicas_Ingenieria_Tecnologia', 'Ingenieria_Electronica', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
