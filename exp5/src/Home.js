import {
  Stack,
  Flex,
  Button,
  Text,
  VStack,
  useBreakpointValue,
} from '@chakra-ui/react';
import { Link } from 'react-router-dom';

export default function Home() {
  return (
    <Flex
      w={'full'}
      h={'100vh'}
      backgroundImage={
        'url(https://media.istockphoto.com/photos/delhi-university-building-and-corridor-picture-id171271182?b=1&k=20&m=171271182&s=170667a&w=0&h=_Mj5FE_ZOZescLojulpJj8l5QV3umTrbQH_BUga_Edw=)'
      }
      backgroundSize={'cover'}
      backgroundPosition={'center center'}
    >
      <VStack
        w={'full'}
        justify={'center'}
        px={useBreakpointValue({ base: 4, md: 8 })}
        bgGradient={'linear(to-r, blackAlpha.600, transparent)'}
      >
        <Stack maxW={'2xl'} align={'flex-start'} spacing={6}>
          <Text
            color={'white'}
            fontWeight={700}
            lineHeight={1.2}
            fontSize={useBreakpointValue({ base: '3xl', md: '4xl' })}
          >
            Vivekanand Education Society's Institute of Technology
          </Text>
          <Stack direction={'row'}>
            <Button
              bg={'blue.400'}
              rounded={'full'}
              color={'white'}
              _hover={{ bg: 'blue.500' }}
              onClick={() => {
                window.location.href = 'https://vesit.ves.ac.in/';
              }}
            >
              Main Site
            </Button>
            <Button
              bg={'whiteAlpha.300'}
              rounded={'full'}
              color={'white'}
              _hover={{ bg: 'whiteAlpha.500' }}
            >
              <Link to="/profile">Profile</Link>
            </Button>
          </Stack>
        </Stack>
      </VStack>
    </Flex>
  );
}
