-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 18-Jun-2022 às 19:33
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `BDVENDAS`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_clientes`
--

CREATE TABLE `tb_clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `rg` varchar(30) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefone` varchar(30) DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `cep` varchar(100) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_clientes`
--

INSERT INTO `tb_clientes` (`id`, `nome`, `rg`, `cpf`, `email`, `telefone`, `celular`, `cep`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
(4, 'Alberto', '53.243.258-9', '896.424.374-34', 'teste@fatec.com.br', '(66) 6666 - 6666', '(99) 9 9999 - 9999', '12700 - 000', 'Rua da Prata', 678, '', 'TEste', 'Cruzeiro', 'RO'),
(5, 'Jairo', '55.594.746-9', '456.748.915-69', 'jairo@teste.com.br', '(12) 3147 - 7896', '(12) 9 4467 - 3518', '12700 - 012', 'Rua Paraiba', 853, 'loja', 'jd Palmas', 'Cruzeiro', 'SP'),
(6, 'Pedro', '65.465.786-4', '374.678.365-84', 'pedro@fatec', '(00) 0999 - 9988', '(12) 8 7736 - 4736', '12700 - 009', 'Rua teste', 123, 'loja', 'Teste do', 'Cruzeiro', 'SP'),
(8, 'João Paulo Almeida ', '78.415.777-9', '775.841.548-41', 'joãopaulo@gmail.com', '(11) 3144 - 9986', '(11) 9 8874 - 5682', '12700 - 000', 'Av palmas', 875, '', 'primavera', 'Santos', 'SP'),
(10, 'Pedro', '90.040.346-6', '155.040.900-80', 'Não informado', '', '', '80010 - 120', 'Rua teste', 10, '', 'jardim teste', 'Cruzeiro', 'SP'),
(38, 'Diego', '88.884.448-8', '888.555.999-40', 'Não informado', '(  )      -     ', '(  )        -     ', '80010 - 120', 'Alameda Doutor Muricy', 12, '', 'Centro', 'Curitiba', 'PR'),
(70, 'Gabriel', '54.343.294-7', '463.765.487-36', 'Não informado', '(  )      -     ', '(  )        -     ', '80010 - 120', 'Alameda Doutor Muricy', 123, '', 'Centro', 'Curitiba', 'PR'),
(84, 'Lala', '77.777.777-7', '454.218.753-58', 'Não informado', '(  )      -     ', '(  )        -     ', '80010 - 120', 'Alameda Doutor Muricy', 44, '', 'Centro', 'Curitiba', 'PR'),
(85, 'Josemar da Silva Pereira', '75.757.474-7', '969.697.979-58', 'Não informado', '(  )      -     ', '(  )        -     ', '12702 - 520', 'Rua Doutor Ângelo Hypolito Filho', 123, '', 'Vila Washington Beleza', 'Cruzeiro', 'SP'),
(86, 'Minato', '10.258.630-0', '564.922.020-55', 'minato@minato.com', '(  )      -     ', '(  )        -     ', '12702 - 310', 'Rua Manoel Ferrão', 65, '', 'Jardim América', 'Cruzeiro', 'SP'),
(87, 'Hinata Silva', '44.578.521-2', '545.228.542-22', 'h@h.com', '(  )      -     ', '(  )        -     ', '12720 - 380', 'Rua Germano Gori', 89, '', 'Vila Bionde', 'Cruzeiro', 'SP');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_fornecedores`
--

CREATE TABLE `tb_fornecedores` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `cnpj` varchar(100) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefone` varchar(30) DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `cep` varchar(100) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_fornecedores`
--

INSERT INTO `tb_fornecedores` (`id`, `nome`, `cnpj`, `email`, `telefone`, `celular`, `cep`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
(1, 'Dell ltda', '45.124.554/5125-55', 'dell@dell', '(15) 4516 - 1561', '(41) 1 5484 - 8156', '18481 - 515', 'Rua da Dell', 4545, '', 'Jardim Dell', 'Dell', 'SP'),
(2, 'HP ltda', '45.816.195/4548-94', 'hp@hp', '(65) 6546 - 5464', '(58) 6 6546 - 4565', '65654 - 678', 'Rua da HP', 4545, '', 'Jardim HP', 'HP', 'SP'),
(4, 'Lenovo', '48.145.648/4561-45', 'lenovo@lenovo', '(45) 4545 - 4897', '(58) 4 5648 - 4156', '45645 - 615', 'rua da Lenovo', 445, 'Lenovo', 'lenovo', '', 'ES'),
(5, 'Samsung', '88.545.644/0001-15', 'Não informado', '(  )      -     ', '(  )        -     ', '80010 - 120', 'Alameda Doutor Muricy', 151, '', 'Centro', 'Curitiba', 'PR'),
(7, 'Cooler Master', '88.545.644/8448-45', 'Não informado', '(  )      -     ', '(18) 2 1848 - 5155', '80010 - 120', 'Alameda Doutor Muricy', 15155, '', 'Centro', 'Curitiba', 'PR');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_funcionarios`
--

CREATE TABLE `tb_funcionarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `rg` varchar(30) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `cargo` varchar(100) DEFAULT NULL,
  `nivel_acesso` varchar(50) DEFAULT NULL,
  `telefone` varchar(30) DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `cep` varchar(100) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_funcionarios`
--

INSERT INTO `tb_funcionarios` (`id`, `nome`, `rg`, `cpf`, `email`, `senha`, `cargo`, `nivel_acesso`, `telefone`, `celular`, `cep`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
(1, 'Savio Castro', '55.556.666-6', '777.777.888-88', 'savio@fatec', '123456', 'Vendedor', 'Administrador', '(88) 8888 - 9999', '(55) 5 5666 - 6666', '12700 - 000', 'rua da papola', 123, '', 'por ai ', 'Cruzeiro', 'SP'),
(5, 'Diego', '54.656.546-5', '111.111.111-11', 'diego@uol.com', '123456', '', 'Usuário', '(12) 4545 - 4354', '(12) 3 4354 - 3543', '54354 - 354', 'rua', 3, '', 'jar', 'cru', 'RO'),
(6, 'Lucas Adati', '44.545.478-7', '487.484.545-44', 'lucas@fatec', '123456', 'Dev', 'Administrador', '(48) 4894 - 8454', '(48) 7 5484 - 8489', '80010 - 120', 'Alameda Doutor Muricy', 101, '', 'Centro', 'Curitiba', 'PR'),
(8, 'Gabriel', '84.894.556-4', '489.456.156-48', 'gabriel@fatec.com.br', '123456', 'Vendedor', 'Usuário', '(  )      -     ', '(12) 9 4548 - 9481', '80010 - 120', 'Alameda Doutor Muricy', 125, '', 'Centro', 'Curitiba', 'PR'),
(10, 'Mrs XML ', '52.435.202-0', '456.212.573-31', 'xml@xml.com', '123456', 'XML Server', 'Administrador', '(  )      -     ', '(54) 5 5542 - 8432', '80520 - 310', 'Rua do Verbo Divino', 45, '', 'Bom Retiro', 'Curitiba', 'PR'),
(15, 'Administrador', '84.845.648-4', '456.484.844-56', 'adm@fatec.sp.gov.br', '123456', 'Gerente', 'Administrador', '(12) 3144 - 4785', '(12) 9 8458 - 7554', '80010 - 120', 'Alameda Doutor Muricy', 12, '', 'Centro', 'Curitiba', 'PR'),
(16, 'Usuário', '45.456.489-4', '151.848.454-15', 'user@fatec.sp.gov.br', '123456', 'Vendedor', 'Usuário', '(12) 3144 - 8756', '(12) 9 7845 - 4584', '80010 - 120', 'Alameda Doutor Muricy', 45, '', 'Centro', 'Curitiba', 'PR');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_itensvendas`
--

CREATE TABLE `tb_itensvendas` (
  `id` int(11) NOT NULL,
  `venda_id` int(11) DEFAULT NULL,
  `produto_id` int(11) DEFAULT NULL,
  `qtd` int(11) DEFAULT NULL,
  `subtotal` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_itensvendas`
--

INSERT INTO `tb_itensvendas` (`id`, `venda_id`, `produto_id`, `qtd`, `subtotal`) VALUES
(1, 13, 1, 2, '460.00'),
(2, 24, 1, 3, '690.00'),
(3, 24, 2, 1, '2000.00'),
(4, 25, 4, 2, '260.00'),
(5, 26, 3, 2, '3600.00'),
(6, 27, 4, 3, '390.00'),
(7, 28, 2, 1, '2000.00'),
(8, 29, 2, 1, '2000.00'),
(9, 29, 1, 1, '230.00'),
(10, 30, 4, 4, '520.00'),
(11, 31, 2, 1, '2000.00'),
(12, 32, 8, 1, '1200.00'),
(13, 33, 8, 2, '2400.00'),
(14, 34, 1, 1, '230.00'),
(15, 34, 2, 3, '6000.00'),
(16, 35, 3, 1, '1800.00'),
(17, 36, 2, 2, '4000.00'),
(18, 37, 7, 1, '150.00'),
(19, 38, 1, 1, '250.00'),
(22, 43, 1, 1, '150.00'),
(23, 44, 3, 1, '1800.00'),
(24, 45, 4, 1, '130.00'),
(25, 46, 1, 1, '150.00'),
(26, 47, 1, 1, '250.00'),
(29, 51, 1, 1, '150.00'),
(30, 52, 1, 1, '150.00'),
(31, 53, 2, 1, '2000.00'),
(32, 54, 1, 1, '250.00'),
(33, 55, 1, 1, '150.00'),
(34, 56, 3, 1, '1800.00'),
(35, 57, 1, 1, '150.00'),
(36, 58, 2, 1, '2000.00'),
(37, 59, 2, 1, '2000.00'),
(38, 60, 1, 1, '250.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produtos`
--

CREATE TABLE `tb_produtos` (
  `id` int(11) NOT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  `preco` decimal(10,2) DEFAULT NULL,
  `qtd_estoque` int(11) DEFAULT NULL,
  `for_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_produtos`
--

INSERT INTO `tb_produtos` (`id`, `descricao`, `preco`, `qtd_estoque`, `for_id`) VALUES
(1, 'Mouse wireless', '250.00', 100001, 4),
(2, 'Notebook Inspiron', '2000.00', 0, 1),
(3, 'Monitor ultrawide fg', '1800.00', 0, 1),
(4, 'Teclado wireless ', '130.00', 3, 1),
(6, 'mouse', '21.00', 3, 1),
(7, 'teclado gamer', '150.00', 9, 1),
(8, 'Monitor Lenovo', '1200.00', 7, 4),
(16, 'Tablet Samsung', '1300.00', 5, 5),
(18, 'Tablet Samsung Model: D586', '1300.00', 12, 5),
(20, 'Tablet Samsung Model: F994', '1300.00', 5, 5),
(22, 'Monitor Lenovo 1', '1200.00', 62, 4),
(25, 'teste teste teste', '1.00', 2, 1),
(27, 'Teste do teste', '777.00', 7, 1),
(32, 'Mouse Pad ', '55.00', 4, 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_vendas`
--

CREATE TABLE `tb_vendas` (
  `id` int(11) NOT NULL,
  `cliente_id` int(11) DEFAULT NULL,
  `data_venda` datetime DEFAULT NULL,
  `total_venda` decimal(10,2) DEFAULT NULL,
  `observacoes` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_vendas`
--

INSERT INTO `tb_vendas` (`id`, `cliente_id`, `data_venda`, `total_venda`, `observacoes`) VALUES
(13, 4, '2022-05-17 00:00:00', '460.00', ''),
(24, 4, '2022-05-17 00:00:00', '2690.00', ''),
(25, 4, '2022-05-17 00:00:00', '260.00', ''),
(26, 5, '2022-05-17 00:00:00', '3600.00', ''),
(27, 8, '2022-05-17 00:00:00', '390.00', ''),
(28, 6, '2022-05-17 00:00:00', '2000.00', ''),
(29, 5, '2022-05-17 00:00:00', '2230.00', ''),
(30, 8, '2022-05-18 00:00:00', '520.00', 'embalar presente'),
(31, 4, '2022-05-24 00:00:00', '2000.00', 'embalar'),
(32, 4, '2022-05-24 00:00:00', '1200.00', 'Fragil'),
(33, 4, '2022-05-24 00:00:00', '2400.00', ''),
(34, 4, '2022-05-25 00:00:00', '6230.00', ''),
(35, 4, '2022-06-01 00:00:00', '1800.00', ''),
(36, 4, '2022-06-01 00:00:00', '4000.00', ''),
(37, 5, '2022-06-02 00:00:00', '150.00', ''),
(38, 4, '2022-06-06 00:00:00', '250.00', 'teste'),
(43, 10, '2022-06-06 00:00:00', '150.00', ''),
(44, 4, '2022-06-06 00:00:00', '1800.00', ''),
(45, 5, '2022-06-06 00:00:00', '130.00', ''),
(46, 10, '2022-06-07 00:00:00', '150.00', ''),
(47, 70, '2022-06-07 00:00:00', '250.00', ''),
(48, 10, '2022-06-08 00:00:00', '150.00', ''),
(49, 10, '2022-06-08 00:00:00', '150.00', ''),
(50, 10, '2022-06-08 00:00:00', '150.00', ''),
(51, 10, '2022-06-08 00:00:00', '150.00', ''),
(52, 10, '2022-06-08 00:00:00', '150.00', ''),
(53, 5, '2022-06-08 00:00:00', '2000.00', ''),
(54, 5, '2022-06-09 00:00:00', '250.00', ''),
(55, 10, '2022-06-09 00:00:00', '150.00', ''),
(56, 8, '2022-06-10 00:00:00', '1800.00', ''),
(57, 10, '2022-06-10 00:00:00', '150.00', ''),
(58, 38, '2022-06-14 00:00:00', '2000.00', 'teste'),
(59, 38, '2022-06-15 00:00:00', '2000.00', 'fragil'),
(60, 38, '2022-06-17 00:00:00', '250.00', '');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_clientes`
--
ALTER TABLE `tb_clientes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `rg` (`rg`),
  ADD UNIQUE KEY `cpf` (`cpf`);

--
-- Índices para tabela `tb_fornecedores`
--
ALTER TABLE `tb_fornecedores`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cnpj` (`cnpj`);

--
-- Índices para tabela `tb_funcionarios`
--
ALTER TABLE `tb_funcionarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `rg` (`rg`),
  ADD UNIQUE KEY `cpf` (`cpf`);

--
-- Índices para tabela `tb_itensvendas`
--
ALTER TABLE `tb_itensvendas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `venda_id` (`venda_id`),
  ADD KEY `produto_id` (`produto_id`);

--
-- Índices para tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `descricao` (`descricao`),
  ADD KEY `for_id` (`for_id`);

--
-- Índices para tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cliente_id` (`cliente_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_clientes`
--
ALTER TABLE `tb_clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;

--
-- AUTO_INCREMENT de tabela `tb_fornecedores`
--
ALTER TABLE `tb_fornecedores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `tb_funcionarios`
--
ALTER TABLE `tb_funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de tabela `tb_itensvendas`
--
ALTER TABLE `tb_itensvendas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tb_itensvendas`
--
ALTER TABLE `tb_itensvendas`
  ADD CONSTRAINT `tb_itensvendas_ibfk_1` FOREIGN KEY (`venda_id`) REFERENCES `tb_vendas` (`id`),
  ADD CONSTRAINT `tb_itensvendas_ibfk_2` FOREIGN KEY (`produto_id`) REFERENCES `tb_produtos` (`id`);

--
-- Limitadores para a tabela `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD CONSTRAINT `tb_produtos_ibfk_1` FOREIGN KEY (`for_id`) REFERENCES `tb_fornecedores` (`id`);

--
-- Limitadores para a tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  ADD CONSTRAINT `tb_vendas_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `tb_clientes` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
