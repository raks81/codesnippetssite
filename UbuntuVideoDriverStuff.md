Check which video driver is in use:     
  sudo lshw -c video

$ sudo lshw -c video
[sudo] password for rakrao: 
  *-display               
       description: VGA compatible controller
       product: GK107GLM [Quadro K1000M]
       vendor: NVIDIA Corporation
       physical id: 0
       bus info: pci@0000:01:00.0
       version: a1
       width: 64 bits
       clock: 33MHz
       capabilities: pm msi pciexpress vga_controller bus_master cap_list rom
       configuration: driver=nouveau latency=0
       resources: irq:44 memory:f2000000-f2ffffff memory:e0000000-efffffff memory:f0000000-f1ffffff ioport:5000(size=128) memory:f3080000-f30fffff

